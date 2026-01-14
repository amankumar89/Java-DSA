package e_arrays;

import java.util.Scanner;

public class LargestElement {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int size = s.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
		
		int largestElement = findLargest(arr);
		System.out.println(largestElement);
		s.close();
	}

	public static int findLargest(int[] arr) {
		int largest = Integer.MIN_VALUE;
		
		if(arr.length <= 0) return largest;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > largest) largest = arr[i];
		}
		return largest;
	}
}
