import java.util.*;
class stringCompression {
	public static String Compression(String result) {
		String s = "";
		s += result.charAt(0);
		for (int i = 1; i < result.length(); i++) {
			char curr = result.charAt(i);
			char prev = result.charAt(i - 1);
			if (prev != curr) {
				s += curr;
			}
		}
		return s;
	}
	public static String Compression2Int(String result) {
		String s = "";
		int count = 1;
		s += result.charAt(0);
		for (int i = 1; i < result.length(); i++) {
			char curr = result.charAt(i);
			char prev = result.charAt(i - 1);
			if (prev == curr) {
				count++;
			} else {
				if (count > 1) {
					s += count;
					count = 1;
				}
				s+=curr;
			}
		}
		if(count > 1){
			s+=count;
			count = 1;
		}
		return s;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String input = scn.next();
		System.out.println(Compression(input));
		System.out.println(Compression2Int(input));
	}
}