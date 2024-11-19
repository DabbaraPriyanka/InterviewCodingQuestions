/* Print all palindromic substrings of a given string.

Input Format
The input consists of a single line containing a string, `str`.

Output Format
Multiple lines, each containing a palindromic substring of the input string.

Sample Inputs & Outputs
Sample Input 1
abccba
Sample Output 1
a
b
c
c
b
a
cc
bccb
abccba
Sample Input 2
tapa
Sample Output 2
t
a
p
a
apa
Constraints
The string consists of lowercase alphabets only.

The length of the string is at least 1 and at most 1000. */
package String_traversal_3;

import java.util.Scanner;

public class PrintPalindromicSubstrings {
    static boolean isPalindrome(String s) {
        String r = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            r += s.charAt(i);
        }
        if (s.equals(r)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        for (int s = 1; s <= str.length(); s++) {
            for (int i = 0; i <= str.length() - s; i++) {
                String r = "";
                for (int j = i; j < s + i; j++) {
                    r += str.charAt(j);
                }
                if (isPalindrome(r)) {
                    System.out.println(r);
                }
            }
        }
        scanner.close();
    }
}
