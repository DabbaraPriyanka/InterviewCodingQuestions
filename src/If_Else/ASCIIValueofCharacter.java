/* Print the ASCII value of a character.

Input Format
The input consists of a single character 'c' on a single line.

Output Format
Output the ASCII value of the character as an integer.

Sample Inputs & Outputs
Sample Input 1
A
Sample Output 1
65
Sample Input 2
a
Sample Output 2
97
Constraints
The character 'c' is a valid ASCII character. */
package If_Else;

import java.util.Scanner;

public class ASCIIValueofCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char c = scanner.nextLine().charAt(0);
        int a = c;
        System.out.print(a);
        scanner.close();
    }
}
