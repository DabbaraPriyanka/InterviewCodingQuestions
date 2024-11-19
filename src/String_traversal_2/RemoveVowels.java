/* Remove all vowels from a given string.

Input Format
The input consists of a single line containing a string that may contain vowels.

Output Format
Output a single line containing the modified string after removing all vowels.

Sample Inputs & Outputs
Sample Input 1
TapAcademyBTM
Sample Output 1
TpcdmyBTM
Sample Input 2
Coding
Sample Output 2
Cdng
Constraints
The input string will consist of printable ASCII characters. */
package String_traversal_2;

import java.util.Scanner;

public class RemoveVowels {
    static String removeConsonants(String s) {
        String r = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                if (!(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e'
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
