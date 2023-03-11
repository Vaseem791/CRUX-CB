/* 
Given a String line. Which may or may not have multiple words.

Reverse the whole string recursively

Input Format
Single line input containing a string

Constraints
Output Format
Print the reversed string

Sample Input
Hey there

Sample Output
ereht yeH 
      
 */

package Strings;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String r = sc.nextLine();
		String r2 = "";

		for (int i = r.length() - 1; i >= 0; i--) {
			r2 = r2 + r.charAt(i);
		}
		System.out.println(r2);
// Method 2: using StringBuffer		
//		StringBuffer r=new StringBuffer("Hey there");
//		System.out.println(r.reverse());
		
// Method 3: using StringBuilder		
//		StringBuilder ref=new StringBuilder("Hey there");
//		System.out.println(ref.reverse());
	}
}
