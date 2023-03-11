package Strings;

import java.util.*;

public class Form_Biggest_NUmber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t > 0) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				 arr[i]=sc.nextInt();
			}
			t--;
			IsNumber(arr); 
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]);
			}
		}	
	}

	public static void IsNumber(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i; j++) {
				if (campare(arr[j], arr[j + 1]) > 0) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public static long campare(int a, int b) {
		// TODO Auto-generated method stub
		String n1n2 = "" + a + b;
		String n2n1 = "" + b + a;
		return Long.parseLong(n2n1) - Long.parseLong(n1n2);

	}
}
