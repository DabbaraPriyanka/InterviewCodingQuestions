/* Write a program that creates an array to store float numbers and prints 
all the float elements by taking inputs individually using a loop.

Input Format
The first line contains an integer value N, the number of elements.

The second line contains N space separated decimal values.

Output Format
Print each float element on a new line.

Sample Inputs & Outputs
Sample Input 1
3
2.4 4.7 6.1
Sample Output 1
2.4
4.7
6.1
Sample Input 2
2
8.9 9.2
Sample Output 2
8.9
9.2
Constraints
1 <= N <= 1000, where N is the number of float numbers. */
package Array_Traversal_level_2;

import java.util.Scanner;

public class PrintFloatElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float arr[] = new float[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextFloat();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        sc.close();
    }
}
