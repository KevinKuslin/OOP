package actor; 
import academic.Course;
import uni.IAttendee;

import java.util.*; 

public class Lecturer extends Actor implements IAttendee{
	private String lecturerCode; 
	ArrayList<Course> courses = new ArrayList<>(); 
	ArrayList<IAttendee> students = new ArrayList<>(); 

	@Override 
	public String IgetLecturerCode() {
		return lecturerCode;
	}

	@Override 
	public String IgetDob(){
		return this.getDob(); 
	}

	@Override 
	public String IgetName(){
		return this.getName(); 
	}

	public void setLecturerCode(String lecturerCode) {
		this.lecturerCode = lecturerCode;
	}
	
	public List<Course> getCourse(){
		return courses; 
	}

	public Lecturer(String lecturerCode, String name, String dob) {
		super(name, dob);
		this.lecturerCode = lecturerCode;
	} 
	
	public void showCourse(int semester) {
		System.out.println(getName() + "'s Courses:"); 
		int courseCount = 1; 
		for(Course c : courses) {
			System.out.println("    " + courseCount + ".");
			System.out.println("    Name   : " + c.getCourseName()); 
			System.out.println("    Code   : " + c.getCourseCode()); 
			System.out.println("    Credit : " + c.getCredit());
			courseCount++; 
		}
	}
}