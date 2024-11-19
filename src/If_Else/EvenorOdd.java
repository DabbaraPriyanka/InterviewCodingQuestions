/* Check if a given number is even number or odd number

Input Format
First line contains single integer n

Output Format
Print Yes if it is even number, else No

Sample Inputs & Outputs
Sample Input 1
12
Sample Output 1
Yes
Sample Input 2
15
Sample Output 2
No
Constraints
1 <= n <= 10^6 */

package If_Else;

import java.util.Scanner;

public class EvenorOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        // Write your code here
        if (num % 2 == 0) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
        scanner.close();
    }
}
