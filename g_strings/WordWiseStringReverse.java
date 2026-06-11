package g_strings;

// Input: "Welcome to Java Code"
// Output: "Code Java to Welcome"
public class WordWiseStringReverse {
    public static void reverse(String s) {
        String str = "";
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' '){
                str = " " +s.substring(start, i) + str;
                start = i + 1;
            }
        }
        System.out.println(s.substring(start) + str);
    }
}
