import java.util.*;
class Lastoccur {
	public static int Lastoccur(int [] arr, int idx, int find) {
		if (idx == arr.length) {
			return -1;
		}
		int OccurenceFound = Lastoccur(arr, idx + 1, find);
		if (OccurenceFound != -1) {
			return OccurenceFound;
		} else {
			if (arr[idx] == find) {
				return idx;
			} else {
				return -1;
			}
		}
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int [] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		int find = scn.nextInt();
		System.out.println(Lastoccur(arr, 0, find));
	}
}