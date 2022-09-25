package com.userRegistration;

import java.util.regex.Pattern;

public class RegexPasswardWithOneUpperCaseAndNumberAndSpecialChar {
	
	public static void  main(String[] args) {
		String passwardRegex = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$";
		String passward = "anpur09@Aryan";
		boolean result = Pattern.matches(passwardRegex, passward);
		
		System.out.println(result);
	}

}
