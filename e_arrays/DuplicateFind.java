package e_arrays;

import java.util.Scanner;

public class DuplicateFind {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		while (t-- > 0) {
			int size = sc.nextInt();

			int[] arr = new int[size];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			int duplicate = duplicateFindFirst(arr);
			System.out.println(duplicate);
		}

		sc.close();
	}
	
	public static int duplicateFindBest(int[] arr) {
		int duplicate = 0;
		
		for (int i : arr) {
			duplicate ^= i;
		}
		
		for (int i = 1; i <= arr.length - 1; i++) {
			duplicate ^= i;
		}
		
		return duplicate;
	}

	public static int duplicateFindFirst(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(i != j && arr[i] == arr[j]) return arr[j];
			}
		}
		return Integer.MIN_VALUE;
	}
}
