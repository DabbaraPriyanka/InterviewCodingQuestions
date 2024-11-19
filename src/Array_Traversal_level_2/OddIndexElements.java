/* Write a program to print numbers present in the odd index of an array.

Input Format
First line contains a single integer N. Next line contains N space separated integer values.

Output Format
Print space separated integer values stored in the odd index of the array.

Sample Inputs & Outputs
Sample Input 1
5
1 4 6 3 10
Sample Output 1
4 3
Sample Input 2
4
20 30 40 50
Sample Output 2
30 50
Constraints
1 <= N <= 10^3
-10^6 <= array elements <= 10^6 */
package Array_Traversal_level_2;

import java.util.Scanner;

public class OddIndexElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        // implement your logic here
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 1; i < N; i = i + 2) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
