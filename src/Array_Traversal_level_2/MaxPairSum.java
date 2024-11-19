/* Write a program that finds the maximum sum among all the pairs of elements in a given array of integers without sorting.

Input Format
The first line contains a single integer, N, representing the size 
of the array. The second line contains N space-separated integers, representing the elements of the array.

Output Format
Print the maximum sum among all the pairs of elements in the array.

Sample Inputs & Outputs
Sample Input 1
6
5 9 2 8 3 7
Sample Output 1
17
Sample Input 2
7
10 5 8 2 6 1 4
Sample Output 2
18
Constraints
- 2 ≤ N ≤ 10^5 (the size of the array) 

 -10^9 ≤ elements of the array ≤ 10^9 */
package Array_Traversal_level_2;

import java.util.Scanner;

public class MaxPairSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int large = -999;
        for (int i = 0; i < n; i++) {
            if (arr[i] > large) {
                large = arr[i];
            }
        }
        int large2 = -999;
        for (int i = 0; i < n; i++) {
            if (arr[i] > large2 && arr[i] < large) {
                large2 = arr[i];
            }
        }
        System.out.print(large + large2);
        sc.close();
    }
}
