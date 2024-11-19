/* Insert an asterisk (*) before each vowel (a, e, i, o, u) in a given string.

Input Format
The input consists of a single line containing a string.

Output Format
Output a single line containing the modified string with asterisks inserted before vowels.

Sample Inputs & Outputs
Sample Input 1
TapAcademy
Sample Output 1
T*ap*Ac*ad*emy
Sample Input 2
programming
Sample Output 2
pr*ogr*amm*ing
Constraints
The input string will consist of printable ASCII characters. */
package String_traversal_2;

import java.util.Scanner;

public class InsertAsterisksBeforeVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String r = "";
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if ((ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u')) {
                r += ("*" + ch);
            } else {
                r += ch;
            }
        }
        System.out.print(r);
        scanner.close();
    }
}
