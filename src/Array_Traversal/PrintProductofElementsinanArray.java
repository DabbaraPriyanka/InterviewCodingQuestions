/* Calculate and print the product of all elements in the array.

Input Format
The function should prompt the user to enter the size of the array and the array elements.

Output Format
Print a single integer, representing the product of all elements in the array.

Sample Inputs & Outputs
Sample Input 1
3
0 1 2
Sample Output 1
0
Sample Input 2
2
-10 10
Sample Output 2
-100
Constraints
The size of the array is a positive integer.

The elements of the array are integers. */
package Array_Traversal;

import java.util.Scanner;

public class PrintProductofElementsinanArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int res = calculateProduct(arr);
        System.out.print(res);
        scanner.close();

    }

    public static int calculateProduct(int[] arr) {
        int pro = 1;
        for (int i = 0; i < arr.length; i++) {
            pro *= arr[i];
        }
        return pro;
    }
}
