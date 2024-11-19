/* Find the smallest repeating element in a descending sorted array.

Input Format
The first line contains an integer 'n' (2 <= n <= 100), representing the size of the array.

The second line contains 'n' space-separated integers, 
representing the elements of the array in descending order.

Output Format
Print the smallest repeating element in the array.

Sample Inputs & Outputs
Sample Input 1
5
10 7 5 5 3
Sample Output 1
5
Sample Input 2
5
9 8 7 6 6
Sample Output 2
6
Constraints
The array will be sorted in descending order.

The array will contain only integers.

(2 <= n <= 100) */
package Array_Traversal_level_2;

import java.util.Scanner;

public class SmallestRepeatingElement2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        int small = 999;
        int count = 0;
        for (int i = 1; i < N; i++) {
            if (arr[i - 1] == arr[i]) {
                if (arr[i] < small) {
                    small = arr[i];
                    count++;
                }
            }
        }
        if (count == 0) {
            System.out.print(-1);
        } else {
            System.out.print(small);
        }
        scanner.close();
    }
}
