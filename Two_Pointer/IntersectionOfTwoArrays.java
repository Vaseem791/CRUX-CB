/*Take as input N, the size of array. Take N more inputs and store that in an array.
 *Take N more inputs and store that in another array. 
 * Write a function which gives the intersection of two arrays in an ArrayList of integers and Print the ArrayList.*/
package Two_Pointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class IntersectionOfTwoArrays {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr1 = new int[n];
		int[] arr2 = new int[n];
		for (int i = 0; i < n; i++) {
			arr1[i] = scn.nextInt();
		}
		for (int i = 0; i < n; i++) {
			arr2[i] = scn.nextInt();
		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		ArrayList<Integer> Al = intersection(arr1, arr2);
		System.out.println(Al);
	}

	public static ArrayList<Integer> intersection(int[] arr1, int[] arr2) {
		ArrayList<Integer> Al = new ArrayList<>();
		int i = 0;
		int j = 0;
		while (i < arr1.length && j < arr2.length) {
			if (arr2[j] == arr1[i]) {
				Al.add(arr2[j]);
				j++;
				i++;
			} else if (arr2[j] > arr1[i]) {
				i++;
			} else {
				j++;
			}
		}
		return Al;
	}
}
