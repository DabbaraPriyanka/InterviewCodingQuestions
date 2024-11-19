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
package String_traversal_2;

import java.util.Scanner;

public class LowercaseCharacterCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // complete your code
        String s = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                count++;
            }
        }
        System.out.print(count);
        scanner.close();
    }
}
