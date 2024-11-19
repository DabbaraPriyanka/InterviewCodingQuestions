/* Print the words at odd indices followed by the words at even indices in a given string.

Input Format
A single line containing a string of words.

Output Format
Print the words at odd indices, followed by the words at even indices.

Sample Inputs & Outputs
Sample Input 1
India is my country
Sample Output 1
is India country my
Sample Input 2
Tap academy
Sample Output 2
academy Tap
Constraints
The input string will contain at most 1000 characters.

The words in the string will only consist of alphabetical characters (both uppercase and lowercase).

The input string may have leading or trailing spaces, and there may be multiple consecutive spaces between words. */
package String_traversal_3;

import java.util.Scanner;

public class PrintWordsbyOddandEvenIndices {
    static String removeSpace(String s) {
        s = s.trim().replaceAll("\\s+", " ");
        return s;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] w = removeSpace(s).split("\\s+");
        for (int i = 0; i < w.length - 1; i += 2) {
            System.out.print(w[i + 1] + " " + w[i] + " ");
        }
        scanner.close();
    }
}
