import java.util.*;
class InverseOfNumber {
	//Linear Time complexity O(N)
	public static int InverseofNumber(int n) {
		int count = 1;
		int ans = 0;
		while (n != 0) {
			int remainder = n % 10;
			ans = ans + count * (int)Math.pow(10, remainder - 1);
			count++;
			n /= 10;
		}
		return ans;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		System.out.print(InverseofNumber(n));
	}
}