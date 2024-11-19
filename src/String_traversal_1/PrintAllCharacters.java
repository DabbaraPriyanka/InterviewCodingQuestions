/* Given a string, print each character in a new line.

Input Format
The input consists of a single line containing a string, S.

Output Format
Print N lines, each line containing a single character from the input string.

Sample Inputs & Outputs
Sample Input 1
TapAcademy
Sample Output 1
T
a
p
A
c
a
d
e
m
y
Sample Input 2
HelloWorld
Sample Output 2
H
e
l
l
o
W
o
r
l
d
Constraints
The input string contains at most 10^6 characters. */
package String_traversal_1;

import java.util.Scanner;

public class PrintAllCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }
        scanner.close();
    }
}
