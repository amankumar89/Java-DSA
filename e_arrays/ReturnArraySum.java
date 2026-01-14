package e_arrays;

import java.util.Scanner;

public class ReturnArraySum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	
		int size = s.nextInt();
		
		int[] arr = new int[size];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
		
		int sum = sumOfArray(arr);
		
		System.out.println(sum);
		s.close();
	}
	
	public static int sumOfArray(int[] arr) {
		if(arr.length <= 0) return 0;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
}
