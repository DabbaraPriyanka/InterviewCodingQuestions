/* Find the sum of all digits in a positive integer.

Input Format
A single positive integer num.

Output Format
A single integer representing the sum of digits.

Sample Inputs & Outputs
Sample Input 1
123456789
Sample Output 1
45
Sample Input 2
987654
Sample Output 2
39
Constraints
num is a positive integer with at most 10 digits (0 < num ≤ 10^10). */
package Loops;

import java.util.Scanner;

public class SumofDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum = findSumOfDigits(num);
        System.out.println(sum);
        scanner.close();
    }

    public static int findSumOfDigits(int num) {
        // Your logic here
        int sum = 0;
        while (num > 0) {
            int r = num % 10;
            sum += r;
            num = num / 10;
        }
        return sum;
    }
}
