/* Help Lakshya bhaiya spy on Ali. Tell him how many times did you see him!!

Note : Who is Ali?! An element.

Input Format
Take an input N, the size of array. Take N more inputs and store that in an array.

Take another integer input Ali in the next line.

Constraints
-1000,000,000<Ali<1000,000,000 size of array < 1000,000

Output Format
The count of number of ali's in the array !!

Sample Input
6
10 20 10 20 12 20
10

Sample Output
2 

Explanation
Ali is 20.

Ali comes 2 times in the array.

*/
package Arrays;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		 Scanner scn=new Scanner(System.in);
	       
			int n=scn.nextInt();
			int arr[]=new int[n];
			int count = 0;
			for(int i=0;i<n;i++) {
				arr[i]=scn.nextInt();
				
			}
				int target=scn.nextInt();
				System.out.println(findali(arr, target));
		}

		public static int findali(int[]arr, int target) {
			int count=0;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == target) {
					count++;
				}
			}
			return count;
		}
	}
