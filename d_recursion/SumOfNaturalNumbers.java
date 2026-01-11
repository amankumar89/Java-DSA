package d_recursion;

import java.util.Scanner;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		System.out.println(sumOfNaturalNumbers(n));;
		
		s.close();
	}

	private static int sumOfNaturalNumbers(int n) {
		if(n <= 0) return 0;
		
		return n + sumOfNaturalNumbers(n - 1);
	}
}
