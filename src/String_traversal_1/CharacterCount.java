/* Given a string, count the number of characters in it.

Input Format
The input consists of a single line containing a string, S.

Output Format
Print a single integer representing the number of characters in the given string.

Sample Inputs & Outputs
Sample Input 1
computer
Sample Output 1
8
Sample Input 2
programming
Sample Output 2
11
Constraints
The input string contains at most 10^6 characters. */
package String_traversal_1;

import java.util.Scanner;

public class CharacterCount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.print(input.length());
        scanner.close();
    }
}
