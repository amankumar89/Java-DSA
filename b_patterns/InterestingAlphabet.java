/* 
Print the following pattern for the given number of rows.

Pattern for N = 5
E
DE
CDE
BCDE
ABCDE
*/
package b_patterns;

import java.util.Scanner;

public class InterestingAlphabet {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for (int row = 0; row < num; row++) {
			char c = (char) ('A' + num - row - 1);
			for (int col = 0; col <= row; col++) {
				System.out.print((char)(c + col));
			}
			System.out.println();
		}
		
		sc.close();
	}
}
