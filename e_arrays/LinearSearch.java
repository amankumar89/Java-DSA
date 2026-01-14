package e_arrays;


import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		int t = sc.nextInt();
		
		while(t != 0) {
			int size = sc.nextInt();
			int[] arr = new int[size];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			int x = sc.nextInt();
			int ans = linearSearch(arr, x);
			System.out.println(ans);
			t--;
		}
		sc.close();
	}
	
	// return existing value index
	public static int linearSearch(int[] arr, int x) {
		int index = -1;
		if(arr.length == 0) return index;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == x) return i;
		}
		return -1;
	}
}
