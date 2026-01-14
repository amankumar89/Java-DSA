package e_arrays;

import java.util.Scanner;

public class TakeInput {

	public static int[] input() {
		Scanner s = new Scanner(System.in);
		
		int size = s.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
		
		s.close();
		return arr;
	}
}
