/* Print all palindromic substrings of length 4 from a given string.

Input Format
The input consists of a single line containing a string, `str`.

Output Format
Multiple lines, each containing a palindromic substring of length 4.

Sample Inputs & Outputs
Sample Input 1
abcbxyzzyy
Sample Output 1
yzzy
Sample Input 2
mississippi
Sample Output 2
issi
issi
ippi
Constraints
The length of the string will be at least 4 and at most 1000. */
package String_traversal_3;

import java.util.Scanner;

public class PalindromicSubstringsofLength4 {
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
        int s = 4;
        for (int i = 0; i <= str.length() - s; i++) {
            String r = "";
            for (int j = i; j < s + i; j++) {
                r += str.charAt(j);
            }
            if (isPalindrome(r)) {
                System.out.println(r);
            }
        }
        scanner.close();
    }
}
