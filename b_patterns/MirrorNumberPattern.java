/* 
 Print the following pattern for the given N number of rows.
 Pattern for N = 4
    1
   12
  123
 1234
*/
package b_patterns;

import java.util.Scanner;

public class MirrorNumberPattern {

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
				System.out.print(col);
			}
			System.out.println();
		}
		
		sc.close();
	}
}
