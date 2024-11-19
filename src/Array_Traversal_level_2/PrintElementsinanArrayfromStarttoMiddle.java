/* Print elements of the array from the starting to the middle.

Input Format
The function should prompt the user to enter the size of the array and the array elements.

Output Format
Print the array elements on a single line, each element separated by a space.

Sample Inputs & Outputs
Sample Input 1
2
7 8
Sample Output 1
7
Sample Input 2
7
10 20 30 40 50 60 70
Sample Output 2
10 20 30
Constraints
The size of the array is a positive integer.

The elements of the array are integers. */
package Array_Traversal_level_2;

import java.util.Scanner;

public class PrintElementsinanArrayfromStarttoMiddle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        printStartToMiddle(arr);
        sc.close();
    }

    public static void printStartToMiddle(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
