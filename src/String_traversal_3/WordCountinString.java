/* Counts the number of words in a given string[words might be separated by multiple space].

Input Format
The input consists of a single line containing the input string.

Output Format
Output the count of words in the given string.

Sample Inputs & Outputs
Sample Input 1
Hello World!
Sample Output 1
2
Sample Input 2
Programming is fun
Sample Output 2
3
Constraints
1 <= String length <= 1000 */
package String_traversal_3;

import java.util.Scanner;

public class WordCountinString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ' && s.charAt(i + 1) != ' ') {
                count++;
            }
        }
        System.out.println(count + 1);
        scanner.close();
    }
}
