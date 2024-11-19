/* Prints all the alphabetic characters present in a given string in the order of their occurrence.

Input Format
The program takes a single line of input containing a string. The string can contain alphabets 
(both uppercase and lowercase), whitespaces, and special characters.

Output Format
Print the characters in the order of their occurrence. If no valid characters are found, output 
'No valid characters found.'

Sample Inputs & Outputs
Sample Input 1
Hello World!
Sample Output 1
H e l l o W o r l d
Sample Input 2
12345
Sample Output 2
No valid characters found.
Constraints
1 <= String length <= 1000 */
package String_traversal_1;

import java.util.Scanner;

public class CharacterPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int c = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                System.out.print(ch + " ");
                c++;
            }
        }
        if (c == 0) {
            System.out.print("No valid characters found.");
        }
        scanner.close();
    }
}
