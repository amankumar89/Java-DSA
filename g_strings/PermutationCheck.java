package g_strings;

public class PermutationCheck {
    public static Boolean checkBruteForce(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        char[] char1 = s1.toCharArray();
        char[] char2 = s2.toCharArray();

        for (int i = 0; i < char1.length; i++) {
            if (char1[i] != char2[i]) return false;
        }
        return true;
    }
}
