/*

Print the following pattern

Pattern for N = 4

   *
  ***
 *****
*******

 */


package c_patterns;

import java.util.Scanner;

public class StarPattern {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for (int row = 1; row <= num; row++) {
			// spaces
			int space = num - row;
			while(space >= 1) {
				System.out.print(" ");
				space--;
			}
			// print numbers
			for (int col = 1; col <= row; col++) {
				System.out.print("*");
			}
			for (int star = row-1; star < row; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();
	}
}
