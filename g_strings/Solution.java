package g_strings;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String str = s.nextLine();
//		StringCharacterPrint
//		CountWords.count(str)
//		ReverseString.reverse(str);
//		PalindromeString.checkBetter(str);
//		SubstringPrint.print(str);
//		ReverseEachWord.reverse(str);
//		WordWiseStringReverse.reverse(str);
//		PermutationCheck.checkBruteForce("abcde", "dcaeb");
//		RemoveConsecutiveDuplicates.remove(str);
//		RemoveCharacter.remove(str, 'y');
//		HighestOccuringChar.find(str);
		CompressedString.find(str);
		s.close();
	}
}
