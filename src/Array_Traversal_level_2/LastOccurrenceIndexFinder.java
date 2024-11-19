/* Find the index of the last occurrence of a given character in a string.

Input Format
The first line contains a string.

The second line contains a single character

Output Format
The program outputs a single line containing the index of the last occurrence of the given character in the input string.

Sample Inputs & Outputs
Sample Input 1
Hello World!
o
Sample Output 1
7
Sample Input 2
Tapacademy
a
Sample Output 2
5
Constraints
The maximum length of the input string is 1000 characters.

The input character is a single valid ASCII character. */
package Array_Traversal_level_2;

import java.util.Scanner;

public class LastOccurrenceIndexFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char s = scanner.nextLine().charAt(0);
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            if (s == ch) {
                System.out.print(i);
                break;
            }
        }
        scanner.close();
    }
}
