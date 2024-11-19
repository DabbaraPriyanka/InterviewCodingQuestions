/* Write a program to add three integer numbers.

Input Format
First Line contain single integer m Second line contain single integer n Third line contain single integer k

Output Format
Print sum of both the integers m, n, and k

Sample Inputs & Outputs
Sample Input 1
5
10
5
Sample Output 1
20
Sample Input 2
20
30
50
Sample Output 2
100
Constraints
1 <= m,n,k <= 1000 */

package Data_Types;

import java.util.Scanner;

public class AddingThreeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your code here
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.print(a + b + c);
        scanner.close();
    }
}
