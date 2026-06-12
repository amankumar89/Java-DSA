package g_strings;

public class RemoveConsecutiveDuplicates {

	public static void remove(String s) {
		if(s != null && !s.isEmpty()) {			
			String str = "";
			str += s.charAt(0);
			char prevChar = s.charAt(0);
			for (int i = 1; i < s.length(); i++) {
				if(s.charAt(i) != prevChar) {
					char currChar = s.charAt(i);
					str += currChar;
					prevChar = currChar;
				}
			}
			System.out.println(str);
		}
	}
}
