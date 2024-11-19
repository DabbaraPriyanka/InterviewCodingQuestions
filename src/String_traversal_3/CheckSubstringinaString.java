/* Check whether characters in the second string are present in the first string . There is no need for the characters to be consecutive.

Input Format
The input consists of two lines.

- The first line contains the first string, 'str1'.

- The second line contains the second string, 'str2'.

Output Format
Output 'Yes' if the characters in 'str2' are present in 'str1' in the same order, otherwise output 'No'.

Sample Inputs & Outputs
Sample Input 1
Academy
Tap
Sample Output 1
No
Sample Input 2
Programming
graming
Sample Output 2
Yes
Constraints
1 <= |str1|, |str2| <= 100

- The strings may contain alphabetic characters (both uppercase and lowercase), digits, and special characters.

- The strings will not be empty. */
package String_traversal_3;

import java.util.Scanner;

public class CheckSubstringinaString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        boolean result = checkCharactersInOrder(str1, str2);

        if (result) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        scanner.close();
    }

    public static boolean checkCharactersInOrder(String str1, String str2) {
        int index1 = 0;
        int index2 = 0;

        while (index1 < str1.length() && index2 < str2.length()) {
            char char1 = str1.charAt(index1);
            char char2 = str2.charAt(index2);

            if (char1 == char2) {
                index2++;
            }
            index1++;
        }
        return index2 == str2.length();
    }
}
