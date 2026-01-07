/* 
Print the following pattern for the given N number of rows.
Pattern for N = 3
A
BB
CCC
*/
package b_patterns;

import java.util.Scanner;

public class AlphaPattern {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for (int row = 1; row <= num; row++) {
			for (int col = row; col >= 1; col--) {
				System.out.print((char)('A' + row - 1));
			}
			System.out.println();
		}
		
		sc.close();
	}
}
