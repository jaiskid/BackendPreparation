import java.util.*;
class SubString {
	public static void subString(String str) {
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1 ; j <= str.length(); j++) {
				System.out.println(str.substring(i, j));
			}
		}
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String input = scn.next();
		subString(input);
	}
}