/* Print all possible substrings of a given string.

Input Format
The input consists of a single line containing a string, `str`.

Output Format
Multiple lines, each containing a substring of the input string.

Sample Inputs & Outputs
Sample Input 1
abc
Sample Output 1
a
b
c
ab
bc
abc
Sample Input 2
tap
Sample Output 2
t
a
p
ta
ap
tap
Constraints
The string consists of lowercase alphabets only.

The length of the string is at least 1 and at most 1000. */
package String_traversal_3;

import java.util.Scanner;

public class PrintAllSubstrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        for (int s = 1; s <= str.length(); s++) {
            for (int i = 0; i <= str.length() - s; i++) {
                String r = "";
                for (int j = i; j < s + i; j++) {
                    r += str.charAt(j);
                }
                System.out.println(r);
            }
        }
        scanner.close();
    }
}
