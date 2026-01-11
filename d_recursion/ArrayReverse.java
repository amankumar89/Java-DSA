package d_recursion;

import java.util.Scanner;

public class ArrayReverse {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int arr[] = new int[n];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
		
		reverseArray(arr, 0, arr.length - 1);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] +" ");
		}
		s.close();
	}

	private static void reverseArray(int[] arr, int left, int right) {
		if(left >= right) return;
		
		int temp = arr[left];
		arr[left] = arr[right];
		arr[right]= temp;
		
		reverseArray(arr, left + 1, right - 1);
	}
}
