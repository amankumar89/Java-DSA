package a_learn_the_basics;

import java.util.Scanner;

public class DivisorPrint {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		
		printDivisor(num);
		
		scanner.close();
	}
	
	private static void printDivisor(int number) {
		for (int i = 1; i <= Math.sqrt(number); i++) {
			if(number % i == 0) System.out.print(i +" ");
		}
	}
}
