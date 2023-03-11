/*Given an array having n elements representing balls of various colours like red, white or blue, sort them in-place so that balls of the same colour are adjacent, with the colours in the order red, white and blue.
To represent the colour red, white, and blue we will use the integers 0, 1, and 2 respectively.
Note:You are not suppose to use the sort function for this problem.

Input Format
First line contains integer n as size of array. Next n lines contains a single integer as element of array.

Constraints
None

Output Format
Print the balls in order so that balls of same colour are adjacent.

Sample Input
6
2 0 2 1 1 0
Sample Output
0 0 1 1 2 2  */
package Sorting;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int arr[] = new int[n];
		int a = 0, b = 0, c = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
			if (arr[i] == 0) {
				a++;
			} else if (arr[i] == 1) {
				b++;
			} else {
				c++;
			}
		}
		for (int i = 0; i < a; i++) {
			System.out.print(0 + " ");
		}
		for (int i = 0; i < b; i++) {
			System.out.print(1 + " ");
		}
		for (int i = 0; i < c; i++) {
			System.out.print(2 + " ");
		}
	}
}
