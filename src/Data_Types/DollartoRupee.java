/* Write a program to convert Dollars to rupees. Consider 1 dollar = 82.73 inr.

Input Format
First line contains single integer representing dollar

Output Format
Print result after converting dollar to rupees, INR should have four decimal places only. (rupees has to be taken as double type)

Sample Inputs & Outputs
Sample Input 1
1000
Sample Output 1
82730.0000
Sample Input 2
10
Sample Output 2
827.3000
Constraints
1 <= dollars <= 1000 */

package Data_Types;

import java.util.Scanner;

public class DollartoRupee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your code here
        double rup = scanner.nextDouble();
        System.out.format("%.4f", rup * 82.73);
        scanner.close();
    }
}
