/*Take as input N, the size of an array. Take N more inputs and store that in an array. Take another number’s input as M. 
Write a function which returns the index on which M is found in an array, in case M is not found -1 is returned. Print the value returned.

1.It reads a number N.
2.Take Another N numbers as an input and store them in an Array.
3.Take another number M as an input.
4.If M is found in the Array the index of M is returned else -1 is returned and print the value returned.
Input Format
Constraints
N cannot be Negative. Range of Numbers can be between -1000000000 to 1000000000. M can be between -1000000000 to 1000000000.

Output Format
Sample Input
5
2
4
6
9
17
17
Sample Output
4
Explanation
Given array = {2, 4, 6, 9, 17}. Target number = 17. Index = 4.*/

package Arrays;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int[] arr = new int[num];
		int n = arr.length;
		for (int i = 0; i < num; i++) {
			arr[i] = scn.nextInt();
		}
		int target = scn.nextInt();
		int index = search(arr, target);
		if (index == -1) {
			System.out.println("-1");
		} else {
			System.out.println(index);
		}
	}

	public static int search(int arr[], int target) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				return i;
			}
		}

		return -1;
	}
}
