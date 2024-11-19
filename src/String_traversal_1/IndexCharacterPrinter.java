/* Prints the character present at a given index in a string, and the index value should starts from 0.

Input Format
The program takes two lines of input:

- The first line contains a string.

- The second line contains an integer representing the index value (k).

Output Format
Print the character present at index k in the input string.

If the index is invalid or the string is empty, output "Invalid index".

Sample Inputs & Outputs
Sample Input 1
TapAcademy
3
Sample Output 1
A
Sample Input 2
Testing
7
Sample Output 2
Invalid index
Constraints
1 <= String length <= 1000 */
package String_traversal_1;

import java.util.Scanner;

public class IndexCharacterPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int n = scanner.nextInt();

        if (n < input.length() && n >= 0) {
            System.out.print(input.charAt(n));
        } else {
            System.out.print("Invalid index");
        }
        scanner.close();
    }
}
