package c_more_basics;

import java.util.Scanner;

public class FahrenheitToCelcius {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int start = sc.nextInt();
		int end = sc.nextInt();
		int size = sc.nextInt();
		
		printFahrenheitToCelcius(start, end, size);
		
		sc.close();
	}

	private static void printFahrenheitToCelcius(int start, int end, int size) {
		for (int i = start; i <= end; i += size) {
			int ans = (5 * (i - 32)) / 9;
			System.out.println(i +"\t" +ans);
		}
	}
}
