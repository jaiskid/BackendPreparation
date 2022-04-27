import java.util.*;
import java.io.*;
class firstIndex {
	private static int firstfinder(int[] arr, int find, int idx) {
		if (idx == arr.length)
			return -1;
		if (arr[idx] == find) {
			return idx;
		}
		return firstfinder(arr, find, idx + 1);
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		int find = scn.nextInt();
		System.out.print(firstfinder(arr, find, 0));
	}
}