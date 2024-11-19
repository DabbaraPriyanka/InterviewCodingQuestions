/* Write a Java program that removes all leading and trailing spaces from a given string.

Input Format
A single line containing a string.

Output Format
Print the input string after removing any leading and trailing spaces.

Sample Inputs & Outputs
Sample Input 1
   Hello, World!   
Sample Output 1
Hello, World!
Sample Input 2
     TAP ACADEMY     
Sample Output 2
TAP ACADEMY
Constraints
The string may contain alphabetic characters (both uppercase and lowercase), digits, and special characters.

The string may contain spaces within the string, but only leading and trailing spaces need to be removed.

The string will not be empty.

The length of the string will not exceed 100 characters. */
package String_traversal_2;

import java.util.Scanner;

public class RemoveSpacesfromaString {
    static public String trim(String s) {
        int si = 0, ei = 0;
        String r = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                si = i;
                break;
            }
        }
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                ei = i;
                break;
            }
        }
        for (int i = si; i <= ei; i++) {
            r += s.charAt(i);
        }
        return r;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.print(trim(input));
        scanner.close();
    }
}
