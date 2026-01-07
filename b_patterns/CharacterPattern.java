/* 
Print the following pattern for the given N number of rows.

Pattern for N = 4
A
BC
CDE
DEFG
*/
package b_patterns;

import java.util.Scanner;

public class CharacterPattern {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for (int row = 0; row < num; row++) {
			char c = (char)('A' + row);
			for (int col = 0; col <= row; col++) {
				System.out.print((char)(c + col));
			}
			System.out.println();
		}
		
		sc.close();
	}
}
