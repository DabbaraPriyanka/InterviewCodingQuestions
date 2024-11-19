/* Find and print the elements that are not repeated in two sorted arrays. Print the result in sorted array

Input Format
The input consists of four lines:

The first line contains an integer N, representing the number of elements in array A.

The second line contains N space-separated integers, denoting the elements of array A.

The third line contains an integer M, representing the number of elements in array B.

The fourth line contains M space-separated integers, denoting the elements of array B.

Output Format
Print the elements that are not repeated in either array A or B, separated by a space.

Sample Inputs & Outputs
Sample Input 1
5
1 2 3 4 5
6
2 4 6 8 10 12
Sample Output 1
1 3 5 6 8 10 12
Sample Input 2
4
2 4 6 8
5
4 6 8 10 12
Sample Output 2
2 10 12
Constraints
1 ≤ N, M ≤ 10^5 */
package Multiple_Arrays;

import java.util.Scanner;

public class NonRepeatedElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] arr1 = new int[N];
        for (int i = 0; i < N; i++) {
            arr1[i] = scanner.nextInt();
        }

        int M = scanner.nextInt();
        int[] arr2 = new int[M];
        for (int i = 0; i < M; i++) {
            arr2[i] = scanner.nextInt();
        }

        NonRepeatedElement(arr1, arr2);

        scanner.close();
    }

    public static void NonRepeatedElement(int[] arr1, int[] arr2) {
        int i = 0, j = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                System.out.print(arr1[i] + " ");
                i++;
            } else if (arr1[i] > arr2[j]) {
                System.out.print(arr2[j] + " ");
                j++;
            } else {
                i++;
                j++;
            }
        }

        while (i < arr1.length) {
            System.out.print(arr1[i] + " ");
            i++;
        }

        while (j < arr2.length) {
            System.out.print(arr2[j] + " ");
            j++;
        }
    }
}
