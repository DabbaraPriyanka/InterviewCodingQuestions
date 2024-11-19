/* Find and print the elements that are repeated in both given sorted arrays.

Input Format
The input consists of four lines:

An integer N (1 ≤ N ≤ 10^5), representing the number of elements in array A.

N space-separated integers, denoting the elements of array A

An integer M (1 ≤ M ≤ 10^5), representing the number of elements in array B

M space-separated integers, denoting the elements of array B.

Output Format
Print the repeated elements from both arrays in ascending order, separated by a space.

Sample Inputs & Outputs
Sample Input 1
6
2 4 5 5 7 8
7
2 3 5 5 6 7 8
Sample Output 1
2 5 5 7 8
Sample Input 2
5
1 2 3 4 5
5
2 3 4 5 6
Sample Output 2
2 3 4 5
Constraints
The elements in both arrays A and B are integers.

The elements in each array are sorted in ascending order.

All input elements fit within the integer range. */
package Multiple_Arrays;

import java.util.Scanner;

public class RepeatedElementsinTwoSortedArrays1 {
    static void printrepeatedelements(int[] ar1, int[] ar2) {
        int i = 0, j = 0;
        while (i < ar1.length && j < ar2.length) {
            if (ar1[i] == ar2[j]) {
                System.out.print(ar2[j] + " ");
                i++;
                j++;
            } else if (ar1[i] < ar2[j]) {
                i++;
            } else {
                j++;
            }

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] ar1 = new int[N];
        for (int i = 0; i < ar1.length; i++) {
            ar1[i] = sc.nextInt();
        }
        int M = sc.nextInt();
        int[] ar2 = new int[M];
        for (int i = 0; i < ar2.length; i++) {
            ar2[i] = sc.nextInt();
        }
        printrepeatedelements(ar1, ar2);
        sc.close();
    }
}
