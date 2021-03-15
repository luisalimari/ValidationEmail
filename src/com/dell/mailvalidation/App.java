package com.dell.mailvalidation;

public class App {

	public static void main(String[] args) {
		String[] emails = {"luis_alimari@dell.com", "alimari79@gmail.com"};
		ValidateEmail mailValidator = new ValidateEmail();
		mailValidator.validateEmail(emails);
	}

}
