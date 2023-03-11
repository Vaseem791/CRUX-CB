/*Take as input S, a string. Write a function that toggles the case of all characters in the string. Print the value returned.

Input Format
String

Constraints
Length of string should be between 1 to 1000.

Output Format
String

Sample Input
abC
Sample Output
ABc
Explanation
Toggle Case means to change UpperCase character to LowerCase character and vice-versa.
*/
package Strings;

import java.util.*;

public class Toggle_Case {
	public static void main(String args[]) {

		Scanner scn = new Scanner(System.in);
		String s = scn.next();
		String s1 = "";
		for (int i = 0; i < s.length(); i++) {
			if (Character.isUpperCase(s.charAt(i))) {
				s1 = s1 + Character.toLowerCase(s.charAt(i));
			} else {
				s1 = s1 + Character.toUpperCase(s.charAt(i));
			}
		}
		System.out.println(s1);
	}
}
