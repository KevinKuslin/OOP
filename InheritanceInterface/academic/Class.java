package academic; 
import actor.Lecturer;
import actor.Student;
import uni.IAttendant;
import uni.IAttendee;

import java.util.*;

public class Class {
	private String classCode; 
	private int year; 
	private String semester; 
	ArrayList<Course> courses = new ArrayList<>(); 
	ArrayList<Student> students = new ArrayList<>(); 
	
	ArrayList<Student> attendingStd = new ArrayList<>(); 
	ArrayList<Student> attendedStd = new ArrayList<>(); 
	
	public String getClassCode() {
		return classCode;
	}
	public void setClassCode(String classCode) {
		this.classCode = classCode;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getSemester() {
		return semester;
	}
	public void setSemester(String semester) {
		this.semester = semester;
	}
	
	public Class(String classCode, int year, String semester) {
		this.classCode = classCode;
		this.year = year;
		this.semester = semester;
	}
	
	public void addCourse(Course co1) {
		courses.add(co1); 
	}
	
	public void addStudent(Student student) {
		students.add(student); 
		student.addCredits(courses); 
	}
	
	public void addLecturer(Lecturer lec1, Course co1) {
		lec1.getCourse().add(co1); 
	} 
	
	public void attend(IAttendant iattendant) {
		Student std = (Student) iattendant; 
		attendingStd.add(std); 
	}
	
	public void takeAttendance(IAttendee iattendee) {
		Lecturer lec = (Lecturer) iattendee;  
		for(Student std: attendingStd) {
			attendedStd.add(std); 
			lec.getStudent().add(std); 
		}
	}
	
	public void showTodayAttendance() {
		System.out.println("Class: " + classCode ); 
		System.out.println("Year: " + year + ", Semester: " + semester); 
		System.out.println(); 
		
		System.out.println("Courses: "); 
		int courseCount = 1; 
		for(Course c : courses) {
			System.out.println("    " + courseCount + ".");
			System.out.println("    Name   : " + c.getCourseName()); 
			System.out.println("    Code   : " + c.getCourseCode()); 
			System.out.println("    Credit : " + c.getCredit());
			courseCount++; 
		}
		System.out.println();
		
		System.out.println("Attended Students:"); 
		int attendedStdCount = 1; 
		for(Student std : attendedStd) {
			System.out.println("    " + attendedStdCount + ".");
			System.out.println("    Name   : " + std.getName()); 
			System.out.println("    NIM    : " + std.getNim()); 
			System.out.println("    DoB    : " + std.getDob());
			attendedStdCount++; 
		}
		System.out.println();
	}
}
