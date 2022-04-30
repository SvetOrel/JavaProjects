package emailapps;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private String alternateEmail;
	private String companySuffix = "TestCompany.com";
	private int mailboxCapacity = 500;
	private int defaultPasswordLength = 8;
	
	public Email(String firstName,String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = setDepartment();
		this.password = randomPassword(defaultPasswordLength);
		
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
	}
	
	private String setDepartment() {
		System.out.print("Department Codes\nEnter the department\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code:");
		Scanner in =new Scanner(System.in);
		int depChoice = in.nextInt();
		if(depChoice == 1) { return "Sales"; }
		else if(depChoice == 2) { return "Development"; }
		else if(depChoice == 3) { return "Accounting"; }
		else { return ""; }
	}
	
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUWXYZ0123456789!@#$%";
		char[] password = new char[length];
		for(int i = 0 ; i < length ; i++) {
			int rand = (int)(Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	public void setMailBoxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	public void changePassword(String password) {
		this.password = password;
	}
	
	public int getMailBoxCapacity() {
		return mailboxCapacity;
	}
	
	public String getAlternateEmail() {
		return alternateEmail;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getMessage() {
		return  "Display Name: " + firstName + " " + lastName +
				"\nCompany Level: " + email +
				"\nMailbox Capacity: " + mailboxCapacity + "mb";
	}
}
