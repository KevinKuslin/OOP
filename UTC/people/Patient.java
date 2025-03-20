package people; 
import java.util.*; 

public class Patient {
	private int id; 
	private String name; 
	private int age; 
	private ArrayList<String> medicalRecords = new ArrayList<>(); 
	private int totalSpent = 0; 
	
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
	
	public int getAge() {
		return age;
	} 
	
	public void setAge(int age) {
		this.age = age;
	} 
	
	public ArrayList<String> getMedicalRecords() {
		return medicalRecords;
	} 
	
	public void setMedicalRecords(ArrayList<String> medicalRecords) {
		this.medicalRecords = medicalRecords;
	} 
	
	public int getTotalSpent() {
		return totalSpent;
	} 
	
	public void setTotalSpent(int totalSpent) {
		this.totalSpent = totalSpent;
	}

	public Patient(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	} 
	
	public void addMedicalRecord(String record) {
		
	}
	
}
