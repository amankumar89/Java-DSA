package d_recursion;

import java.util.Scanner;

public class PrintTillN {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		printTillN(n);
		
		s.close();
	}
	
	private static void printTillN(int num) {
		if(num <= 0) return;
		
		printTillN(num - 1);
		System.out.print(num + " ");
	}

//	private static void printTillN(int start, int end) {
//		if(start > end) return;
//		
//		System.out.print(start +" ");
//		
//		printTillN(start + 1, end);
//	}
	
	
}
