package g_strings;

public class HighestOccuringChar {

	public static void find(String s) {
		int[] freq = new int[256];
		
		for (int i = 0; i < s.length(); i++) {
			int index = (char) s.charAt(i);
			freq[index] += 1;
		}
		
		int max = freq[0];
		int maxIndex = 0;
		for (int i = 1; i < freq.length; i++) {
			if(freq[i] > max) {
				max = freq[i];
				maxIndex = i;
			}
		}
		System.out.println((char)(maxIndex));
	}
}
