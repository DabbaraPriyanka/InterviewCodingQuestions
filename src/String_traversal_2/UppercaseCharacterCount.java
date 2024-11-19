/* Given a string, count the number of uppercase characters in it.

Input Format
The input consists of a single line containing a string, S.

Output Format
Print a single integer representing the number of uppercase characters in the given string.

Sample Inputs & Outputs
Sample Input 1
Hello
Sample Output 1
1
Sample Input 2
World
Sample Output 2
1
Constraints
The input string contains at most 10^6 characters. */
package String_traversal_2;

import java.util.Scanner;

public class UppercaseCharacterCount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // complete your code
        String s = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                count++;
            }
        }
        System.out.print(count);
        scanner.close();
    }
}
