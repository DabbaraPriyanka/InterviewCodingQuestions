/*
 Write a program to add two integer numbers.
 Input Format
 First Line contain single integer m Second line contain single integer n

 Output Format
 Print sum of both the integers m and n

 Sample Inputs & Outputs
 Sample Input 1
 5
 10
 Sample Output 1
 15

 Sample Input 2
 20
 30
 Sample Output 2
 50

 Constraints
 1 <= m,n <= 1000
 */
package Data_Types;

import java.util.Scanner;

public class Add2Integers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your code here
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.print(a + b);
        scanner.close();
    }
}
