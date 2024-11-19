/* Take the size of an array and its elements as input from the user and print the elements of the array that are located at even indices.

Input Format
The function interacts with the user through standard input (console).

Output Format
Print the even-indexed array elements on a single line, each element separated by a space.

Sample Inputs & Outputs
Sample Input 1
3
20 40 60
Sample Output 1
20 60
Sample Input 2
5
2 4 6 8 10
Sample Output 2
2 6 10
Constraints
The size of the array is a positive integer.

The elements of the array are integers. */
package Array_Traversal;

import java.util.Scanner;

public class PrintEvenIndexArrayElements {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        printEvenIndexArrayElements(arr);
        scanner.close();
    }

    public static void printEvenIndexArrayElements(int[] arr) {
        // Your logic here
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
