/* Take the size of an array and its elements as input from the user and print
 the elements of the array.

Input Format
The function interacts with the user through standard input (console).

Output Format
Print the array elements on a single line, each element separated by a space.

Sample Inputs & Outputs
Sample Input 1
4
2 4 5 6
Sample Output 1
2 4 5 6
Sample Input 2
5
11 22 33 44 55
Sample Output 2
11 22 33 44 55
Constraints
The size of the array is a positive integer. The elements of the array are integers. */
package Array_Traversal_level_2;

import java.util.Scanner;

public class PrintArrayElements2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        printArray(arr);
        sc.close();
    }

    public static void printArray(int[] arr) {
        // Your logic here
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
