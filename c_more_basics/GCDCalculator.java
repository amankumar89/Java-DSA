package a_learn_the_basics;

import java.util.Scanner;

public class GCDCalculator {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int firstNum = s.nextInt();
		int secondNum = s.nextInt();
		
		System.out.println(gcdCalculate(firstNum, secondNum));
		
		s.close();
	}
	
	private static int gcdCalculate(int a, int b) {
		while(b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return Math.abs(a);
	}
}
