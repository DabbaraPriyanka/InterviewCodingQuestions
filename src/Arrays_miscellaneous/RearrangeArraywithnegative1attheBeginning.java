/* Rearrange the array by moving all -1 elements to the beginning while maintaining the relative order of positive integers.

Input Format
The input consists of a single line containing space-separated integers, representing the array elements.

Output Format
A line containing space-separated integers representing the rearranged array.

Sample Inputs & Outputs
Sample Input 1
7
3 5 -1 2 8 -1 7
Sample Output 1
-1 -1 3 5 2 8 7
Sample Input 2
8
1 4 -1 6 -1 9 2 -1
Sample Output 2
-1 -1 -1 1 4 6 9 2
Constraints
The length of the array is between 1 and 10^5.

The elements of the array are positive integers or -1. 

The number of -1 elements in the array is at least 1. */
package Arrays_miscellaneous;

import java.util.Scanner;

public class RearrangeArraywithnegative1attheBeginning {

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
            if (ar[i] == -1) {
                i--;
            } else {
                ar[j--] = ar[i--];
            }
        }
        while (j > -1) {
            ar[j--] = -1;
        }

        for (i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
    }
}
