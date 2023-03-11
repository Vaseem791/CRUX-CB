package Strings;

import java.util.Scanner;

public class String_Palindrome {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	String S=scn.next();
	System.out.println(S);
	palindrome(S);
}
public static boolean palindrome(String S) {
	for(int i=0;i<S.length()/2;i++) {
		if (S.charAt(i)!=S.charAt(S.length()-1)) {
			
		}
	}
	return false;
	
}
}
