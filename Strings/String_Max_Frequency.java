/*Take as input S, a string. Write a function that returns the character with maximum frequency. 
  Print the value returned.

Input Format
String

Constraints
A string of length between 1 to 1000.

Output Format
Character

Sample Input
aaabacb

Sample Output
a

Explanation
For the given input string, a appear 4 times. Hence, it is the most frequent character.*/

package Strings;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(MaxOccuringChar(str));
	}

	static final int N = 256;

	static char MaxOccuringChar(String str) {
		int ctr[] = new int[N];

		for (int i = 0; i < str.length(); i++)
			ctr[str.charAt(i)]++;
		int max = -1;
		char result = ' ';

		for (int i = 0; i < str.length(); i++) {
			if (max < ctr[str.charAt(i)]) {
				max = ctr[str.charAt(i)];
				result = str.charAt(i);
			}
		}

		return result;
	}
}
