package actor; 
import java.util.*; 
import academic.Course;
import uni.IAttendant; 

public class Student extends Actor implements IAttendant{
	private String nim; 
	private int credits = 0; 

	public String getNim() {
		return nim;
	}

	public void setNim(String nim) {
		this.nim = nim;
	}

	public Student(String nim, String name, String dob) {
		super(name, dob);
		this.nim = nim;
	}
	
	public void addCredits(List<Course> courses) {
		for(Course c : courses) {
			setCredits(getCredits() + c.getCredit()); 
		}
	}

	public void showCredits(int semester) {
		System.out.println(getName() + " has " + credits + " credits!"); 
		System.out.println();
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}
	
	
	
}
