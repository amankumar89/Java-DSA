/*
 
Print the following pattern for the given N number of rows.

Pattern for N = 4
4444
333
22
1
  
 */

package c_patterns;

import java.util.Scanner;

public class InvertedNumberPattern {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for (int row = num; row >= 1; row--) {
			// print numbers
			for (int col = row; col >= 1; col--) {
				System.out.print(row);
			}
			System.out.println();
		}
		
		sc.close();
	}
}
