/* Write a program to find the perimeter of the square. Formula: Perimeter = 4 * side

Input Format
First line contains an Integer, side of a square

Output Format
Print the perimeter of the square

Sample Inputs & Outputs
Sample Input 1
6
Sample Output 1
24
Sample Input 2
10
Sample Output 2
40
Constraints
1 <= side <= 1000 */
package Data_Types;

import java.util.Scanner;

public class SquarePerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your code here
        int side = scanner.nextInt();
        System.out.print(4 * side);
        scanner.close();
    }
}
