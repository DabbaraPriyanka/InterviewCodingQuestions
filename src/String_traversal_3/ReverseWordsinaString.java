/* Reverse all the words in a given string while maintaining the order of the words.

Input Format
A single line containing a string of words.

Output Format
Print each word of the reversed string on a separate line.

Sample Inputs & Outputs
Sample Input 1
Tap academy
Sample Output 1
paT ymedaca
Sample Input 2
India is my country
Sample Output 2
aidnI si ym yrtnuoc
Constraints
The input string will contain at most 1000 characters.

The words in the string will only consist of alphabetical characters ,

(both uppercase and lowercase) and will be separated by a single space. */
package String_traversal_3;

import java.util.Scanner;

public class ReverseWordsinaString {

    static String reverse(String w) {
        String r = "";
        for (int i = w.length() - 1; i >= 0; i--) {
            r += w.charAt(i);
        }
        return r;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        String[] arr = string.split("\\s+");
        for (String w : arr) {
            System.out.print(reverse(w) + " ");
            scanner.close();
        }
    }
}
