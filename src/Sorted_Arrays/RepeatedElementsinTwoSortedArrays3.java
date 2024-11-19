/* Find the repeated elements in two sorted arrays.

Input Format
The input consists of four lines:

An integer N (1 ≤ N ≤ 10^5), representing the number of elements in array A.

N space-separated integers, denoting the elements of array A in descending order.

An integer M (1 ≤ M ≤ 10^5), representing the number of elements in array B in ascending order.

M space-separated integers, denoting the elements of array B.

Output Format
Print the elements that are repeated in both arrays A and B, in ascending order, separated by a space.

Sample Inputs & Outputs
Sample Input 1
6
9 8 7 6 5 4
5
4 5 6 7 8
Sample Output 1
4 5 6 7 8
Sample Input 2
7
10 8 6 4 2 2 0
6
0 1 2 3 4 5
Sample Output 2
0 2 4
Constraints
All input elements fit within the integer range. */
package Sorted_Arrays;

import java.util.Scanner;

public class RepeatedElementsinTwoSortedArrays3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int ar1[] = new int[n1];
        for (int i = 0; i < ar1.length; i++) {
            ar1[i] = scanner.nextInt();
        }
        int n2 = scanner.nextInt();
        int ar2[] = new int[n2];
        for (int i = 0; i < ar2.length; i++) {
            ar2[i] = scanner.nextInt();
        }
        int i = ar1.length - 1;
        int j = 0;
        while (i > -1 && j < ar2.length) {
            if ((ar1[i] == ar2[j])) {
                System.out.print(ar1[i] + " ");
                i--;
                j++;

            } else if (ar1[i] < ar2[j]) {
                i--;

            } else {
                j++;

            }
        }
        scanner.close();
    }
}
