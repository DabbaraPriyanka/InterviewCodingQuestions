/* Print all pairs of numbers from a given array where the second value is strictly larger than the first value.

Input Format
The input consists of a single line containing space-separated integers.

Output Format
Print each pair of numbers on a new line, separated by a space.

Sample Inputs & Outputs
Sample Input 1
5
4 9 2 7 5
Sample Output 1
4 9
4 7
4 5
2 7
2 5
Sample Input 2
3
1 2 3
Sample Output 2
1 2
1 3
2 3
Constraints
0<N<=1000

-1000 <= Array Elements <= 1000 */
package Array_pairs;

import java.util.Scanner;

public class PairswithSecondValueLarger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = scanner.nextInt();
        }
        for (int i = 0; i < ar.length; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                if (ar[i] < ar[j]) {
                    System.out.println(ar[i] + " " + ar[j]);
                }
            }
        }
        scanner.close();
    }
}
