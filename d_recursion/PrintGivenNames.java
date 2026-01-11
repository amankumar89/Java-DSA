package d_recursion;

import java.util.Scanner;

public class PrintGivenNames {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String name = s.nextLine();
		
		int n = s.nextInt();
		
		printName(n, name);
		
		s.close();
	}

	private static void printName(int n, String name) {
		if(n <= 0) return;
		
		System.out.println(name);
		
		printName(n - 1, name);
	}
}
