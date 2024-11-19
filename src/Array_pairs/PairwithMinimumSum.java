/* Print the pair of numbers from the input array whose sum is minimum.

Input Format
A single line containing space-separated integers, representing the elements of the array.

Output Format
Print the pair of numbers on a single line, separated by a space.

Sample Inputs & Outputs
Sample Input 1
6
2 4 6 3 8 9
Sample Output 1
2 3
Sample Input 2
4
1 2 3 4
Sample Output 2
1 2
Constraints
1 <= Array length <= 1000

-1000 <= Array elements <= 1000 */
package Array_pairs;

import java.util.Scanner;

public class PairwithMinimumSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ar[] = new int[n];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = scanner.nextInt();
        }
        int min = Integer.MAX_VALUE;
        int sum = 0;
        int a = 0, b = 0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                sum = ar[i] + ar[j];
                if (sum < min) {
                    min = sum;
                    a = ar[i];
                    b = ar[j];
                }
            }
        }
        System.out.println(a + " " + b);
        scanner.close();
    }
}
