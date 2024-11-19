/* Find the largest number among three integers.

Input Format
The input consists of three space-separated integers 'n', 'm', and 'l'.

Output Format
Output the largest number among the three.

Sample Inputs & Outputs
Sample Input 1
10 25 5
Sample Output 1
25
Sample Input 2
-3 0 -7
Sample Output 2
0
Constraints
All input integers are within the range of a 32-bit signed integer. */
package If_Else;

import java.util.Scanner;

public class LargestNumberofThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int l = scanner.nextInt();

        if (n >= m && n >= l) {
            System.out.print(n);
        } else if (m >= l && m >= n) {
            System.out.print(m);
        } else if (l >= m && l >= n) {
            System.out.print(l);
        }
        scanner.close();
    }
}
