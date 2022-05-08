package studentdatabaseapp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private List<String> courses = new ArrayList<>();
	private String studentID;
	private int greadeYear;
	private int tuitionBalance = 0;
	private static int costOfCourse = 600;
	private static int id = 1000;
	
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Student First Name : ");
		this.firstName = in.nextLine();
		System.out.print("Enter Student Last Name : ");
		this.lastName = in.nextLine();
		System.out.print("1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student class level: ");
		this.greadeYear = in.nextInt();
		setStudentID();
	}
	
	private void setStudentID() {
		id++;
		this.studentID = greadeYear + "" + id;
	}
	
	public void enroll() {
		
		System.out.println("Enter courde to enroll (Q to quit):");
		Scanner in = new Scanner(System.in);
		String course = in.nextLine();
		if(course != "Q") {
			courses.add(course);
			tuitionBalance =  tuitionBalance + costOfCourse;
		}
		System.out.println("Enrolled in: "+courses);
		System.out.println("Tuition Balance: "+tuitionBalance);
	}
}
