import java.util.*;
import java.io.*;
class DisplayReverse {
	public static void solution(int [] arr, int idx) {
		if (idx == arr.length) {
			return;
		}
		solution(arr, idx + 1);
		System.out.println(arr[idx]);
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		solution(arr, 0);
	}
}