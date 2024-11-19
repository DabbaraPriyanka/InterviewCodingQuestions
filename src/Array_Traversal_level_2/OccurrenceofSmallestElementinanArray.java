/* Write a program to find the occurrence of the smallest element in an array.

Input Format
First line contains a single integer N. Next line contains N space separated integer values.

Output Format
Print the occurrence of smallest element

Sample Inputs & Outputs
Sample Input 1
4
1 2 3 1
Sample Output 1
2
Sample Input 2
7
1 2 3 4 5 6 1
Sample Output 2
2
Constraints
1 <= N <= 10^3 -10^6 <= array elements <= 10^6 */
package Array_Traversal_level_2;

import java.util.Scanner;

public class OccurrenceofSmallestElementinanArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        // implement your logic here
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int lar = 999;
        for (int i = 0; i < N; i++) {
            if (arr[i] < lar) {
                lar = arr[i];
            }
        }
        int count = 0;
        for (int i = 0; i < N; i++) {
            if (arr[i] == lar) {
                count++;
            }
        }
        System.out.print(count);
        sc.close();
    }
}
