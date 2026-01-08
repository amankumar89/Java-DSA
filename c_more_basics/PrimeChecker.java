package a_learn_the_basics;

import java.util.Scanner;

public class PrimeChecker {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		
		System.out.println(isPrime(num));
		
		scanner.close();
	}
	
	private static boolean isPrime(int num) {
		if(num <= 1) return false;
		int div = 2;
		while(div <= Math.sqrt(num)) {
			if(num % div == 0) return false;
			div++;
		}
		
		return true;
	}
}
