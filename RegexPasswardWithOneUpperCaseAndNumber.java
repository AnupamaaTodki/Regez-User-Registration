package com.userRegistration;

import java.util.regex.Pattern;

public class RegexPasswardWithOneUpperCaseAndNumber {
	
	public static void  main(String[] args) {
		String passwardRegex = "^(?=.*[A-Z])(?=.*[0-9])[A-Za-z\\d]{8,}$";
		String passward = "anpur09Aryan";
		boolean result = Pattern.matches(passwardRegex, passward);
		
		System.out.println(result);
	}

}
