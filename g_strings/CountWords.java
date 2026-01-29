package g_strings;

public class CountWords {

	public static int count(String str) {
		int count = 0;
		if(str.length() <= 0) return count;
		
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ' ') count++;
		}
		
		return count + 1;
	}
}
