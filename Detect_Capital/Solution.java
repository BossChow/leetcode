import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) {
        String testString = "leetcode";
        boolean result = detectCapital(testString);
        System.out.println("Input: " + testString);
        System.out.println("Output: " + result);
    }

    private static boolean detectCapital(String input) {
        String regex = "\\b[A-Z]+\\b|\\b[a-z]+\\b|\\b[A-Z][a-z]+\\b";
        final Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        return matcher.find();
    }
}
