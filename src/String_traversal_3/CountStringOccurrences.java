/* Count the occurrences of a smaller string in a larger string.

Input Format
The input consists of two lines. The first line contains the larger string `str1`, and the second line contains the smaller string `str2`.

Output Format
A single line containing an integer, representing the count of occurrences of `str2` in `str1`.

Sample Inputs & Outputs
Sample Input 1
abababab
aba
Sample Output 1
3
Sample Input 2
tapacademytapacademy
tap
Sample Output 2
2
Constraints
Both `str1` and `str2` consist of lowercase alphabets only.

 The length of `str1` and `str2` is at least 1 and at most 1000. 

The length of `str2` is less than or equal to the length of `str1`. */
package String_traversal_3;

import java.util.Scanner;

public class CountStringOccurrences {
    public static int countOccurrences(String str1, String str2) {
        int count = 0;
        int str1Length = str1.length();
        int str2Length = str2.length();
        for (int i = 0; i <= str1Length - str2Length; i++) {
            boolean match = true;
            for (int j = 0; j < str2Length; j++) {
                if (str1.charAt(i + j) != str2.charAt(j)) {
                    match = false;
                    break;
                }
            }
            if (match) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        int count = countOccurrences(str1, str2);
        System.out.println(count);
        scanner.close();
    }
}
