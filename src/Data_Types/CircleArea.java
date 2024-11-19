/* Write a program to find the area of the circle. Formula: area = pi*r*r. Consider pi = 3.142

NOTE: 4 decimal points has to printed.

Input Format
First line contains an Integer, radius of a circle

Output Format
Print the area of the circle. The area of the circle should have four decimal places only.

Sample Inputs & Outputs
Sample Input 1
18
Sample Output 1
1018.0080
Sample Input 2
10
Sample Output 2
314.2000
Constraints
1 <= radius <= 1000 */
package Data_Types;

import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your code here
        double r = scanner.nextDouble();
        System.out.format("%.4f", 3.142 * r * r);
        scanner.close();
    }
}
