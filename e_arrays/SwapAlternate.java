package e_arrays;

import java.util.Scanner;

public class SwapAlternate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t-- > 0) {
			int size = sc.nextInt();
			
			int[] arr = new int[size];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			swapAlternate(arr);
			
			for (int i : arr) {
				System.out.print(i +" ");
			}
		}
		
		sc.close();
	}
	
	public static void swapAlternate(int[] arr) {
		int slow = 0, fast = 1;
		while(fast <= arr.length - 1) {
			int temp = arr[slow];
			arr[slow] = arr[fast];
			arr[fast] = temp;
			slow += 2;
			fast += 2;
		}
	}
}
