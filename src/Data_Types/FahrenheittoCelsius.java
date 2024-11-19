/* Write a program to convert fahrenheit to celsius. Formula : celsius = (fahrenheit-32)*5/9

Input Format
First Line contain single integer fahrenheit

Output Format
Print the value after converting fahrenheit to celsius. The output should be in 4 decimal places.

Sample Inputs & Outputs
Sample Input 1
56
Sample Output 1
13.3333
Sample Input 2
68
Sample Output 2
20.0000
Constraints
-459 <= fahrenheit <= 1000 */
package Data_Types;

import java.util.Scanner;

public class FahrenheittoCelsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your code here
        double c = scanner.nextDouble();
        double r = (c - 32) * 5 / 9;
        System.out.format("%.4f", r);
        scanner.close();
    }
}
