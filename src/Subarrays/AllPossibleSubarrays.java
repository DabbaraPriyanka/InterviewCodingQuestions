/* Print all possible subarrays of a given array.

Input Format
The program takes the following input:

- The size of the array (integer)

- The elements of the array (space-separated integers)

Output Format
The program should output each subarray on a new line.

Each subarray should be displayed as a space-separated sequence of elements.

Sample Inputs & Outputs
Sample Input 1
3
1 2 3
Sample Output 1
1
1 2
1 2 3
2
2 3
3
Sample Input 2
4
10 20 30 40
Sample Output 2
10
10 20
10 20 30
10 20 30 40
20
20 30
20 30 40
30
30 40
40
Constraints
The size of the array is a positive integer. 

The elements of the array are integers. */
package Subarrays;

import java.util.Scanner;

public class AllPossibleSubarrays {
    static void subarray(int[] ar) {
        for (int k = 0; k < ar.length; k++) {
            for (int s = 1; s <= ar.length; s++) {
                for (int i = 0; i <= ar.length - s; i++) {
                    if (ar[i] == ar[k]) {
                        for (int j = i; j < i + s; j++) {
                            System.out.print(ar[j] + " ");
                        }
                        System.out.println();
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ar[] = new int[n];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = scanner.nextInt();
        }
        subarray(ar);
        scanner.close();
    }
}
