/* Write a program to print negative elements, even elements and odd elements present in an array separately.

Input Format
First line contains a single integer N. Next line contains N space separated integer values.

Output Format
First line prints space separated negative elements in an array.

Second line prints space separated odd elements in an array.

Third line prints space separated even elements in an array.

Sample Inputs & Outputs
Sample Input 1
6
1 -4 -6 3 10 -20
Sample Output 1
-4 -6 -20
1 3
10
Sample Input 2
5
5 -10 -15 20 -25
Sample Output 2
-10 -15 -25
5
20
Constraints
1 <= N <= 10^3 

-10^6 <= array elements <= 10^6 */
package Array_Traversal_level_2;

import java.util.Scanner;

public class EvenOddandNegativeElementsinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            if (arr[i] < 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
        for (int i = 0; i < N; i++) {
            if (arr[i] % 2 != 0 && arr[i] > 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
        for (int i = 0; i < N; i++) {
            if (arr[i] % 2 == 0 && arr[i] > 0) {
                System.out.print(arr[i] + " ");
            }
        }
        sc.close();
    }
}
