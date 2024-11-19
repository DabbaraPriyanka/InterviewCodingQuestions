
/* Write a program to convert celsius to fahrenheit. Formula : fahrenheit= (celsius*9/5)+32

Input Format
First Line contain single integer celsius

Output Format
Print the value after converting celsius to fahrenheit. The output should be in 1 decimal place.

Sample Inputs & Outputs
Sample Input 1
12
Sample Output 1
53.6
Sample Input 2
20
Sample Output 2
68.0
Constraints
-100 <= celsius <= 100 */
package Data_Types;

import java.util.Scanner;

public class CelsiustoFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your code here
        double c = scanner.nextDouble();
        double r = (c * 9 / 5) + 32;
        System.out.format("%.1f", r);
        scanner.close();
    }
}
