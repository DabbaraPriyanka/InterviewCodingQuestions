/* Write a program to print all sum combination of three numbers by taking two numbers at a time.

Input Format
First Line contain single integer m Second line contain single integer n Third line contain single integer k

Output Format
Print all sum combination of three numbers

Sample Inputs & Outputs
Sample Input 1
2
4
6
Sample Output 1
6
8
10
Sample Input 2
20
30
50
Sample Output 2
50
70
80
Constraints
1 <= m,n,k <= 1000 */

package Data_Types;

import java.util.Scanner;

public class SumCombinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your code here
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println(a + b);
        System.out.println(a + c);
        System.out.println(b + c);
        scanner.close();
    }

}
