import java.util.*;
class PrintAllsubstring {
	private static Boolean isPalindrome(String palindrome) {
		int s = 0;
		int e = palindrome.length() - 1;
		while (s <= e) {
			if (palindrome.charAt(s) != palindrome.charAt(e)) {
				return false;
			}
			s++;
			e--;
		}
		return true;
	}
	private static void printSubstring(String res) {
		for (int i = 0; i < res.length(); i++) {
			for (int j = i + 1; j <= res.length(); j++) {
				String palindrome = res.substring(i, j);
				if (isPalindrome(palindrome)) {
					System.out.println(palindrome);
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String result = scn.next();
		printSubstring(result);
	}
}