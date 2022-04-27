import java.util.*;
import java.io.*;
class DisplayArray {
	public static void solution(int [] arr, int idx) {
		if (idx == arr.length) {
			return;
		}
		System.out.println(arr[idx]);
		solution(arr, idx + 1);
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