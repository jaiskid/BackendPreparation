import java.util.*;
class PrintFibonacciTillN {
	// Time Complexity of this Function is O(N)
	public static void Printfibo(int n) {
		int a = 0;
		int b = 1;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			System.out.println(a);
			sum = a + b;
			a = b;
			b = sum;
		}
	}
	public static void main(String [] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		Printfibo(n);
	}
}