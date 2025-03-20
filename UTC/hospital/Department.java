package hospital;
import java.util.*; 
import people.*; 

public class Department {
	private String name; 
	private Doctor headDoctor; 
	private ArrayList<Doctor> doctors = new ArrayList<>(); 
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Doctor getHeadDoctor() {
		return headDoctor;
	}
	
	public void setHeadDoctor(Doctor headDoctor) {
		this.headDoctor = headDoctor;
	}
	
	public ArrayList<Doctor> getDoctors() {
		return doctors;
	}
	
	public void setDoctors(ArrayList<Doctor> doctors) {
		this.doctors = doctors;
	}

	public Department(String name) {
		this.name = name;
	} 
	
	
	
}
