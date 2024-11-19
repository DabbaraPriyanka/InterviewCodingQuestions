/* Print the first 'n' prime numbers.

Input Format
The input is provided as a single integer 'n'.

Output Format
The function should print the first 'n' prime numbers on a single line, each number separated by a space.

Sample Inputs & Outputs
Sample Input 1
1
Sample Output 1
2
Sample Input 2
8
Sample Output 2
2 3 5 7 11 13 17 19
Constraints
The value of 'n' is at least 1. */
package Loops;

import java.util.Scanner;

public class FirstNPrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printFirstNPrimes(n);
        sc.close();
    }

    public static void printFirstNPrimes(int n) {
        // Your code to print the first 'n' prime numbers goes here
        int count = 0;
        int number = 2;

        while (count < n) {
            boolean isPrime = true;
            if (number <= 1) {
                isPrime = false;
            } else if (number <= 3) {
                isPrime = true;
            } else if (number % 2 == 0 || number % 3 == 0) {
                isPrime = false;
            } else {
                int divisor = 5;
                while (divisor * divisor <= number) {
                    if (number % divisor == 0 || number % (divisor + 2) == 0) {
                        isPrime = false;
                        break;
                    }
                    divisor += 6;
                }
            }

            if (isPrime) {
                System.out.print(number + " ");
                count++;
            }

            number++;
        }
    }
}
