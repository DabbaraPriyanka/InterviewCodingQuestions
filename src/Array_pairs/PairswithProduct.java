/* Find pairs of numbers from the array whose product is equal to a given target value.

Input Format
The first line contains an integer N, representing the size of the array.

The second line contains N space-separated integers, representing the elements of the array.

The third line contains a single integer k, representing the desired product value.

Output Format
Print each pair of numbers on a new line, separated by a space.

Sample Inputs & Outputs
Sample Input 1
6
2 4 6 3 8 9
12
Sample Output 1
2 6
4 3
Sample Input 2
4
2 1 4 3
12
Sample Output 2
4 3
Constraints
1 <= N <= 1000 

-1000 <= Array elements <= 1000 

-10^9 <= k <= 10^9 */
package Array_pairs;

import java.util.Scanner;

public class PairswithProduct {
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
                if ((ar[i] * ar[j]) == k) {
                    System.out.println(ar[i] + " " + ar[j]);
                }
            }
        }
        scanner.close();
    }
}
