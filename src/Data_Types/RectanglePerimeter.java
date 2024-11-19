/* Write a program to find the perimeter of the rectangle. Formula: perimeter = 2 * (length + width)

Input Format
First line contains an Integer, length of a rectangle Second line contains an Integer, represents width of a rectangle

Output Format
Print the perimeter of the rectangle

Sample Inputs & Outputs
Sample Input 1
2
4
Sample Output 1
12
Sample Input 2
10
20
Sample Output 2
60
Constraints
1 <= length, width <= 1000 */
package Data_Types;

import java.util.Scanner;

public class RectanglePerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your code here
        int l = scanner.nextInt();
        int w = scanner.nextInt();
        System.out.print(2 * (l + w));
        scanner.close();
    }
}
