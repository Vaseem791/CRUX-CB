/*
Take as input N, a number. Print odd numbers in decreasing sequence (up until 0) and even numbers in increasing sequence (up until N) using Recursion

Input Format
Constraints
1 <= N <=1000

Output Format
Sample Input
5
Sample Output
5
3
1
2
4
*/

package Recursion;

import java.util.Scanner;

public class Odd_Even {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		solve(n);
	}

	public static void solve(int n) {
		if (n <= 0) {
			return;
		}
		if (n % 2 == 1) {
			System.out.println(n);
		}
		solve(n - 1);
		if (n % 2 == 0) {
			System.out.println(n);
		}

	}
}
