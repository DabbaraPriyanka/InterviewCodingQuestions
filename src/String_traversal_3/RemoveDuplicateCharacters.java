/* Given a lowercase string, remove duplicate characters from it.

Input Format
The input consists of a single line containing a lowercase string, S.

Output Format
Print the string after removing duplicate characters from the given string.

Sample Inputs & Outputs
Sample Input 1
hello
Sample Output 1
helo
Sample Input 2
programming
Sample Output 2
progamin
Constraints
The input string contains at most 10^6 characters. */
package String_traversal_3;

import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicateCharacters {
    static String removeDuplicate(String s) {
        StringBuilder r = new StringBuilder();
        HashSet<Character> p = new HashSet<>();

        for (char c : s.toCharArray()) {
            if (!p.contains(c)) {
                r.append(c);
                p.add(c);
            }
        }
        return r.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.print(removeDuplicate(s));
        scanner.close();
    }
}
