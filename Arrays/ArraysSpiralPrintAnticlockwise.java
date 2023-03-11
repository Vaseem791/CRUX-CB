/*Take as input a 2-d array. Print the 2-D array in spiral form anti-clockwise.

Input Format
Two integers M(row) and N(colomn) and further M * N integers(2-d array numbers).

Constraints
Both M and N are between 1 to 10.

Output Format
All M * N integers separated by commas with 'END' written in the end(as shown in example).

Sample Input
4 4
11 12 13 14
21 22 23 24
31 32 33 34
41 42 43 44
Sample Output
11, 21, 31, 41, 42, 43, 44, 34, 24, 14, 13, 12, 22, 32, 33, 23, END
Explanation
For spiral level anti-clockwise traversal, Go for first column-> last row ->last column-> first row and then do the same traversal for the remaining matrix .*/
package Arrays;

import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		int mat[][] = new int[row][col];
		for (int r = 0; r < mat.length; r++) {
			for (int c = 0; c < mat[0].length; c++) {
				mat[r][c] = sc.nextInt();
			}

		}
		anticlock(mat);
	}

	public static void anticlock(int[][] mat) {
		int rs = 0;
		int re = mat.length - 1;
		int cs = 0;
		int ce = mat[0].length - 1;
		int count = 0;
		int lim = mat.length * mat[0].length;

		while (rs <= re && cs <= ce) {
			for (int r = rs; r <= re && count < lim; r++) {
				System.out.print(mat[r][cs] + ",");
				count++;

			}
			System.out.print("");

			for (int c = cs + 1; c <= ce && count < lim; c++) {
				System.out.print(mat[re][c] + ",");
				count++;

			}
			System.out.print("");

			for (int r = re - 1; r >= rs && count < lim; r--) {
				System.out.print(mat[r][ce] + ",");
				count++;

			}
			System.out.print("");

			for (int c = ce - 1; c >= cs + 1 && count < lim; c--) {
				System.out.print(mat[rs][c] + ",");
				count++;

			}
			System.out.print("");
			rs++;
			re--;
			cs++;
			ce--;

		}
		System.out.print("End");

	}
}
