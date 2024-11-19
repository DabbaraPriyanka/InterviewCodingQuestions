/* Extracts and prints all the distinct special characters present in a given string in the order of their occurrence.

Input Format
The program takes a single line of input containing a string.

Output Format
Print the distinct special characters in the order of their occurrence.

If no special characters are found, output 'No special characters found.'

Sample Inputs & Outputs
Sample Input 1
Hello! How are you? #Excited!
Sample Output 1
! ? # !
Sample Input 2
1234567890
Sample Output 2
No special characters found.
Constraints
1 <= String length <= 1000 */
package String_traversal_1;

import java.util.Scanner;

public class SpecialCharacterPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int c = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (!((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9') || ch == ' ')) {
                System.out.print(ch + " ");
                c++;
            }
        }
        if (c == 0) {
            System.out.print("No special characters found.");
        }
        scanner.close();
    }
}
