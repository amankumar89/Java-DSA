/*
 
Print the following pattern for the given N number of rows.
Pattern for N = 4
1
22
333
4444
 
*/
package b_patterns;

import java.util.Scanner;
public class TraingularNumberPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for (int i = 0; i < num; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(i + 1);
			}
			System.out.println();
		}
		
		sc.close();
	}
}
