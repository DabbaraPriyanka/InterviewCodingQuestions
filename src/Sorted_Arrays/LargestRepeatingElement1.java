/* Find the largest repeating element in a sorted array. If there are multiple elements that appear the maximum number of times, return the last occurrence among them.

Input Format
The first line contains an integer 'n' , representing the size of the array.

The second line contains 'n' space-separated integers, representing the elements of the array in ascending order.

Output Format
Print the largest repeating element in the array.

Sample Inputs & Outputs
Sample Input 1
6
1 2 3 3 4 5
Sample Output 1
3
Sample Input 2
7
1 2 3 5 5 6 7
Sample Output 2
5
Constraints
The array will be sorted in ascending order.

2 <= n <= 100 */
package Sorted_Arrays;

import java.util.Scanner;

public class LargestRepeatingElement1 {

    static void LargestRepeatedElement(int[] ar) {
        for (int i = ar.length - 2; i > 0; i--) {
            if (ar[i] == ar[i + 1]) {
                System.out.print(ar[i]);
                return;
            }
        }

        System.out.print(-1);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int ar[] = new int[N];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = scanner.nextInt();
        }

        LargestRepeatedElement(ar);
        scanner.close();
    }
}
