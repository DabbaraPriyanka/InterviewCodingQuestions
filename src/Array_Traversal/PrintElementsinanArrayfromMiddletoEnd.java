/* Print elements of the array from the middle to the end.

Input Format
The function should prompt the user to enter the size of the array and the array elements.

Output Format
Print the array elements on a single line, each element separated by a space.

Sample Inputs & Outputs
Sample Input 1
2
7 8
Sample Output 1
8
Sample Input 2
7
10 20 30 40 50 60 70
Sample Output 2
40 50 60 70
Constraints
The size of the array is a positive integer. The elements of the array are integers. */
package Array_Traversal;

import java.util.Scanner;

public class PrintElementsinanArrayfromMiddletoEnd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        printMiddleToEnd(arr);
        scanner.close();
    }

    public static void printMiddleToEnd(int[] arr) {
        for (int i = arr.length / 2; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
