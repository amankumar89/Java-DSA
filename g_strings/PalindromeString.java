package g_strings;

public class PalindromeString {

	public static Boolean check(String s) {
		String str = "";
		
		for (int i = 0; i < s.length(); i++) {
			str = s.charAt(i) + str;
		}

		return (str.equals(s));
		
//		String reversed = new StringBuilder(s).reverse().toString();
//		return reversed.equals(s);
	}
	
	public static Boolean checkBetter(String s) {
		int left = 0, right = s.length() - 1;
		while(left < right) {
			if(s.charAt(left) != s.charAt(right)) return false;
			
			left++;
			right--;
		}
		
		return true;
	}
}
