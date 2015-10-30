package com.prashant.bloomberg.practice;

public class StringRunCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(maxRun("aaabbbbbbbbcccccc"));
	}

	public static int maxRun(String testString) {
		int len = testString.length();
		String substr = "";
		for (int i = 0; i < len;) {
			char current = testString.charAt(i);
			String tempSubstr = "" + current;
			while ((i + 1) < len && (current == testString.charAt(i + 1))) {
				tempSubstr = tempSubstr + testString.charAt(++i);
			}

			if (tempSubstr.length() >= substr.length()) {
				substr = tempSubstr;

			}
			i += 1;
		}
		System.out.println(substr);
		return substr.length();
	}

}
