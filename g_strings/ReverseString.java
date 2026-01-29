package g_strings;

public class ReverseString {

	public static String reverse(String s) {
		String str = "";
		
		for (int i = 0; i < s.length(); i++) {
			str = s.charAt(i) + str;
		}
		
		return str;
		
//		new StringBuilder(s).reverse().toString();
	}
}
