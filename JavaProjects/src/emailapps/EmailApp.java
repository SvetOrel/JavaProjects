package emailapps;

import java.util.Scanner;

public class EmailApp {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.print("First Name:");
		String firstName = in.next();
		System.out.print("\nLast Name:");
		String lastName = in.next();
		
		Email em1 = new Email(firstName,lastName);
		System.out.println(em1.getMessage());

	}
}
