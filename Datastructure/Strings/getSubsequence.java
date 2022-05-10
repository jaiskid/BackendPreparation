import java.util.*;
class getSubsequence {
	public static ArrayList<String> getsub(String str) {
		if (str.length() == 0) {
			ArrayList<String> ba = new ArrayList<>();
			ba.add("");
			return ba;
		}
		char ch = str.charAt(0);
		String ros = str.substring(1);
		ArrayList<String> smallans = getsub(ros);
		ArrayList<String> finalans = new ArrayList<>();
		for (String s : smallans) {
			finalans.add(s);
			finalans.add(ch + s);
		}
		return finalans;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		while (n-- > 0) {
			String input = scn.next();
			ArrayList<String> result = getsub(input);
			System.out.println(result);
			System.out.println();
		}


	}
}