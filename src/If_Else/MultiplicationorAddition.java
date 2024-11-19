/* Check the given two integer inputs. If both numbers are even, find their product. Otherwise, find their sum.

Input Format
The input consists of two lines. The first line contains the first integer, n. The second line contains the second integer, m.

Output Format
Print the product of the two numbers if both numbers are even. Otherwise, print their sum.

Sample Inputs & Outputs
Sample Input 1
10
20
Sample Output 1
200
Sample Input 2
10
15
Sample Output 2
25
Constraints
The input integers are in the range of -10^9 to 10^9. */
package If_Else;

import java.util.Scanner;

public class MultiplicationorAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        if (n % 2 == 0 && m % 2 == 0) {
            System.out.print(m * n);
        } else {
            System.out.print(m + n);
        }
        scanner.close();
    }
}
