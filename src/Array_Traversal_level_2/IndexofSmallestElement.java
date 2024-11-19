/* Find the index of the smallest element in an array.

Input Format
The first line contains an integer 'n' (1 <= n <= 100), representing the size of the array.

The second line contains 'n' space-separated integers, representing the elements of the array.

Output Format
Print the index of the smallest element in the array.

Sample Inputs & Outputs
Sample Input 1
5
10 7 15 4 8
Sample Output 1
3
Sample Input 2
4
1 8 3 9
Sample Output 2
0
Constraints
1>= n <=100

All elements in the array will be unique. */
package Array_Traversal_level_2;

import java.util.Scanner;

public class IndexofSmallestElement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int min = 999;
        int idx = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                idx = i;
                min = arr[i];
            }
        }
        System.out.print(idx);
        scanner.close();
    }
}
