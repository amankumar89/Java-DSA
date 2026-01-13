package c_more_basics;

import java.util.Scanner;

public class FibonaciMember {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		System.out.println(isFibMember(num));
		
		sc.close();
	}
	
	private static boolean isFibMember(int num) {
		
		if(num == 0) return true;
		
		int a = 0, b = 1, c = a + b;
		
		for (int i = 3; i <= num; i++) {
			a = b;
			b = c;
			c = a + b;
			if(c == num) return true;
		}
		
		return c == num;
	}
}
