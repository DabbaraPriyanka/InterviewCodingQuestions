/* Find and print the even elements that are repeated in two sorted arrays.

Input Format
The input consists of four lines:

- The first line contains an integer N, representing the number of elements in array A.

- The second line contains N space-separated integers, denoting the elements of array A.

- The third line contains an integer M, representing the number of elements in array B.

- The fourth line contains M space-separated integers, denoting the elements of array B.

Output Format
Print the even elements that are repeated in both arrays, separated by a space.

Sample Inputs & Outputs
Sample Input 1
7
2 4 5 6 8 10 12
6
4 6 6 8 10 12
Sample Output 1
4 6 8 10 12
Sample Input 2
6
2 4 6 8 10 12
4
3 6 8 12
Sample Output 2
6 8 12
Constraints
1 ≤ N, M ≤ 10^5 */
package Multiple_Arrays;

import java.util.Scanner;

public class RepeatedEvenElements {
    static void printrepeatedelements(int[] ar1, int[] ar2) {
        int i = 0, j = 0;
        while (i < ar1.length && j < ar2.length) {
            if (ar1[i] == ar2[j] && ar1[i] % 2 == 0 && ar2[j] % 2 == 0) {
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
