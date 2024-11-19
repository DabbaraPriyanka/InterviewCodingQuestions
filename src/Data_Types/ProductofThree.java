/* Write a program to find the product of 3 numbers.

Input Format
The input consists of three lines, each line contains a long integer number.

Output Format
Print the product of the three numbers.

Sample Inputs & Outputs
Sample Input 1
10
10
10
Sample Output 1
1000
Sample Input 2
100
1000
10000
Sample Output 2
1000000000
Constraints
1 <= each number <= 10^18 */

package Data_Types;

import java.util.Scanner;

public class ProductofThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your code here
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();
        long result = a * b * c;
        System.out.print(result);
        scanner.close();
    }
}
