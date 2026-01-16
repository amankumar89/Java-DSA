package e_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PairSum {

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
			int totalSumCount = pairSumOptimised(arr, k);
			System.out.println(totalSumCount);
		}
		
		scanner.close();
	}
	
	public static int pairSumOptimised(int[] arr, int target) {
		Arrays.sort(arr);
        int left = 0, right = arr.length - 1;
        int count = 0;
        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                count++;
                left++;
                right--;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return count;
	}

	public static int pairSum(int[] arr, int target) {
		int count = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if(arr[i] + arr[j] == target) count++;
			}
		}
		return count;
	}
}
