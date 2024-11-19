/* Given a string, count the number of alphanumeric characters in it.

Input Format
The input consists of a single line containing a string, S.

Output Format
Print a single integer representing the number of alphanumeric characters in the given string.

Sample Inputs & Outputs
Sample Input 1
H33LL0
Sample Output 1
6
Sample Input 2
AbCdEf123456
Sample Output 2
12
Constraints
The input string contains at most 10^6 characters. */
package String_traversal_1;

import java.util.Scanner;

public class AlphanumericCharacterCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int c = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')) {
                c++;
            }
        }
        System.out.print(c);
        scanner.close();
    }
}