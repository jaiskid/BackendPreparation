import java.util.*;
class DigitOfNumber {
	public static void Digit(int n) {
		int ans = 0;
		while (n != 0) {
			int remainder = n % 10;
			System.out.print(remainder);
			n /= 10;
		}
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		Digit(n);
	}
}