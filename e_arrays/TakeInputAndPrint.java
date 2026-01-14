package e_arrays;

import java.util.Scanner;

public class TakeInputAndPrint {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int size = scanner.nextInt();
		
		int[] arr = new int[size];
		
		// array as input
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		
		// printing array
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] +" ");
		}
		
		scanner.close();
	}
}
