/* Given a string, find the frequency of a specific character in it.

Input Format
The input consists of two lines:

First line containing a string, S.

Second line containing a character.

Output Format
Print a single integer representing the frequency of the specific character in the given string.

Sample Inputs & Outputs
Sample Input 1
TAPACADEMY
A
Sample Output 1
3
Sample Input 2
Hello World
l
Sample Output 2
3
Constraints
The input string contains at most 10^6 characters. */
package String_traversal_3;

import java.util.Scanner;

public class CharacterFrequency {
    static int freq(String s, char c) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == c) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char c = scanner.nextLine().charAt(0);
        System.out.print(freq(s, c));
        scanner.close();
    }
}
