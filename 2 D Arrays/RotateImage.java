/*Given a 2D array of size N x N. Rotate the array 90 degrees anti-clockwise.

Input Format
First line contains a single integer N. Next N lines contain N space separated integers.

Constraints
N < 1000

Output Format
Print N lines with N space separated integers of the rotated array.

Sample Input
4
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16

Sample Output
4 8 12 16 
3 7 11 15 
2 6 10 14 
1 5 9 13 

Explanation
Rotate the array 90 degrees anticlockwise.*/

package Two_D_Arrays;

import java.util.*;

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
		// transpose
		transpose(mat);
		for (int r = 0; r < mat.length; r++) {
			for (int c = 0; c < mat[0].length; c++) {
				System.out.print(mat[r][c] + " ");
			}
			System.out.println();
		}
	}

	public static void transpose(int[][] mat) {
		for (int r = 0; r < mat.length; r++) {
			int li = 0;
			int ri = mat[r].length - 1;
			while (li < ri) {
				int temp = mat[r][li];
				mat[r][li] = mat[r][ri];
				mat[r][ri] = temp;
				li++;
				ri--;
			}
		}

		for (int r = 0; r < mat.length; r++) {
			for (int c = r + 1; c < mat[0].length; c++) {
				int temp = mat[r][c];
				mat[r][c] = mat[c][r];
				mat[c][r] = temp;
			}
		}
	}
}
