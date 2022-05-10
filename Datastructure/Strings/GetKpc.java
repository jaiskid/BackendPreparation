import java.util.*;
import java.io.*;
class GetKpc {
	public static ArrayList<String> getKpc(String str) {
		if (str.length() == 0) {
			ArrayList<String> ba = new ArrayList<>();
			ba.add("");
			return ba;
		}

		String [] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
		char ch = str.charAt(0);
		String ros = str.substring(1);
		ArrayList<String> rans = getKpc(ros);
		String code = codes[ch - '0'];
		ArrayList<String> finalAns = new ArrayList<>();
		for (int i = 0; i < code.length(); i++) {
			for (int j = 0; j < rans.size(); j++) {
				finalAns.add(code.charAt(i) + rans.get(j));
			}
		}
		return finalAns;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		while (n-- > 0) {
			String combination = scn.next();
			ArrayList<String> result = getKpc(combination);
			System.out.println(result);
			System.out.println();
		}

	}
}