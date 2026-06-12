package g_strings;

public class CompressedString {

	public static void find(String s) {
		if(s != null && !s.isEmpty()) {
			StringBuilder str = new StringBuilder();
			char ch = s.charAt(0);
			str.append(ch);
			int count = 1;
			
			for (int i = 1; i < s.length(); i++) {
				if(s.charAt(i) == ch) {
					count++;
				} else {
					if(count > 1) str.append(count);
					ch = s.charAt(i);
					str.append(ch);
					count = 1;
				}
			}
			if(count > 1) str.append(count);
			System.out.println(str);
		}
	}
}
