/* 
Print the following pattern for the given N number of rows.
Pattern for N = 4
1
21
321
4321
*/
package b_patterns;

import java.util.Scanner;

public class ReverseNumberPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {
			for (int j = i; j >= 1; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		sc.close();
	}
}
