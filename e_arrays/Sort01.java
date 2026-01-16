package e_arrays;

import java.util.Scanner;

public class Sort01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t-- > 0) {
			int size = sc.nextInt();
			
			int[] arr = new int[size];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			
			sortArr(arr);
			
			for (int i : arr) {
				System.out.print(i +" ");
			}
		}
		
		sc.close();
	}
	
	public static void sortArr(int[] arr) {
		int i = 0, j = arr.length - 1;
		while(i <= j) {
			if(arr[i] == 0) i++;
			else if(arr[i] != 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j--;
			}
		}
	}
}
