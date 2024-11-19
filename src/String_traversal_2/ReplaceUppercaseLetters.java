/* Given a string, replace all uppercase letters with '#' characters.

Input Format
The input consists of a single line containing a string, S.

Output Format
Print a single string with all uppercase letters replaced by '#'.

Sample Inputs & Outputs
Sample Input 1
I lOve CODING
Sample Output 1
# l#ve ######
Sample Input 2
Hello World
Sample Output 2
#ello #orld */
package String_traversal_2;

import java.util.Scanner;

public class ReplaceUppercaseLetters {
    static String replaceUpperCase(String s) {
        String r = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                r += '#';
            } else {
                r += ch;
            }
        }
        return r;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.print(replaceUpperCase(s));
        scanner.close();
    }
}
