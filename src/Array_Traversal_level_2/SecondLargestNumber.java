/* Find the second largest number in a given array of integers. 
Where second largest number must be different from first largest number.

Input Format
The first line contains a single integer, N, representing the size of the array.

The second line contains N space-separated integers, representing the elements of the array.

Output Format
Print the second largest number in the array.

Sample Inputs & Outputs
Sample Input 1
5
1 4 6 3 10
Sample Output 1
6
Sample Input 2
8
3 8 2 10 5 9 7 1
Sample Output 2
9
Constraints
2 ≤ N ≤ 10^5 (the size of the array)

-10^9 ≤ elements of the array ≤ 10^9 */
package Array_Traversal_level_2;

import java.util.Scanner;

public class SecondLargestNumber {

    public static int findSecondSmallest(int[] arr) {
        // Write your code here
        int small = -999;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > small) {
                small = arr[i];
            }
        }
        int diff = -999;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > diff && arr[i] < small) {
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
