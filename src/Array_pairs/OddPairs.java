/* Find pairs of odd numbers from the given array. Both the number in a pair should be odd numbers.

Input Format
The first line contains an integer N, representing the size of the array.

The second line contains N space-separated integers, representing the elements of the array.

Output Format
Print each pair of odd numbers on a new line, separated by a space.

Sample Inputs & Outputs
Sample Input 1
6
2 4 6 3 8 9
Sample Output 1
3 9
Sample Input 2
4
1 2 3 4
Sample Output 2
1 3
Constraints
1 <= N <= 1000 

-1000 <= Array elements <= 1000 */
package Array_pairs;

import java.util.Scanner;

public class OddPairs {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = scanner.nextInt();
        }
        for (int i = 0; i < ar.length; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                if ((ar[i] % 2 != 0) && (ar[j] % 2 != 0)) {
                    System.out.println(ar[i] + " " + ar[j]);
                }
            }
        }
        scanner.close();
    }
}
