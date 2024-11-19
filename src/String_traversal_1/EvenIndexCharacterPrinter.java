/* Extracts and prints all the characters present at even indices in a given string in the order of their occurrence.

Input Format
The program takes a single line of input containing a string.

Output Format
Print the characters at even indices in the order of their occurrence. If no characters are found at even indices, output 'No characters found at even indices.'

Sample Inputs & Outputs
Sample Input 1
TapAcad
Sample Output 1
T p c d
Sample Input 2
12345
Sample Output 2
1 3 5
Constraints
1 <= String length <= 1000 */
package String_traversal_1;

import java.util.Scanner;

public class EvenIndexCharacterPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        for (int i = 0; i < input.length(); i++) {
            if (i % 2 == 0) {
                System.out.print(input.charAt(i) + " ");
            }
        }
        scanner.close();
    }
}
