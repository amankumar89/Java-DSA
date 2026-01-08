package a_learn_the_basics;

import java.util.Scanner;

public class NumberReverse {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int num = s.nextInt();
		
		System.out.println(reverseNumber(num));
		s.close();
	}
	
	public static int reverseNumber(int number) {
		int revNumber = 0;
		while(number != 0) {
			int lastDigit = number % 10;
			revNumber = (revNumber * 10) + lastDigit;
			number /= 10;
		}
		return revNumber;
	}
	
}
