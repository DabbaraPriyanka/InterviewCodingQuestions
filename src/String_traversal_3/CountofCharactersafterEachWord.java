/* Find the count of characters after each word in a given string.

Input Format
A single line containing a string of words.

Output Format
A single line containing the count of characters after each word, separated by a space.

Sample Inputs & Outputs
Sample Input 1
Tap academy
Sample Output 1
Tap3 academy7
Sample Input 2
India is my country
Sample Output 2
India5  is2 my2 country7
Constraints
The input string will contain at most 1000 characters.

The words in the string will only consist of alphabetical characters (both uppercase and lowercase).

The input string may have leading or trailing spaces, and there may be multiple consecutive spaces between words. */
package String_traversal_3;

import java.util.Scanner;

public class CountofCharactersafterEachWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        input = input.trim().replaceAll("\\s+", " ");
        String[] s = input.split("\\s+");

        for (String w : s) {
            System.out.print(w + w.length() + " ");
        }
        scanner.close();
    }
}
