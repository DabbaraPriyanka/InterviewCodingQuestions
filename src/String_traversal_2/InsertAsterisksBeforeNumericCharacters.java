/* Insert an asterisk (*) before each numeric character (0-9) in a given string.

Input Format
The input consists of a single line containing a string.

Output Format
Output a single line containing the modified string with asterisks inserted before numeric characters.

Sample Inputs & Outputs
Sample Input 1
TAP123ACADEMY456
Sample Output 1
TAP*1*2*3ACADEMY*4*5*6
Sample Input 2
CODE@123TAP
Sample Output 2
CODE@*1*2*3TAP
Constraints
The input string will consist of printable ASCII characters. */
package String_traversal_2;

import java.util.Scanner;

public class InsertAsterisksBeforeNumericCharacters {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if ((ch >= '0' && ch <= '9')) {
                System.out.print("*" + ch);
            } else {
                System.out.print(ch);
            }
        }
        scanner.close();
    }
}
