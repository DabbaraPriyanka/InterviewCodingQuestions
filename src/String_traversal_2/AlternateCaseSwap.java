/* Given a string, swap the case of each character in an alternate manner means uppercase to lowercase and lowercase to uppercase

Input Format
The input consists of a single line containing a string, S.

Output Format
Print a single string with the case of each character swapped in an alternate manner.

Sample Inputs & Outputs
Sample Input 1
STRinG PrOGRam
Sample Output 1
strINg pRogrAM
Sample Input 2
HeLLo WoRLd
Sample Output 2
hEllO wOrlD
Constraints
The input string contains at most 10^6 characters. */
package String_traversal_2;

import java.util.Scanner;

public class AlternateCaseSwap {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        String output = AlphaSWap(s);
        System.out.print(output);
        scanner.close();
    }

    public static String AlphaSWap(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            if (Character.isUpperCase(currentChar)) {
                result.append((char) (currentChar + 32));
            } else if (Character.isLowerCase(currentChar)) {
                result.append((char) (currentChar - 32));
            } else {
                result.append(currentChar);
            }
        }

        return result.toString();
    }

}