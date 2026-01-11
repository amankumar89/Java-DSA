package d_recursion;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		System.out.println(factorial(n));
		
		s.close();
	}

	private static int factorial(int n) {
		if(n == 1) return 1;
		
		return n * factorial(n - 1);
	}
}
