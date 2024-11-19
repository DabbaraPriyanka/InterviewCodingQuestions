/* Rearrange the array by moving all 0 elements to the beginning while maintaining the relative order of positive integers.

Input Format
The input consists of a single line containing space-separated integers, representing the array elements.

The array can have duplicates and may contain a variable number of elements.

Output Format
A line containing space-separated integers representing the rearranged array.

Sample Inputs & Outputs
Sample Input 1
7
3 0 4 0 2 0 8
Sample Output 1
0 0 0 3 4 2 8
Sample Input 2
8
5 0 2 0 1 0 3 0
Sample Output 2
0 0 0 0 5 2 1 3
Constraints
The length of the array is between 1 and 10^5. 

The elements of the array are positive integers or 0. 

The number of 0 elements in the array is at least 1. */
package Arrays_miscellaneous;

import java.util.Scanner;

public class RearrangeArraywith0attheBeginning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ar[] = new int[n];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = scanner.nextInt();
        }
        scanner.close();
        int i = ar.length - 1;
        int j = ar.length - 1;

        while (i > -1) {
            if (ar[i] == 0) {
                i--;
            } else {
                ar[j--] = ar[i--];
            }
        }
        while (j > -1) {
            ar[j--] = 0;
        }

        for (i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
    }
}
