import java.io.*;
import java.util.*;
class MaxOfArray {
	public static int solutionforMax(int [] arr, int n) {
		if (n == 1) {
			return arr[0];
		}
		return Math.max(arr[n - 1], solutionforMax(arr, n - 1));
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		System.out.print(solutionforMax(arr, n));
		
	}
}