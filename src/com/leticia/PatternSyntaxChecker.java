package com.leticia;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternSyntaxChecker {

	static void check(String pattern){
		try {
			Pattern.compile(pattern);
			System.out.println("Valid");
		} catch (PatternSyntaxException e) {
			System.out.println("Invalid");
		}
	}

	public static void main(String[] args){

		ArrayList<String> testCases = new ArrayList<>();
		testCases.add("([A-Z])(.+)");
		testCases.add("[AZ[a-z](a-z)");
		testCases.add("batcatpat(nat");

		for (String pattern : testCases) {
			PatternSyntaxChecker.check(pattern);
		}

	}

}
