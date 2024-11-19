/* Extracts and prints all the numerical values present in a given string in the order of their occurrence.

Input Format
The program takes a single line of input containing a string.

Output Format
Print the distinct numbers in the order of their occurrence. If no numbers are found, output 'No numbers found.'

Sample Inputs & Outputs
Sample Input 1
TAPacademy2021
Sample Output 1
2 0 2 1
Sample Input 2
Hello World!
Sample Output 2
No numbers found.
Constraints
1 <= String length <= 1000 */
package String_traversal_1;

import java.util.Scanner;

public class NumberPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int c = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if ((ch >= '0' && ch <= '9')) {
                System.out.print(ch + " ");
                c++;
            }
        }
        if (c == 0) {
            System.out.print("No numbers found.");
        }
        scanner.close();
    }
}
