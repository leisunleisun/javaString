package javaString;

import java.util.Scanner;

public class Palindrome {

	public static void main(String args[]) { 
		System.out.println("Enter a sentence :");
	      Scanner sc = new Scanner(System.in);
	      String sentence = sc.nextLine();
		System.out.println("result: " + isPalindromString(sentence)); 
		 } 
	/** * Java method to check if given String is Palindrome * @param text * @return true if text is palindrome, otherwise false */ 
	public static boolean isPalindromString(String text){ 
		String reverse = reverse(text); 
		if(text.equals(reverse))
		{ return true; } 
	return false; } /** * Java method to reverse String using recursion * @param input * @return reversed String of input */ 
	public static String reverse(String input){ if(input == null || input.isEmpty()){ return input; } return input.charAt(input.length()- 1) + reverse(input.substring(0, input.length() - 1)); }

	//**https://www.java67.com/2015/06/how-to-check-is-string-is-palindrome-in.html#:~:text=When%20the%20call%20to%20reverse,means%20String%20is%20a%20palindrome.**//
	
}
