/* Print all pairs of numbers from a given array where the second value is strictly smaller than the first value.

Input Format
The input consists of two lines. The first line contains the size of the array. The second line contains space-separated integers.

Output Format
Print each pair of numbers on a new line, separated by a space.

Sample Inputs & Outputs
Sample Input 1
5
3 1 5 4 2
Sample Output 1
3 1
3 2
5 4
5 2
4 2
Sample Input 2
3
4 2 3
Sample Output 2
4 2
4 3
Constraints
The length of the array will be positive and will not exceed 1000.

Each integer in the array will be between -1000 and 1000 (inclusive). */
package Array_pairs;

import java.util.Scanner;

public class PairswithSecondValueSmallerthanFirstValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = scanner.nextInt();
        }
        for (int i = 0; i < ar.length; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                if (ar[i] > ar[j]) {
                    System.out.println(ar[i] + " " + ar[j]);
                }
            }
        }
        scanner.close();
    }
}
