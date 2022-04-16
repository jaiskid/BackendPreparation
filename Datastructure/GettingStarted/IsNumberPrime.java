import java.util.*;
class IsNumberPrime {
	//Linear Approach Time Complexity is O(N)
	public static boolean IsPrime(int n) {
		int Number = n;
		for (int i = 2; i < n; i++) {
			if (Number % i == 0) {
				return false;
			}
		}
		return true;
	}
	//Little Optimization applied Now Solution will work on Square root of N approach
	public static boolean IsprimeSquare(int n) {
		int Number = n;
		for (int i = 2; i * i <= n; i++) {
			if (Number % i == 0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while (t-- > 0) {
			int n = scn.nextInt();
			if (IsprimeSquare(n)) {
				System.out.println("prime");
			} else {
				System.out.println("not prime");
			}
		}
	}
};