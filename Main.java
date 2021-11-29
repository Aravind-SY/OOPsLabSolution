package com.it.support.gl;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Employee employee = new Employee("Aravind" , "babu");
		CredentialService cs = new CredentialService();
		System.out.println("Please choose the department");
		System.out.println(" 1. Technical \n 2. Admin \n 3. Human Resource \n 4. Legal");
		String department;
		String emailId;
		char[] generatePassword;
		Scanner sc = new Scanner(System.in);
		int choose = sc.nextInt();
		
		System.out.println("Dear" +employee.firstName + "your credential are :");
		switch(choose) {
		case 1: 
			department = "tech";
			emailId = cs.genrateEmailaddress(employee.firstName,employee.lastName,department);
			generatePassword = cs.generatePassword();
			cs.showCredntials(emailId,generatePassword);
			break;
		case 2:
			department = "adm";
			emailId = cs.genrateEmailaddress(employee.firstName,employee.lastName,department);
			generatePassword = cs.generatePassword();
			cs.showCredntials(emailId,generatePassword);
			break;
		case 3:
			department = "hr";
			emailId = cs.genrateEmailaddress(employee.firstName,employee.lastName,department);
			generatePassword = cs.generatePassword();
			cs.showCredntials(emailId,generatePassword);
			break;
		case 4:
			department = "lgl";
			emailId = cs.genrateEmailaddress(employee.firstName,employee.lastName,department);
			generatePassword = cs.generatePassword();
			cs.showCredntials(emailId,generatePassword);
			break;
		}

	}

}
