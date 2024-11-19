/* Rearrange the array by moving -1 elements to the end while maintaining the relative order of positive integers.

Input Format
First line contains size of the array n.

Next line contains n space separated integer values.

Output Format
A line containing space-separated integers representing the rearranged array.

Sample Inputs & Outputs
Sample Input 1
7
3 5 -1 2 8 -1 7
Sample Output 1
3 5 2 8 7 -1 -1
Sample Input 2
7
1 -1 4 2 -1 9 -1
Sample Output 2
1 4 2 9 -1 -1 -1
Constraints
The length of the array is between 1 and 10^5.

The elements of the array are positive integers or -1.

The number of -1 elements in the array is at least 1. */
package Arrays_miscellaneous;

import java.util.Scanner;

public class RearrangeArraywithnegative1attheEnd {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ar[] = new int[n];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = scanner.nextInt();
        }
        scanner.close();
        int i = 0;
        int j = 0;

        while (i < ar.length) {
            if (ar[i] == -1) {
                i++;
            } else {
                ar[j++] = ar[i++];
            }
        }
        while (j < ar.length) {
            ar[j++] = -1;
        }

        for (i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
    }
}
