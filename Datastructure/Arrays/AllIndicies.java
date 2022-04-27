import java.util.*;
import java.io.*;
class AllIndicies {
	public static void AllIndexes(int[]arr, int find, int idx) {
		if (idx == arr.length) {
			System.out.println(-1);
			return;
		}
		if (arr[idx] == find) {
			System.out.println(idx - 1);
		}
		AllIndexes(arr, find, idx + 1);
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int [] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		int find = scn.nextInt();
		AllIndexes(arr, find, 0);
	}
}