package b_patterns;

/*
 
1234554321
1234**4321
123****321
12******21
1********1
  
*/

import java.util.Scanner;

public class NumberStarPattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int i = 1;
		while(i <= num) {
			int j = 1;
			// number
			while(j <= ( num - i) + 1) {
				System.out.print(j);
				j++;
			}
			// star
			int star = (2 * i) - 2;
			while(star >= 1) {
				System.out.print("*");
				star--;
			}
			j = j - 1;
			while(j >= 1) {
				System.out.print(j);
				j--;
			}
			System.out.println();
			i++;
		}
		
		sc.close();
	}
}
