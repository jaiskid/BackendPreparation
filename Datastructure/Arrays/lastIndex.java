import java.io.*;
import java.util.*;
class lastIndex {
	public static int lastIndex(int[] arr, int find, int n) {
		if (n == 0) {
			return -1;
		}
		if (arr[n - 1] == find) {
			return n - 1;
		}
		return lastIndex(arr, find, n - 1);
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		int find = scn.nextInt();
		System.out.println(lastIndex(arr, find, n));
	}
}