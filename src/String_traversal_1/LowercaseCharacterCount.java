/* Given a string, count the number of lowercase characters in it.

Input Format
The input consists of a single line containing a string, S.

Output Format
Print a single integer representing the number of lowercase characters in the given string.

Sample Inputs & Outputs
Sample Input 1
hello
Sample Output 1
5
Sample Input 2
world
Sample Output 2
5
Constraints
The input string contains at most 10^6 characters. */
package String_traversal_1;

import java.util.Scanner;

public class LowercaseCharacterCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int c = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if ((ch >= 'a' && ch <= 'z')) {
                c++;
            }
        }
        System.out.print(c);
        scanner.close();
    }
}
