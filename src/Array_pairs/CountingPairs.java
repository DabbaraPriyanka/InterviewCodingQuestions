/* Count the number of all possible pairs that can be formed from the given array.

Input Format
The first line contains an integer N, representing the size of the array.

The second line contains N space-separated integers, representing the elements of the array.

Output Format
A single line containing the count of all possible pairs.

Sample Inputs & Outputs
Sample Input 1
5
1 2 3 4 5
Sample Output 1
10
Sample Input 2
3
-1 0 1
Sample Output 2
3
Constraints
1 <= N <= 1000

-1000 <= Array elements <= 1000 */
package Array_pairs;

import java.util.Scanner;

public class CountingPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = scanner.nextInt();
        }
        int count = 0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                count++;
            }
        }
        System.out.print(count);
        scanner.close();
    }
}
