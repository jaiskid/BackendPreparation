import java.util.*;
class Implment{
	public static int firstOcc(int[] arr, int idx, int find) {
		if (idx == arr.length) {
			return -1;
		}
		if (arr[idx] == find) {
			return idx;
		}
		return firstOcc(arr, idx + 1, find);
	}
}
class firstOccur {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int [] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		int find = scn.nextInt();
		Implment f1 = new Implment();
		System.out.println(f1.firstOcc(arr, 0, find));
	}
}