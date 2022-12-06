/*You are given an unordered array consisting of consecutive integers [1, 2, 3, …, n] without any duplicates. You are allowed to swap any two elements. You need to find the minimum number of swaps required to sort the array in ascending order.

Input Format
The first line contains an integer, n, the size of the array . The second line contains n space-separated integers arr[i].

Constraints
1 <= n <= 10^5 1 <= arr[i] <= n

Output Format
Print the minimum number of swaps to sort the given array.

Sample Input
4
4 3 1 2
Sample Output
3  */
package Sorting;

import java.util.Scanner;

public class MinimumSwap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		minimum(arr);
	}

	public static void minimum(int[] arr) {
		int cou = 0;
		for (int count = 1; count < arr.length; count++) {
			int e = arr.length - count;
			int max = 0;
			for (int i = 0; i <= e; i++) {
				if (arr[max] < arr[i]) {
					max = i;
				}
			}
			// max me e'
			if (arr[max] != arr[e]) {
				int temp = arr[max];
				arr[max] = arr[e];
				arr[e] = temp;
				cou++;
			}
		}
		System.out.println(cou);
	}
}
