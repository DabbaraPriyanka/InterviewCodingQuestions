/* Insert an asterisk (*) before each occurrence of the character 'a' in a given string.

Input Format
The input consists of a single line containing a string.

Output Format
Output a single line containing the modified string with asterisks inserted before 'a' characters.

Sample Inputs & Outputs
Sample Input 1
Tapacademy
Sample Output 1
T*ap*ac*ademy
Sample Input 2
progr*amming
Sample Output 2
progr*amming
Constraints
The input string will consist of printable ASCII characters. */
package String_traversal_2;

import java.util.Scanner;

public class InsertAsterisksBeforeaCharacters {
    static void strr(String s) {
        String t = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a') {
                t = t + '*' + ch;
            } else {
                t = t + ch;
            }
        }
        System.out.print(t);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        strr(s);
        scanner.close();

    }
}
