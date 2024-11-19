/* Write a program to calculate total surface area of a cylinder. Formula: 2 * pi* r*(r+h)

NOTE: take pi = 3.142

Input Format
First line contains an Integer, radius of a cylinder Second line contains an Integer, height of a cylinder

Output Format
Print the area of the cylinder. The area of the cylinder should have four decimal places only. [use `double` for area]

Sample Inputs & Outputs
Sample Input 1
7
13
Sample Output 1
879.7600
Sample Input 2
10
20
Sample Output 2
1885.2000
Constraints
1 <= radius, height <= 1000 */

package Data_Types;

import java.util.Scanner;

public class CylinderSurfaceArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your code here
        double r = scanner.nextDouble();
        double h = scanner.nextDouble();
        System.out.format("%.4f", 2 * 3.142 * r * (r + h));
        scanner.close();
    }
}
