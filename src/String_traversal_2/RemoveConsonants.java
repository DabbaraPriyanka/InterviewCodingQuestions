/* Remove all consonants from a given string.

Input Format
The input consists of a single line containing a string that may contain consonants.

Output Format
Output a single line containing the modified string after removing all consonants.

Sample Inputs & Outputs
Sample Input 1
TapAcademy123
Sample Output 1
aAae123
Sample Input 2
I love coding in JAVA.
Sample Output 2
I oe oi i AA.
Constraints
The input string will consist of printable ASCII characters. */
package String_traversal_2;

import java.util.Scanner;

public class RemoveConsonants {
    static String removeConsonants(String s) {
        String r = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                if ((ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e'
                        || ch == 'i' || ch == 'o' || ch == 'u')) {
                    r += ch;
                }
            } else {
                r += ch;
            }
        }
        return r;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.print(removeConsonants(input));
        scanner.close();
    }
}
