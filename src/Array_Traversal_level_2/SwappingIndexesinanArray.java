/* Write a program to swap all the even index elements with odd index elements.

Input Format
First line contains a single integer N. Next line contains N space separated integer values.

Output Format
Print the required output

Sample Inputs & Outputs
Sample Input 1
4
1 2 3 4
Sample Output 1
Before Swapping:
1 2 3 4
After Swapping:
2 1 4 3
Sample Input 2
7
1 2 3 4 5 6 7
Sample Output 2
Before Swapping:
1 2 3 4 5 6 7
After Swapping:
2 1 4 3 6 5 7
Constraints
1 <= N <= 10^3 -10^6 <= array elements <= 10^6 */
package Array_Traversal_level_2;

import java.util.Scanner;

public class SwappingIndexesinanArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("Before Swapping:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("After Swapping:");
        int i = 0, j = 1;
        if (n % 2 == 0) {
            while (i < n && j < n) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i = j + 1;
                j = i + 1;
            }
        } else {
            while (i < n && j < n - 1) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i = j + 1;
                j = i + 1;
            }
        }
        for (i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
