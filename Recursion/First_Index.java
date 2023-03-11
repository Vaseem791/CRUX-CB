/*
 Take as input N, the size of array. Take N more inputs and store that in an array. Take as input M, a number. 
 Write a recursive function which returns the first index at which M is found in the array and -1 if M is not found anywhere. Print the value returned.

Input Format
Enter a number N and add N more elements to an array, then enter a number M

Constraints
None

Output Format
Display the first index at which number M is found

Sample Input
5
3
2
1
2
2
2

Sample Output
1
 */
package Recursion;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		System.out.println(firstindex(arr, 0, m));
	}

	public static int firstindex(int[] arr, int i, int m) {
		if (i >= arr.length) {
			return -1;
		}

		if (arr[i] == m) {
			return i;
		}
		return firstindex(arr, i + 1, m);
	}
}
