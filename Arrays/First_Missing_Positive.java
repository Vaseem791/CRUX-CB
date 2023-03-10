/*Given an unsorted integer array arr, return the smallest missing positive integer.
You must implement an algorithm that runs in O(n) time and uses constant extra space.

Input Format
First line contains N(size of array).
Second line takes N integers of array.

Constraints
1<=N<=10^5
2^31<=arr[i]<=2^31+1

Output Format
Print the smallest missing positive number.

Sample Input
4
3 -1 4 1
Sample Output
2
Explanation
2 is the smallest missing positive integer in the array.
*/
package Arrays;

import java.util.Arrays;
import java.util.*;

public class First_Missing_Positive {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		int ans = Missing(arr);
		System.out.println(ans);
	}

	public static int Missing(int[] arr) {
		Arrays.sort(arr);
		int ans = 1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ans) {
				ans++;
			}
		}
		return ans;
	}
}
