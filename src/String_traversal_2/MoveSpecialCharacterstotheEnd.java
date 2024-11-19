/* Move all special characters to the end of a given string.

Input Format
The input consists of a single line containing a string that may contain special characters.

Output Format
Output a single line containing the modified string after moving all special characters to the end.

Sample Inputs & Outputs
Sample Input 1
HelloTapAcademy@123World!
Sample Output 1
HelloTapAcademy123World@!
Sample Input 2
I love $coding$! @Programming is fun
Sample Output 2
I love coding Programming is fun$$!@
Constraints
The input string will consist of printable ASCII characters. */
package String_traversal_2;

import java.util.Scanner;

public class MoveSpecialCharacterstotheEnd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9') || ch == ' ') {
                System.out.print(ch);
            }
        }
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (!((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9') || ch == ' ')) {
                System.out.print(ch);
            }
        }
        scanner.close();
    }
}
