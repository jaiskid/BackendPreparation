import java.util.*;
import java.io.*;
class StringDifference {
	public static String difference(String input) {
		String temp = input.charAt(0) + "";
		for (int i = 1; i < input.length(); i++) {
			temp += (int)(input.charAt(i) - input.charAt(i - 1));
			temp += input.charAt(i);
		}
		return temp;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String input = scn.next();
		System.out.println(difference(input));
	}
}