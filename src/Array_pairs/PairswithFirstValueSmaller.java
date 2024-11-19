/* Print all pairs of numbers from a given array where the first value is strictly smaller than the second value.

Input Format
The input consists of a single line containing the length of the array, followed by a second line containing space-separated integers.

Output Format
Print each pair of numbers on a new line, separated by a space.

Sample Inputs & Outputs
Sample Input 1
5
3 1 5 4 2
Sample Output 1
3 5
3 4
1 5
1 4
1 2
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

public class PairswithFirstValueSmaller {

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
