/*Given an array nums of length n. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

Return the running sum of nums.

Input Format
First line contains an integer n representing number of elements. Next line contains n integers denoting array elements.

Constraints
1 <= nums.length <= 1000
-10^6 <= nums[i] <= 10^6

Output Format
An integer representing running sum array of the given array

Sample Input
4
1 2 3 4
Sample Output
1 3 6 10
Explanation
Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].*/
package Arrays;

import java.util.*;

public class RunningSumOfGivenArray {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int arr[] = new int[num];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();

		}
		RunningSum(arr);
		for (int vasl : arr) {
			System.out.print(vasl + " ");
		}
	}

	public static int[] RunningSum(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			arr[i] = arr[i - 1] + arr[i];
		}
		return arr;
	}
}
