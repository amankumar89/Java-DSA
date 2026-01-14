package e_arrays;

import java.util.Scanner;

//Problem statement
//You have been given an empty array(ARR) and its size N. The only input taken from the user will be N and you need not worry about the array.
//Your task is to populate the array using the integer values in the range 1 to N(both inclusive) in the order - 1,3,5,.......,6,4,2.

public class ArrangeArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t-- > 0) {			
			int num = sc.nextInt();
			int[] arr = new int[num];
			
			arrangeArray(arr, num);
			
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] +" ");
			}
		}
		
		sc.close();
	}

	private static void arrangeArray(int[] arr, int n) {
		int left = 0, right = arr.length-1;
		int i = 1;
		while(left <= right) {
			if(i % 2 != 0) arr[left++] = i++;
			else arr[right--] = i++;
		}
	}
}
