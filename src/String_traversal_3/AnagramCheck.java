/* Given two strings, check if they are anagrams of each other.

Input Format
The input consists of two lines:

First line containing a string, str1.

Second line containing a string, str2.

Output Format
Print 'anagrams' if str1 and str2 are anagrams of each other; otherwise, print 'not anagrams'.

Sample Inputs & Outputs
Sample Input 1
anagram
marganaa
Sample Output 1
not anagrams
Sample Input 2
Listen
silent
Sample Output 2
anagrams
Constraints
The input strings contain at most 10^6 characters. */
package String_traversal_3;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
    public static boolean areAnagrams(String str1, String str2) {
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        if (areAnagrams(str1, str2)) {
            System.out.println("anagrams");
        } else {
            System.out.println("not anagrams");
        }

        scanner.close();
    }

}
