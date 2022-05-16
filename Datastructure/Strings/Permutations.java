import java.util.*;
import java.io.*;
class Permutations {
	public static void PrintPermutations(String str, String ans) {
		if (str.length() == 0) {
			System.out.println(ans);
			return;

		}
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			String ros = str.substring(0, i) + str.substring(i + 1);
			PrintPermutations(ros, ans + ch);
		}
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String input = scn.nextLine();
		PrintPermutations(input, "");
	}
}