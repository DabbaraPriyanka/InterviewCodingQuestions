/* Given a string and a substring, find the frequency of the substring in the string.

Input Format
The input consists of two lines:

First line containing a string, S.

Second line containing a substring, SS.

Output Format
Print the frequency of the substring in the given string.

Sample Inputs & Outputs
Sample Input 1
TimadmgfdiTimsvsTim
Tim
Sample Output 1
3
Sample Input 2
HelloWorldHello
Hello
Sample Output 2
2
Constraints
The input string and substring contain at most 10^6 characters. */
package String_traversal_3;

import java.util.Scanner;

public class SubstringFrequency {
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
