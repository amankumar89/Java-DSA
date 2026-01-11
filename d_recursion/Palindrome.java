package d_recursion;

import java.util.Scanner;

public class Palindrome {

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		
		String str = s.nextLine();
		
		boolean isPalindrome = isPalindrome(str, 0, str.length() - 1);
		System.out.println(isPalindrome);
		
		s.close();
	}
	
	private static boolean isPalindrome(String s, int start, int end) {
		if(start >= end) return true;
		
		if(s.charAt(start) != s.charAt(end)) return false;
		
		return isPalindrome(s, start + 1, end - 1);
	}
}
