package g_strings;

public class RemoveCharacter {

	public static void remove(String s, char c) {
		if(s != null && !s.isEmpty()) {
			String str = "";
			for (int i = 0; i < s.length(); i++) {
				if(s.charAt(i) != c) {
					str += s.charAt(i);
				}
			}
			System.out.println(str);
		}
	}
}
