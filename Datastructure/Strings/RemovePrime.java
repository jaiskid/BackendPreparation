import java.util.*;
import java.io.*;
class RemovePrime {
	private static Boolean PrimeChecker(int element) {
		if (element == 1) {
			return false;
		}
		for (int i = 2; i * i <= element; i++) {
			if (element % i == 0) {
				return false;
			}
		}
		return true;
	}
	private static void solution(ArrayList<Integer>al) {
		// ArrayList<Integer> result = new ArrayList<>();
		for (int i = al.size() - 1; i >= 0; i--) {
			int curr = al.get(i);
			if (PrimeChecker(curr)) {
				al.remove(i);
			}
		}
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			al.add(scn.nextInt());
		}
		solution(al);
		for(int element : al){
			System.out.println(element);
		}
	}
}