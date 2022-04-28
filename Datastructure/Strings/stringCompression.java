import java.util.*;
class stringCompression {
	public static String compression(String str) {
		String temp = str.charAt(0) + "";
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) != str.charAt(i - 1)) {
				temp += str.charAt(i);
			}
		}
		return temp;
	}
	public static String compressionInt(String str) {
		String temp = str.charAt(0) + "";
		int count = 1;
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == str.charAt(i - 1)) {
				count++;
			} else {
				if (count > 1) {
					temp += count;
				}
				count = 1;
				temp += str.charAt(i);

			}
		}
		if (count > 1)
			temp = temp + count;
		return temp;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String input = scn.next();
		System.out.println(compression(input));
		System.out.println(compressionInt(input));
	}
}