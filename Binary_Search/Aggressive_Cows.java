/*Farmer John has built a new long barn, with N (2 <= N <= 100,000) stalls. The stalls are located along a straight line at positions x1,…,xN (0 <= xi <= 1,000,000,000).

His C (2 <= C <= N) cows don't like this barn layout and become aggressive towards each other once put into a stall. To prevent the cows from hurting each other,
 FJ wants to assign the cows to the stalls, such that the minimum distance between any two of them is as large as possible. What is the largest minimum distance?

Input Format
First line contains N and C, separated by a single space, representing the total number of stalls and number of cows respectively.
 The next line contains N integers containing the indexes of stalls.

Constraints
2 <= N <= 100,000
0 <= xi <= 1,000,000,000
2 <= C <= N

Output Format
Print one integer: the largest minimum distance.

Sample Input
5 3
1 2 8 4 9
Sample Output
3
Explanation
Problem Credits - (Spoj)[http://www.spoj.com/problems/AGGRCOW/]
*/

import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int nos = sc.nextInt(); // numbers of stalls
		int noc = sc.nextInt(); // numbers of cows
		int stalls[] = new int[nos];

		for (int i = 0; i < stalls.length; i++) {
			stalls[i] = sc.nextInt();
		}

		System.out.println(largestminimumdistance(stalls, noc));

	}

	public static int largestminimumdistance(int[] stalls, int noc) {
		Arrays.sort(stalls);
		int s = stalls[0];
		int n = stalls.length;
		int e = stalls[n - 1] - stalls[0];
		int ans = 0;
		while (s <= e) {
			int mid = (s + e) / 2;
			if (isitpossible(stalls, mid, noc) == true) {
				ans = mid;
				s = mid + 1;
			} else {
				e = mid - 1;
			}
		}
		return ans;
	}

	public static boolean isitpossible(int[] stalls, int mid, int noc) {
		int cow = 1;
		int pos = stalls[0];
		int i = 1;
		while (i < stalls.length) {
			if (stalls[i] - pos >= mid) {
				cow++;
				pos = stalls[i];
			}
			if (cow == noc) {
				return true;
			}
			i++;
		}
		return false;
	}
}
