import java.util.*;
import java.io.*;
class AllIndicies {
	public static void AllIndexes(int[] arr, int idx, int find) {
		if (idx == arr.length) {
			return;
		}
		if (arr[idx] == find) {
			System.out.println(idx);
		}
		AllIndexes(arr, idx + 1, find);
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int [] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		int find = scn.nextInt();
		AllIndexes(arr, 0, find);
	}
}