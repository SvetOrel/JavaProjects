package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number of students: ");
		int numOfStudents = in.nextInt();
		StudentsCreator(numOfStudents);
		
	}
	
	public static void  StudentsCreator(int numOfStudents) {
		if(numOfStudents > 0) {
			for(int i = 0 ; i < numOfStudents ; i++) {
				Student std = new Student();
			}
		}
	}
}
