/*Write a program to calculate the circumference of a circle. Formula: Circumference = 2piradius, where pi=3.142

Input Format
First line contains an Integer, radius of a circle

Output Format
Print the circumference of the circle. The circumference should have four decimal places only.

Sample Inputs & Outputs
Sample Input 1
10
Sample Output 1
62.8400
Sample Input 2
50
Sample Output 2
314.2000
Constraints
1 <= radius <= 1000 */

package Data_Types;

import java.util.Scanner;

public class CircleCircumference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int radius = scanner.nextInt();
        // Write your code here
        System.out.format("%.4f", 2 * 3.142 * radius);
        scanner.close();
    }
}
