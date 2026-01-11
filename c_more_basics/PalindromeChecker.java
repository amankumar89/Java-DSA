package c_more_basics;

import java.util.Scanner;

public class PalindromeChecker {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int num = s.nextInt();
		
		System.out.println(checkPalindrome(num));
		s.close();
	}

	private static boolean checkPalindrome(int num) {
		int tempNum = num;
		
		int revNum = 0;
		while(tempNum > 0) {
			int ld = tempNum % 10;
			revNum = (revNum * 10) + ld;
			tempNum /= 10;
		}
		return revNum == num;
	}
	
}
