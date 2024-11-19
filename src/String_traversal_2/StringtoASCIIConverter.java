/* Converts a given string to its corresponding ASCII values.

Input Format
The input consists of a single line containing a string.

Output Format
Output the ASCII values separated by spaces.

Sample Inputs & Outputs
Sample Input 1
Hello, World!
Sample Output 1
72 101 108 108 111 44 32 87 111 114 108 100 33
Sample Input 2
TapAcademy
Sample Output 2
84 97 112 65 99 97 100 101 109 121
Constraints
1 <= String length <= 100 */
package String_traversal_2;

import java.util.Scanner;

public class StringtoASCIIConverter {
    static void toAscii(String s) {
        for (int i = 0; i < s.length(); i++) {
            int ch = s.charAt(i);
            System.out.print(ch + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        toAscii(input);
        scanner.close();
    }
}
