/* Given a sentence, check if it is a pangram or not.

Input Format
A single line containing a sentence, str.

Output Format
Print 'pangram' if the sentence is a pangram; otherwise, print 'not pangram'.

Sample Inputs & Outputs
Sample Input 1
We promptly judged antique ivory buckles for the next prize
Sample Output 1
pangram
Sample Input 2
We promptly judged antique ivory buckles for the prize
Sample Output 2
not pangram
Constraints
The input sentence contains at most 10^6 characters. */
package String_traversal_3;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PangramCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sentence = scanner.nextLine().toLowerCase();

        Set<Character> letterSet = new HashSet<>();

        for (char c : sentence.toCharArray()) {
            if (Character.isLetter(c)) {
                letterSet.add(c);
            }
        }

        if (letterSet.size() == 26) {
            System.out.println("pangram");
        } else {
            System.out.println("not pangram");
        }
        scanner.close();
    }
}
