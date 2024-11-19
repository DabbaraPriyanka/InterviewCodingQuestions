/* Print all possible pairs of numbers from a given array.

Input Format
First line contains single integer N, representing size of the array

Second line containing space-separated integers.

Output Format
Print each pair of numbers on a new line, separated by a space.

Sample Inputs & Outputs
Sample Input 1
4
1 2 3 4
Sample Output 1
1 2
1 3
1 4
2 3
2 4
3 4
Sample Input 2
3
-1 0 1
Sample Output 2
-1 0
-1 1
0 1
Constraints
0 < N <=1000.

-1000 <= Array Elements <= 1000 */
package Array_pairs;

import java.util.Scanner;

public class PrintAllPairs {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = scanner.nextInt();
        }
        for (int i = 0; i < ar.length; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                System.out.println(ar[i] + " " + ar[j]);
            }
        }
        scanner.close();
    }
}
