import java.util.*;
import java.io.*;
class PrintKpc {
	public static void printkpc(String str, String ans) {
		if (str.length() == 0) {
			System.out.println(ans);
			return;
		}
		String [] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
		char ch = str.charAt(0);
		String ros = str.substring(1);
		String code = codes[ch - '0'];
		for (int i = 0; i < code.length(); i++) {
			printkpc(ros,  ans + code.charAt(i));
		}
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(str);
		printkpc(str, "");
	}
}