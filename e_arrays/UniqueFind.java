package e_arrays;

import java.util.Scanner;

public class UniqueFind {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		while (t-- > 0) {
			int size = sc.nextInt();

			int[] arr = new int[size];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			int unique = uniqueFindBest(arr);
			System.out.println(unique);
		}

		sc.close();
	}
	
	// O(n)
	public static int uniqueFindBest(int[] arr) {
		int unique = 0;
		for (int i = 0; i < arr.length; i++) {
			unique ^= arr[i];
		}
		return unique;
	}
	
	
	public static int uniqueFindSecond(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int j;
			for (j = 0; j < arr.length; j++) {
				if(i != j && arr[i] == arr[j]) break;
			}
			if(j == arr.length) return arr[i];
		}
		
		return Integer.MIN_VALUE;
	}

	public static int uniqueFindFirst(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if(arr[i] == arr[j]) count++;
			}
			if(count == 1) return arr[i];
		}
		
		return Integer.MIN_VALUE;
	}
}
