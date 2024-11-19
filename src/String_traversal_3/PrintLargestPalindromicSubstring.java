/* Print the largest palindromic substring of a given string.

Input Format
The input consists of a single line containing a string, `str`.

Output Format
A single line containing the largest palindromic substring of the input string.

Sample Inputs & Outputs
Sample Input 1
babad
Sample Output 1
bab
Sample Input 2
tapa
Sample Output 2
apa
Constraints
The string consists of lowercase alphabets only.

The length of the string is at least 1 and at most 1000. */
package String_traversal_3;

import java.util.Scanner;

public class PrintLargestPalindromicSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String result = findLargestPalindromicSubstring(str);
        System.out.println(result);
        scanner.close();
    }

    public static String findLargestPalindromicSubstring(String s) {
        int maxLength = 0;
        String longestPalindrome = "";

        for (int i = 0; i < s.length(); i++) {

            String oddPalindrome = expandAroundCenter(s, i, i);
            if (oddPalindrome.length() > maxLength) {
                maxLength = oddPalindrome.length();
                longestPalindrome = oddPalindrome;
            }

            String evenPalindrome = expandAroundCenter(s, i, i + 1);
            if (evenPalindrome.length() > maxLength) {
                maxLength = evenPalindrome.length();
                longestPalindrome = evenPalindrome;
            }
        }

        return longestPalindrome;
    }

    private static String expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }
}
