/* Count the number of spaces in a given string.

Input Format
The input consists of a single line containing the input string.

Output Format
Output the count of spaces in the given string.

Sample Inputs & Outputs
Sample Input 1
Tap Academy.
Sample Output 1
1
Sample Input 2
Programming is fun
Sample Output 2
2
Constraints
1 <= String length <= 1000 */
package String_traversal_2;

import java.util.Scanner;

public class SpaceCountinString {
    static int spaceCount(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.print(spaceCount(input));
        scanner.close();
    }
}
