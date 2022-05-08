package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number of students: ");
		int numOfStudents = in.nextInt();
		StudentsCreator(numOfStudents,in);
		
	}
	
	public static void  StudentsCreator(int numOfStudents,Scanner in) {
		if(numOfStudents > 0) {
			for(int i = 0 ; i < numOfStudents ; i++) {
				System.out.print("\nStudent Name : ");
				String name = in.next();
				System.out.print("\nStudents Year: ");
				String year = in.next();
				Student std = new Student(name,year);
			}
		}
	}
}
