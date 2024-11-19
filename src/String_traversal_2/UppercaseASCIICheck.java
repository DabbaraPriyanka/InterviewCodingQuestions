/* Check if a given number is the ASCII value of an uppercase alphabet or not.

Input Format
The input consists of a single line containing an integer, n.

Output Format
Print 'Yes' if the number is an ASCII value of an uppercase alphabet, and 'No' otherwise.

Sample Inputs & Outputs
Sample Input 1
78
Sample Output 1
Yes
Sample Input 2
88
Sample Output 2
Yes
Constraints
The input integer is in the range of 65 to 90. */
package String_traversal_2;

import java.util.Scanner;

public class UppercaseASCIICheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // complete your code
        int n = scanner.nextInt();
        if (n >= 65 && n <= 90) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
        scanner.close();
    }
}
