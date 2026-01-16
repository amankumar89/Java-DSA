package e_arrays;

import java.util.Scanner;

public class IntersectionOfArrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		while (t-- > 0) {

			int n1 = sc.nextInt();
			int[] arr1 = new int[n1];
			for (int i = 0; i < arr1.length; i++) {
				arr1[i] = sc.nextInt();
			}
			
			int n2 = sc.nextInt();
			int[] arr2 = new int[n2];
			for (int i = 0; i < arr2.length; i++) {
				arr2[i] = sc.nextInt();
			}
			
			printIntersection(arr1, arr2);
			
		}

		sc.close();
	}

	private static void printIntersection(int[] arr1, int[] arr2) {
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if(arr1[i] == arr2[j]) {
					System.out.print(arr1[i] +" ");
					arr2[j] = Integer.MIN_VALUE;
					break;
				}
			}
		}
	}
}
