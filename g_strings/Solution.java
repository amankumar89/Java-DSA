package g_strings;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String str = s.nextLine();
		
//		System.out.println(CountWords.count(str));
		SubstringPrint.print(str);
		s.close();
	}
}
