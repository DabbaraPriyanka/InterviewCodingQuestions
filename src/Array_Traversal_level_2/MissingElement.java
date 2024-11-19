/* Find the missing element in an unsorted array without using sorting.

Input Format
The first line consists of the size of the array, followed by a line containing space-separated integers representing the elements of the array.

Output Format
Output a single integer representing the missing element.

Sample Inputs & Outputs
Sample Input 1
6
1 4 2 7 5 3
Sample Output 1
6
Sample Input 2
10
1 2 3 6 8 7 4 5 10 11
Sample Output 2
9
Constraints
The length of the array will be positive and will not exceed 1000.

Each integer in the array will be between 1 and 10^9 (inclusive).

There will be exactly one element missing from the array. */
package Array_Traversal_level_2;

import java.util.HashSet;
import java.util.Scanner;

public class MissingElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = scanner.nextInt();
        }
        findMissingElement(ar, n);
        scanner.close();
    }

    public static void findMissingElement(int[] ar, int n) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(ar[i]);
        }
        for (int i = 1; i <= n; i++) {
            if (!set.contains(i)) {
                System.out.println(i);
                break;
            }
        }
    }
}
