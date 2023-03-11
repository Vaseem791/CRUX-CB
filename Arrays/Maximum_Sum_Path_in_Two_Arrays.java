/*You are provided two sorted arrays. You need to find the maximum length of bitonic subsequence.
You need to find the sum of the maximum sum path to reach from beginning of any array to end of any of the two arrays. 
You can switch from one array to another array only at common elements.

Input Format
First line contains integer t which is number of test case. For each test case, it contains two integers n and m which is the size of arrays 
and next two lines contains n and m space separated integers respectively.

Constraints
1<=t<=100 1<=n,m<=100000

Output Format
Print the maximum path.

Sample Input
1
8 8
2 3 7 10 12 15 30 34
1 5 7 8 10 15 16 19
Sample Output
122

Explanation
122 is sum of 1, 5, 7, 8, 10, 12, 15, 30, 34

*/

package Arrays;

import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {

			int n = sc.nextInt();
			int m = sc.nextInt();
			int[] arr = new int[n];
			int[] brr = new int[m];
			for (int i = 0; i < arr.length; i++) {

				arr[i] = sc.nextInt();
			}
			for (int i = 0; i < brr.length; i++) {
				brr[i] = sc.nextInt();
			}
			System.out.println(pathSum(arr, brr));
		}

	}

	public static int pathSum(int[] arr, int[] brr) {
		int i = 0;
		int j = 0;
		int p = 0;
		int q = 0;
		int ans = 0;
		while (i < arr.length && j < brr.length) {
			if (arr[i] < brr[j]) {
				i++;
			} else if (arr[i] > brr[j]) {
				j++;
			} else {
				int sum1 = 0;
				int sum2 = 0;
				for (int k = p; k <= i; k++) {
					sum1 = sum1 + arr[k];

				}
				for (int k = q; k <= j; k++) {
					sum2 += brr[k];

				}
				ans = ans + Math.max(sum1, sum2);
				i++;
				j++;
				p = i;
				q = j;
			}
		}

		if (i == arr.length) {
			for (int k = q; k < brr.length; k++) {
				ans = ans + brr[k];
			}
		}

		if (j == brr.length) {
			for (int k = p; k < arr.length; k++) {
				ans = ans + arr[k];
			}
		}
		return ans;

	}
}
