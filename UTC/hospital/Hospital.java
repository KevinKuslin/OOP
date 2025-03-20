package hospital; 
import java.util.*;

import main.Main;
import people.*; 

public class Hospital {
	private String name; 
	private ArrayList<Department> departments = new ArrayList<>(); 
	private ArrayList<Patient> patients = new ArrayList<>(); 
	private int income; 
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public ArrayList<Department> getDepartments() {
		return departments;
	}
	
	public void setDepartments(ArrayList<Department> departments) {
		this.departments = departments;
	}
	
	public ArrayList<Patient> getPatients() {
		return patients;
	}
	
	public void setPatients(ArrayList<Patient> patients) {
		this.patients = patients;
	}

	public Hospital(String name) {
		this.name = name;
	} 
	
	public void addDepartment(Department d) {
		departments.add(d); 
	}
	
	public void registerPatient(Patient p) {
		patients.add(p); 
	}
	
	public void processVisit(Patient p, Doctor d, String visitDetails) {
		p.getMedicalRecords().add(visitDetails); 
		income += d.getFee(); 
		p.setTotalSpent(p.getTotalSpent() + d.getFee()); 
		for(Department department : departments) {
			if(department.getHeadDoctor() == d) {
				d.getPatients().add(p); 
				break; 
			}
		}
	}
	
	public void displayHospitalInfo() {
		System.out.println("Hospital " + name); 
		System.out.println();
		System.out.println("Departments:"); 
		for(Department department : departments) {
			System.out.println("- " + department.getName() + "(Head Doctor: " + department.getHeadDoctor().getName() + ")"); 
		}
		System.out.println(); 
		System.out.println("Doctors"); 
		for(Department department : departments) {
			ArrayList<Patient> printedPatient = new ArrayList<>(); 
			Doctor doctor = department.getHeadDoctor(); 
			System.out.println("- " + doctor.getName() + " (Specialty: " + doctor.getSpecialty() + ", Fee: " + Main.formatIDR(doctor.getFee()) + ")"); 
			System.out.println("  Patients:"); 
			for(Patient patient : doctor.getPatients()) {
				if(printedPatient.contains(patient)) continue; 
				printedPatient.add(patient); 
				System.out.println("   - " + patient.getName() + " (Age: " + patient.getAge() + ")"); 
			}
		}
		
		System.out.println(); 
		System.out.println("Patients:"); 
		for(Patient patient : patients) {
			ArrayList<Patient> printedPatients = new ArrayList<>(); 
			System.out.println("- " + patient.getName() + " (ID: " + patient.getId() + ", Age: " + patient.getAge() + ")"); 
			System.out.println("  Medical Records:"); 
			for(Department department : departments) {
				Doctor doctor = department.getHeadDoctor(); 
				for(Patient patient2 : doctor.getPatients()) {
					if(patient2.getName().equals(patient.getName())) {
						if(printedPatients.contains(patient2)) continue; 
						printedPatients.add(patient); 
						for(String record : patient2.getMedicalRecords()) {
							System.out.println("   - Visited " + doctor.getName() + " for " + record + " (Cost: " + Main.formatIDR(doctor.getFee())); 
						}
						System.out.println("  Total Spent: " + Main.formatIDR(patient2.getTotalSpent())); 
					}
				}
			}
			System.out.println(); 
		}
		System.out.println(); 
		System.out.println("Total Hospital Income: " + Main.formatIDR(income)); 
	}
	
}
