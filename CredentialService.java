package com.it.support.gl;
import java.util.Random;

public class CredentialService {
	String emailId;

	public char[] generatePassword() {
		String capitalLetter = "ABCDEFGHIJKLMNOPQRSSTUVWXYZ";
		String lowerLetter = "abcdefghijklmnopqrstuvwxyz";
		String specialcharacter = "!@#$%^&*";
		String numbers = "1234567890";
		String combined	= capitalLetter+lowerLetter+specialcharacter+numbers;
		Random random = new Random();
		char[] password = new char [8];
		for (int i = 0; i<8;i++) {
			password[i] = combined.charAt(random.nextInt(combined.length()));
		}
		return password;
		
		}
	public String genrateEmailaddress(String firstName, String lastName, String department) {
		emailId = firstName + lastName + "@" + department +".gl.com";
		return emailId;
	}
	public void showCredntials(String emailId, char[] generatePassword) {
		System.out.println("Email  --->" + emailId);
		System.out.println("Password --->" + generatePassword);
	}
}

