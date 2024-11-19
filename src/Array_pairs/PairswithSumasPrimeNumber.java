/* Print all pairs of numbers from a given array where the sum of the pair is a prime number.

Input Format
The input consists of a single line containing space-separated integers.

Output Format
Print each pair of numbers on a new line, separated by a space.

Sample Inputs & Outputs
Sample Input 1
5
2 3 5 7 9
Sample Output 1
2 3
2 5
2 9
Sample Input 2
3
1 2 3
Sample Output 2
1 2
2 3
Constraints
0<N<=1000 

-1000 <= Array Elements <= 1000 */
package Array_pairs;

import java.util.Scanner;

public class PairswithSumasPrimeNumber {
    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ar[] = new int[n];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                sum = ar[i] + ar[j];
                if (isPrime(sum)) {
                    System.out.println(ar[i] + " " + ar[j]);
                }
            }
        }
        scanner.close();
    }
}
