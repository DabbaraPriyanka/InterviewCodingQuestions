/* Check if a given number is the ASCII value of a lowercase alphabet.

Input Format
The input consists of a single integer 'n'.

Output Format
Output 'Yes' if the number is the ASCII value of a lowercase alphabet, otherwise output 'No'.

Sample Inputs & Outputs
Sample Input 1
100
Sample Output 1
Yes
Sample Input 2
108
Sample Output 2
Yes
Constraints
97 <= n <= 122 */
package String_traversal_2;

import java.util.Scanner;

public class LowercaseASCIIValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // complete your code
        int n = scanner.nextInt();
        if (n >= 97 && n <= 122) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
        scanner.close();
    }
}
