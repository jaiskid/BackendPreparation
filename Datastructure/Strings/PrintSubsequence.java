import java.util.*;
import java.io.*;
class PrintSubsequence {
	public static void PrintSubsequence(String str, String ans) {
		if (str.length() == 0) {
			System.out.println(ans);
			return;
		}
		char ch = str.charAt(0);
		String ros = str.substring(1);
		PrintSubsequence(ros, ans + "");
		PrintSubsequence(ros, ans + ch);
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String input = scn.next();
		PrintSubsequence(input, "");
	}
}