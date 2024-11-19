/* Move all numeric characters to the end of a given string.

Input Format
The input consists of a single line containing a string that may contain numeric characters.

Output Format
Output a single line containing the modified string after moving all numeric characters to the end.

Sample Inputs & Outputs
Sample Input 1
TAP123ACADEMY
Sample Output 1
TAPACADEMY123
Sample Input 2
PROG888RAM
Sample Output 2
PROGRAM888
Constraints
The input string will consist of printable ASCII characters. */
package String_traversal_2;

import java.util.Scanner;

public class MoveNumericCharacterstotheEnd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                System.out.print(ch);
            }
        }
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= '0' && ch <= '9') {
                System.out.print(ch);
            }
        }
        scanner.close();
    }
}
