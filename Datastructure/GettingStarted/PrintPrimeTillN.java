import java.util.*;
class PrintPrimeTillN {
	//Time Complexity of this function is Square root of N
	public static boolean PrintPrime(int n) {
		int Number = n;
		for (int i = 2; i * i <= n; i++) {
			if ( Number % i == 0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		for (int i = 2; i <= n; i++) {
			if (PrintPrime(i)) {
				System.out.println(i);
			}
		}
	}
}