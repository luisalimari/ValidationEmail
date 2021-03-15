package com.dell.mailvalidation;

import java.util.Scanner;

public class ValidateEmail {

	public boolean validateEmail(String[] emails) {
		boolean validated = false;
		
		System.out.print("Please enter the email you would like to search: ");
        Scanner scanner = new Scanner(System.in);
        String mail = scanner.next();
		
        for(int i = 0; i < emails.length; i++) {
        	if(emails[i].equalsIgnoreCase(mail)) {
        		System.out.println("Email found and validated sucesffuly!");
        		return true;
        	}
        }
        
        if(validated == false) {
        	System.out.println("The email was not found to be validated.");
        }
        
		return validated;
	}

}
