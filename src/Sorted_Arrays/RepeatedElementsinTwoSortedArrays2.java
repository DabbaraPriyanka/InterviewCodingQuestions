/* Find the repeated elements in two sorted arrays.

Input Format
The input consists of four lines:

An integer N (1 ≤ N ≤ 10^5), representing the number of elements in array A.

N space-separated integers, denoting the elements of array A in Ascending order.

An integer M (1 ≤ M ≤ 10^5), representing the number of elements in array B in descending order.

M space-separated integers, denoting the elements of array B.

Output Format
Print the elements that are repeated in both arrays A and B, in ascending order, separated by a space.

Sample Inputs & Outputs
Sample Input 1
6
1 2 3 4 5 6
5
6 5 4 3 2
Sample Output 1
2 3 4 5 6
Sample Input 2
8
1 3 5 7 9 11 13 15
6
15 11 9 7 5 3
Sample Output 2
3 5 7 9 11 15
Constraints
All input elements fit within the integer range. */
package Sorted_Arrays;

import java.util.Scanner;

public class RepeatedElementsinTwoSortedArrays2 {

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
        int i = 0;
        int j = ar2.length - 1;
        while (i < ar1.length && j > -1) {
            if ((ar1[i] == ar2[j])) {
                System.out.print(ar1[i] + " ");
                i++;
                j--;

            } else if (ar1[i] < ar2[j]) {
                i++;

            } else {
                j--;

            }
        }
        scanner.close();
    }
}
