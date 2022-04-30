package emailapps;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String alternateEmail;
	private int mailboxCapacity;
	
	public Email(String firstName,String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("Email Created: " + this.firstName + " " + this.lastName);
		this.department = setDepartment();
		System.out.println("Department: "+this.department);
	}
	
	private String setDepartment() {
		System.out.print("Department Codes\nEnter the department\n1 for Sales\n2 for Development\3 for Accounting\n0 for none\nEnter department code:");
		Scanner in =new Scanner(System.in);
		int depChoice = in.nextInt();
		if(depChoice == 1) { return "Sales"; }
		else if(depChoice == 2) { return "Development"; }
		else if(depChoice == 3) { return "Accounting"; }
		else { return ""; }
	}
}
