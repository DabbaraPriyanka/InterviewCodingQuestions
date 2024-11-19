/* Count the number of vowels in a given string.

Input Format
The input consists of a single line containing the input string.

Output Format
Output the count of vowels in the given string.

Sample Inputs & Outputs
Sample Input 1
Hello, World!
Sample Output 1
3
Sample Input 2
TapAcademy
Sample Output 2
4
Constraints
1 <= String length <= 1000 */
package String_traversal_1;

import java.util.Scanner;

public class VowelCountinString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int c = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i'
                        || ch == 'o' || ch == 'u') {
                    c++;
                }
            }
        }
        System.out.print(c);
        scanner.close();
    }
}
