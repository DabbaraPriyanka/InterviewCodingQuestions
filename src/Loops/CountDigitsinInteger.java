/* Count the number of digits in a positive integer.

Input Format
A single positive integer num.

Output Format
A single integer representing the count of digits.

Sample Inputs & Outputs
Sample Input 1
123456789
Sample Output 1
9
Sample Input 2
987654
Sample Output 2
6
Constraints
num is a positive integer with at most 10 digits (0 < num ≤ 10^10). */
package Loops;

import java.util.Scanner;

public class CountDigitsinInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int count = countDigits(num);
        System.out.println(count);
        scanner.close();
    }

    public static int countDigits(int num) {
        // Your logic here
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }
}
