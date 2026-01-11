package d_recursion;

import java.util.Scanner;

public class PrintNTo1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		printTillOne(n);
		
		s.close();
	}

	private static void printTillOne(int n) {
		if(n <= 0) return;
		
		System.out.print(n +" ");
		printTillOne(n - 1);
	}
	
	
}
