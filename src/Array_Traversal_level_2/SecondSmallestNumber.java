/* Write a program that finds the second smallest number in a given array of integers.

Input Format
The first line contains a single integer, N, representing the size of the array. 
The second line contains N space-separated integers, representing the elements of the array.

Output Format
Print the second smallest number in the array.

Sample Inputs & Outputs
Sample Input 1
6
5 9 2 8 3 7
Sample Output 1
3
Sample Input 2
7
10 5 8 2 6 1 4
Sample Output 2
2
Constraints
- 2 ≤ N ≤ 10^5 (the size of the array) 

 -10^9 ≤ elements of the array ≤ 10^9 */
package Array_Traversal_level_2;

import java.util.Scanner;

public class SecondSmallestNumber {
    public static int findSecondSmallest(int[] arr) {
        // Write your code here
        int small = 999;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < small) {
                small = arr[i];
            }
        }
        int diff = 999;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < diff && arr[i] > small) {
                diff = arr[i];
            }
        }
        return diff;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(findSecondSmallest(arr));
        sc.close();
    }
}
