package people; 
import java.util.*; 

public class Doctor {
	private int id; 
	private String name; 
	private String specialty; 
	private int fee; 
	private ArrayList<Patient> patients = new ArrayList<>(); 
	
	
	public int getId() {
		return id;
	} 
	
	public void setId(int id) {
		this.id = id;
	} 
	
	public String getName() {
		return name;
	} 
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSpecialty() {
		return specialty;
	} 
	
	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	} 
	
	public int getFee() {
		return fee;
	} 
	
	public void setFee(int fee) {
		this.fee = fee;
	}
	
	public List<Patient> getPatients(){
		return patients; 
	}

	public Doctor(int id, String name, String specialty, int fee) {
		this.id = id;
		this.name = name;
		this.specialty = specialty;
		this.fee = fee;
	} 
	
	public void addPatient(Patient p) {
		patients.add(p); 
	}
	
}
