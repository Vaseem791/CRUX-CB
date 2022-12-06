/* After eating to his stomach's limit, Lakshya bhaiya realized that he forgot to eat dessert. Help Lakshya bhaiya select the lightest dessert !!

Take an input N, the number of dessert choices. Take N more inputs. Where n1,n2,n3….nN represents the weight of each each dessert. For eg- ni => is the wieght of dessert menu number i.

Write a function which returns the dessert menu number of the lightest dessert.

Print the value returned.

Note : Remember the dessert menu number starts from 1

Input Format
First line contains integer n as size of the menu. Next n lines contains the weight of each dessert in the menu.

Constraints
N cannot be Negative. Range of Weight can be between 0 to 100000

Output Format
Print the required output.

Sample Input
4
99 81 23 25
Sample Output
3
Explanation
Menu is like this :

Order number => Weight
1 => 99

2 => 81

3 =>23

4=> 25

Hence lightest dessert is 25 with order number 4.*/

package Sorting;

import java.util.*;

public class IceCream {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(ice_cream(arr));
	}

	public static int ice_cream(int[] arr) {
		int min = arr[0];
		int index = 1;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
				index = i + 1;
			}
		}
		return index;
	}
}
