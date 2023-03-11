/*
Take as input N, a number. Print the following pattern. Can you do it recursively ?!

Hint : Bigger Problem? Smaller Problem ? wrt pattern

(for N =4)

*

* *

* * *

* * * *

* * * * *

Input Format
Enter the value of N

Constraints
None

Output Format
Tab separated (*)

Sample Input
5
Sample Output
*
*	*
*	*	*
*	*	*	*
*	*	*	*	*

*/


package Recursion;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		triangle(n, 1);
	}

	public static void triangle(int n, int i) {
		if (i>n) {
			return;
		}

		for (int j = 0; j < i; j++) {
			System.out.print("*\t");
		}
		System.out.println();
		triangle(n, i + 1);
	}
}
