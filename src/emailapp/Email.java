package emailapp;

import java.util.Scanner;

public class Email {
	
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailboxCapacity = 500;
	private String alternateEmail;
	private int defaultPasswordLength = 8;
	private String email;
	private String companySuffix = "@company.com";
	
	// Constructor receive the first name and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		
		// Call a method asking for the department - return the department
		this.department = setDepartment();
		
		// Call a method that returns a random password
		this.password = randomPassword(defaultPasswordLength);
		
		// Combine elements to generate email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + companySuffix;
	}
	
	// Ask for the department
	private String setDepartment() {
		System.out.print("New Worker: " + firstName + ". Department Codes\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");
			Scanner sc = new Scanner(System.in);
			int deptChoice = sc.nextInt();
			if (deptChoice == 1) {
				return "sales";
			}
			else if (deptChoice == 2) {
				return "dev";
			}
			else if (deptChoice == 3) {
				return "acct";
			}
			else {
				return "";
			}
	}
	
	// Generate a random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyz!@#$%^&*";
		// char[] password = new char[length];
		String password = "";
		for (int i = 0; i < length; i++) {
			int random = (int) (Math.random() * passwordSet.length());
			// password[i] = passwordSet.charAt(random);
			password += passwordSet.charAt(random);
		}
		// return new String(password);
		return password;
	}
	
	// Set the mailbox capacity
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	
	//Set the alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	// Change the password
	public void changePassword(String password) {
		this.password = password;
	}
	
	public int getMailboxCapacity() {
		return mailboxCapacity;
	}
	
	public String getAlternateEmail() {
		return alternateEmail;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String showInfo() {
		return "Display Name: " + firstName + "." + lastName +
				"\nCompany Email: " + email +
				"\nMailbox Capacity: " + mailboxCapacity + "mb";
	}

}
