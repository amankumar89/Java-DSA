package e_arrays;

import java.util.Scanner;

public class TripletSum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int t = scanner.nextInt();
		
		while(t-- > 0) {
			int size = scanner.nextInt();
			int[] arr = new int[size];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = scanner.nextInt();
			}
			int k = scanner.nextInt();
			int result = tripletSumOptimised(arr, k);
			System.out.println(result);
		}
		
		scanner.close();
	}

	public static int tripletSumOptimised(int[] arr, int k) {
		int count = 0;
		for (int i = 0; i < arr.length - 2; i++) {
			for (int j = i + 1; j < arr.length - 1; j++) {
				for (int j2 = j + 1; j2 < arr.length; j2++) {
					int sum = arr[i] + arr[j] + arr[j2];
					if(sum == k) count++;
				}
			}
		}
		return count;
	}
}
