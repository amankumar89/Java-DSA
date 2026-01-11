package c_more_basics;

import java.util.Scanner;

public class DigitCounter {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		System.out.println(countDigit(n));
		s.close();
	}
	
	public static int countDigit(int num) {
		int count = 0;
		while(num > 0) {
			count += 1;
			num /= 10;
		}
		return count;
	}
}
