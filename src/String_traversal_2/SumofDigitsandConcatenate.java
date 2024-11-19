/* Given a string, calculate the sum of all the digits in the string and concatenate the sum at the end.

Input Format
The input consists of a single line containing a string, S.

Output Format
Print a single string with the sum of digits concatenated at the end.

Sample Inputs & Outputs
Sample Input 1
1One 2Two 3Three
Sample Output 1
One Two Three6
Sample Input 2
Hello123World
Sample Output 2
HelloWorld6
Constraints
The input string contains at most 10^6 characters. */
package String_traversal_2;

import java.util.Scanner;

public class SumofDigitsandConcatenate {

    static String con(String s) {
        String r = "";
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= '0' && ch <= '9') {
                sum += (((int) ch) - 48);
            } else {
                r += ch;
            }
        }
        return (r + sum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.print(con(s));
        scanner.close();
    }
}
