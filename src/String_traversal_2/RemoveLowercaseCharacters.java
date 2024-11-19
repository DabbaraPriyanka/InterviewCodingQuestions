/* Remove all lowercase characters from a given string.

Input Format
The input consists of a single line containing a string that may contain lowercase characters.

Output Format
Output a single line containing the modified string after removing all lowercase characters.

Sample Inputs & Outputs
Sample Input 1
TtAaPpAaCcAaDdEeMmYy
Sample Output 1
TAPACADEMY
Sample Input 2
PpRrOoGgRrAaMmMmIiNnGg
Sample Output 2
PROGRAMMING
Constraints
The input string will consist of printable ASCII characters. */
package String_traversal_2;

import java.util.Scanner;

public class RemoveLowercaseCharacters {
    static String removeLowerCase(String s) {
        String r = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                r += ch;
            }
        }
        return r;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.print(removeLowerCase(input));
        scanner.close();
    }
}
