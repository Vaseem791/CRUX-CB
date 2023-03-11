/*Take as input a 2-d array.Print the 2-D array in sprial form clockwise.

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
11, 12, 13, 14, 24, 34, 44, 43, 42, 41, 31, 21, 22, 23, 33, 32, END
Explanation
For spiral level clockwise traversal, Go for first row-> last column ->last row -> first column and then do the same traversal for the remaining matrix .*/
package Arrays;

import java.util.Scanner;

public class Main {
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
		clockwise(mat);
	}

	public static void clockwise(int[][] mat) {
		int rows = mat.length;
		int cols = mat[0].length;
		int top = 0, bottom = rows - 1, left = 0, right = cols - 1;
		int dir = 1;

		while (top <= bottom && left <= right) {

			if (dir == 1) {
				for (int i = left; i <= right; ++i) {
					System.out.print(mat[top][i] + " ");
				}

				++top;
				dir = 2;
			} else if (dir == 2) {
				for (int i = top; i <= bottom; ++i) {
					System.out.print(mat[i][right] + " ");
				}

				--right;
				dir = 3;
			} else if (dir == 3) {
				for (int i = right; i >= left; --i) {
					System.out.print(mat[bottom][i] + " ");
				}

				--bottom;
				dir = 4;
			} else if (dir == 4) {
				for (int i = bottom; i >= top; --i) {
					System.out.print(mat[i][left] + " ");
				}

				++left;
				dir = 1;
			}
		}
	}
}
