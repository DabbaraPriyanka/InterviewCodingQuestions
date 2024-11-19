/* Write a program to print the elements which are divisible by 2 and 3 in an array.

Input Format
First line contains a single integer N. Next line contains N space separated integer values.

Output Format
Print elements which are divisible by 2 and 3 in an array

Sample Inputs & Outputs
Sample Input 1
5
1 4 6 3 10
Sample Output 1
6
Sample Input 2
5
2 3 6 9 12
Sample Output 2
6 12
Constraints
1 <= N <= 10^3 -10^6 <= array elements <= 10^6 */
package Array_Traversal_level_2;

import java.util.Scanner;

public class DivisibleElementsPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        // implement your logic here
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            if (arr[i] % 2 == 0 && arr[i] % 3 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
        sc.close();
    }
}
