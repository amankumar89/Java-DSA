package c_more_basics;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		
		System.out.println(isArmstrong(num));
		
		scanner.close();
	}

	private static boolean isArmstrong(int num) {
		int digitCount = findCount(num);
		int totalSum = 0;
		int tempNum = num;
		while(tempNum > 0) {
			int ld = tempNum % 10;
			totalSum += power(ld, digitCount);
			tempNum /= 10;
		}
		return num == totalSum;
	}

	private static int findCount(int num) {
		int count = 0;
		while(num != 0) {
			count++;
			num /= 10;
		}
		return count;
	}
	
	private static int power(int x, int n) {
		int ans = 1;
		while(n > 0) {
			ans *= x;
			n--;
		}
		return ans;
	}
}
