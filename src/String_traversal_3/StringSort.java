/* Given a string, sort it in ascending order.

Input Format
The input consists of a single line containing a string, S.

Output Format
Print a single string representing the sorted characters of the given string.

Sample Inputs & Outputs
Sample Input 1
TAPACADEMY
Sample Output 1
AAACDEMPTY
Sample Input 2
HelloWorld
Sample Output 2
 HWdellloor
Constraints
The input string contains at most 10^6 characters. */
package String_traversal_3;

import java.util.Scanner;

public class StringSort {

    static String sortString(String s) {

        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        String res = new String(arr);

        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.print(sortString(s));
        scanner.close();
    }
}