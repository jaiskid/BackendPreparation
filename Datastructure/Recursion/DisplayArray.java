import java.util.*;
import java.io.*;
class DisplayArray {
	public static void Display(int [] arr, int n) {
		if (n == 0) {
			return;
		}
		System.out.println(arr[n-1]);
		Display(arr, n - 1);
		System.out.println(arr[n-1]);
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int [] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		Display(arr,n);
	}
}