/*Given an array arr of n integers where n > 1, return an array output such that output[i] is equal to the product of all the elements of arr except arr[i].

Input Format
First line contains integer N as size of array.
Next line contains a N integer as element of array.

Constraints
arr[i]<=10000000

Output Format
print output array

Sample Input
4
1 2 3 4
Sample Output
24 12 8 6 */
package Two_Pointer;

import java.util.*;
import java.util.Arrays;

public class ProductOfArrayExceptSelf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long arr[] = new long[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		long prod[] = new long[n];
		long right = 1;
		long ans[] = new long[n];
		prod[0] = arr[0];
		for (int i = 1; i < n; i++) {
			prod[i] = prod[i - 1] * arr[i];
		}

		for (int i = n - 1; i > 0; i--) {
			ans[i] = prod[i - 1] * right;
			right = right * arr[i];
		}
		ans[0] = right;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(ans[i] + " ");
		}

	}
}
