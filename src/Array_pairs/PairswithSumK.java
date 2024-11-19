/* Print all pairs of numbers from a given array whose sum is equal to a target sum.

Input Format
The first line contains the length of the array N.

The second line contains space-separated integers representing the array elements.

The third line contains a single integer, 'k', representing the target sum.

Output Format
Print each pair of numbers on a new line, separated by a space.

Sample Inputs & Outputs
Sample Input 1
5
1 2 3 4 5
6
Sample Output 1
1 5
2 4
Sample Input 2
5
4 2 3 5 7
7
Sample Output 2
4 3
2 5
Constraints
0 < N <=1000.

0 <Array Elements <=1000 

0 < k <= 1000 */
package Array_pairs;

import java.util.Scanner;

public class PairswithSumK {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();
        for (int i = 0; i < ar.length; i++) {
            for (int j = i + 1; j < ar.length; j++) {

                if ((ar[i] + ar[j]) == k) {
                    System.out.println(ar[i] + " " + ar[j]);
                }
            }
        }
        scanner.close();
    }
}
