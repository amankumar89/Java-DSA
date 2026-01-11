package d_recursion;

import java.util.Scanner;

public class NthFibonacciNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int fibNumber = nthFibNumber(num);
		
		System.out.println(fibNumber);
		
		sc.close();
	}
	
	private static int nthFibNumber(int num) {
		if(num == 0 || num == 1) return num;
		
		return nthFibNumber(num - 1) + nthFibNumber(num -2);
	}
}
