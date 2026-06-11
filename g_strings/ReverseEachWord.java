package g_strings;

public class ReverseEachWord {

	public static void reverse(String s) {
		String stringAns = "";
		int start = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				stringAns += revString(s.substring(start, i)) + " ";
				start = i + 1;
			}
		}

		stringAns += revString(s.substring(start));

		System.out.println(stringAns);
	}

	private static String revString(String s) {
		String str = "";
		for (int i = 0; i < s.length(); i++) {
			str = s.charAt(i) + str;
		}
		return str;
	}
}
