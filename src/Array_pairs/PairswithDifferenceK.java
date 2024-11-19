/* Find pairs of numbers in an array with a given target difference.

Input Format
The first line contains N the length of the array.

The second line contains space-separated integers representing the array elements.

The third line contains a single integer, 'k', representing the target difference.

Output Format
Print each pair of numbers on a new line, separated by a space.

Sample Inputs & Outputs
Sample Input 1
5
3 1 5 4 2
2
Sample Output 1
3 1
3 5
4 2
Sample Input 2
6
8 12 5 9 15 6
3
Sample Output 2
8 5
12 9
12 15
9 6
Constraints
0 < N <=1000.

0 < Array Elements <=1000

0 < k <= 1000 */
package Array_pairs;

import java.util.Scanner;

public class PairswithDifferenceK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ar[] = new int[n];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();
        for (int i = 0; i < ar.length; i++) {
            for (int j = i + 1; j < ar.length; j++) {

                if ((ar[i] - ar[j]) == k || (ar[i] - ar[j]) == -k) {
                    System.out.println(ar[i] + " " + ar[j]);
                }
            }
        }
        scanner.close();
    }
}
