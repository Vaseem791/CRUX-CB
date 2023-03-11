/*You are provided n numbers (both +ve and -ve). Numbers are arranged in a circular form. You need to find the maximum sum of consecutive numbers.

Input Format
First line contains integer t which is number of test case.
For each test case, it contains an integer n which is the size of array and next line contains n space separated integers denoting the elements of the array.

Constraints
1<=t<=100
1<=n<=1000
|Ai| <= 10000

Output Format
Print the maximum circular sum for each testcase in a new line.

Sample Input
1
7
8 -8 9 -9 10 -11 12
Sample Output
22
Explanation
Maximum Circular Sum = 22 (12 + 8 - 8 + 9 - 9 + 10)
*/
package Arrays;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- != 0) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}

			System.out.println(MaximumSum(arr));
		}

	}

	public static int MaximumSum(int[] arr) {
		int linear_sum = kadens(arr);
		int totalsum = 0;
		for (int i = 0; i < arr.length; i++) {
			totalsum = totalsum + arr[i];
			arr[i] = arr[i] * -1;

		}
		int mid_sum = kadens(arr);

		int curr_sum = totalsum + mid_sum;
		if (curr_sum == 0) {
			return linear_sum;
		}

		return Math.max(linear_sum, curr_sum);

	}

	public static int kadens(int[] arr) {

		int ans = Integer.MIN_VALUE;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			ans = Math.max(ans, sum);
			if (sum < 0) {
				sum = 0;
			}
		}
		return ans;

	}

}
