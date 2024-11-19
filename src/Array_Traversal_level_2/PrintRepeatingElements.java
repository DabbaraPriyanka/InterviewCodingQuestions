/* Print the elements that occur more than once in a sorted array.

Input Format
The input consists of two lines:

The first line contains a single integer N, representing the size of the array (1 ≤ N ≤ 10^5).

The second line contains N space-separated integers, A[1], A[2], ..., A[N], 
representing the elements of the array (-10^9 ≤ A[i] ≤ 10^9).

Output Format
Print the repeating elements in a single line, separated by a space, or -1 if no element is repeating.

Sample Inputs & Outputs
Sample Input 1
8
1 2 3 3 4 4 4 5
Sample Output 1
3 4
Sample Input 2
6
1 2 3 4 5 6
Sample Output 2
-1
Constraints
1 ≤ N ≤ 10^5

-10^9 ≤ A[i] ≤ 10^9 */
package Array_Traversal_level_2;

import java.util.Scanner;

public class PrintRepeatingElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int count = 1;
        boolean isDuplicated = false;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                count++;
                isDuplicated = true;
            } else if (count > 1) {
                System.out.print(arr[i] + " ");
                count = 1;
            }
        }
        if (count > 1) {
            System.out.print(arr[n - 1]);
        } else if (!isDuplicated) {
            System.out.print("-1");
        }
        scanner.close();
    }
}
