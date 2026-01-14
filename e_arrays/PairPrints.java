package e_arrays;

import java.util.Scanner;

public class PairPrints {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		printPair(arr);
		
		sc.close();
	}

	private static void printPair(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.println(arr[i] +", " +arr[j]);
			}
		}
	}
}
