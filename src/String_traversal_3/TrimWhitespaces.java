/* Given a string, trim the leading and trailing whitespaces.

Input Format
The input consists of a single line containing a string, S.

Output Format
Print a single string with no leading and trailing whitespaces.

Sample Inputs & Outputs
Sample Input 1
 Hello 
Sample Output 1
Hello
Sample Input 2
 Trim 
Sample Output 2
Trim
Constraints
The input string contains at most 10^6 characters. */
package String_traversal_3;

import java.util.Scanner;

public class TrimWhitespaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String sub = scanner.nextLine();
        int count = 0;
        for (int s = 1; s <= sub.length(); s++) {
            for (int i = 0; i <= str.length() - s; i++) {
                String r = "";
                for (int j = i; j < s + i; j++) {
                    r += str.charAt(j);
                }
                if (r.equals(sub)) {
                    count++;
                }
            }
        }
        System.out.print(count);
        scanner.close();
    }
}
