/* Given a string, find the largest word from it.

Input Format
The input consists of a single line containing a string, S.

Output Format
Print the largest word from the given string. If there are multiple such words print the first occurance

Sample Inputs & Outputs
Sample Input 1
Work is Worship
Sample Output 1
Worship
Sample Input 2
Hello World
Sample Output 2
Hello
Constraints
The input string contains at most 10^6 characters. */
package String_traversal_3;

import java.util.Scanner;

public class LargestWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] splited = s.split("\\s+");
        String r = "";
        int min = Integer.MIN_VALUE;
        for (String c : splited) {
            if (c.length() > min) {
                min = c.length();
                r = c;
            }
        }
        System.out.println(r);
        scanner.close();
    }
}
