/* Find the first element in a sorted array that is not in sorting order.

Input Format
The input consists of two lines.

- The first line contains an integer 'n' (2 <= n <= 100), representing the size of the array.

- The second line contains 'n' space-separated integers, 'arr[0]' to 'arr[n-1]', representing the elements of the array.

Output Format
Print the first element that is not in sorting order. If all elements are in sorting order, print -1.

Sample Inputs & Outputs
Sample Input 1
7
1 2 3 6 4 5 7
Sample Output 1
4
Sample Input 2
5
1 2 3 4 5
Sample Output 2
-1
Constraints
- The array will be sorted in ascending order. 

- The array will contain only integers.

 - The size of the array will be at least 2 and at most 100.

 - There will be at most one element that is not in sorting order. */
package Sorted_Arrays;

import java.util.Scanner;

public class FirstElementNotinSortingOrder {
    static int returnUnsorted(int ar[]) {
        for (int i = 0; i < ar.length - 1; i++) {
            if (ar[i] < ar[i + 1]) {
                continue;
            } else {
                return ar[i + 1];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ar[] = new int[n];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = scanner.nextInt();
        }
        System.out.println(returnUnsorted(ar));
        scanner.close();

    }

}