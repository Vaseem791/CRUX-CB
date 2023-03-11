/*Take as input S, a string. Write a program that inserts between each pair of characters 
  the difference between their ascii codes and print the ans.
 

Input Format
String

Constraints
Length of String should be between 2 to 1000.

Output Format
String

Sample Input
acb

Sample Output
a2c-1b

Explanation
For the sample case, the Ascii code of a=97 and c=99 ,
the difference between c and a is 2.Similarly ,the Ascii code of b=98 and c=99 and their difference is -1.
 So the ans is a2c-1b.
 */
package Strings;

import java.util.*;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(diffAsciiCode(str));
	}

	public static String diffAsciiCode(String str) {
		String ans = "";
		for (int i = 0; i < str.length() - 1; i++) {
			ans = ans + str.charAt(i);
			int diff = str.charAt(i + 1) - str.charAt(i);
			ans = ans + diff;
		}
		ans = ans + str.charAt(str.length() - 1);
		return ans;

	}
}
