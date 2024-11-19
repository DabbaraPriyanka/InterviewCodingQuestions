/* Print the equivalent ASCII character of a given number.

Input Format
The input consists of a single integer 'n'.

Output Format
Output the equivalent ASCII character.

Sample Inputs & Outputs
Sample Input 1
98
Sample Output 1
b
Sample Input 2
72
Sample Output 2
H
Constraints
0 <= n <= 127 */
package If_Else;

import java.util.Scanner;

public class EquivalentASCIICharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        char c = (char) n;
        System.out.print(c);
        scanner.close();
    }
}
