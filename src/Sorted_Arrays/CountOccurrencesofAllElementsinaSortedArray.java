/* Count the number of occurrences for each unique element in a sorted array.

Input Format
The input consists of two lines: -

The first line contains a single integer, N, representing the size of the array (1 ≤ N ≤ 10^5).

The second line contains N space-separated integers, A[1], A[2], ..., A[N], representing the elements of the array (-10^9 ≤ A[i] ≤ 10^9).

Output Format
Print N lines, each containing two space-separated integers: X and Y. Here, X represents a unique element from the array, and Y represents the number of times X occurs in the array. The lines should be printed in ascending order of X.

Sample Inputs & Outputs
Sample Input 1
8
1 2 3 3 4 4 4 5
Sample Output 1
1 1
2 1
3 2
4 3
5 1
Sample Input 2
6
1 2 3 4 5 6
Sample Output 2
1 1
2 1
3 1
4 1
5 1
6 1
Constraints
1 ≤ N ≤ 10^5

-10^9 ≤ A[i] ≤ 10^9 */
package Sorted_Arrays;

import java.util.Scanner;
import java.util.TreeMap;

public class CountOccurrencesofAllElementsinaSortedArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] array = new int[N];

        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }

        // Count unique occurrences
        TreeMap<Integer, Integer> uniqueOccurrences = new TreeMap<>();

        for (int element : array) {
            uniqueOccurrences.put(element, uniqueOccurrences.getOrDefault(element, 0) + 1);
        }

        // Print the output
        for (int key : uniqueOccurrences.keySet()) {
            System.out.println(key + " " + uniqueOccurrences.get(key));
        }
        scanner.close();
    }

}
