import java.util.*;
import java.io.*;
class Encoding {
	public static void printEncoding(String str, String ans) {
		if (str.length() == 0) {
			System.out.println(ans);
			return;
		}
		if (str.charAt(0) == '0') {
			return;
		}
		int ch0 = str.charAt(0) - '0';
		String ros1 = str.substring(1);
		//added first character encoding into ans set
		printEncoding(ros1, ans + (char)(ch0 - 1 + 'a'));
		if (str.length() >= 2) {
			int ch1 = str.charAt(1) - '0';
			String ros2 = str.substring(2);
			int val = ch0 * 10 + ch1;
			if (val <= 26) {
				printEncoding(ros2, ans + (char)(val - 1 + 'a'));
			}
		}
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		printEncoding(str, "");
	}
}