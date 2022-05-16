import java.util.*;
import java.io.*;
class GetMazePath {
	public static ArrayList<String> getMazePath(int sr, int sc, int dr, int dc) {
		if (sr == dr && sc == dc) {
			ArrayList<String> bans = new ArrayList<>();
			bans.add("");
			return bans;
		}
		if (sr > dr || sc > dc) {
			return new ArrayList<>();
		}
		ArrayList<String> resultOne = getMazePath(sr, sc + 1, dr, dc);
		ArrayList<String> resultTwo = getMazePath(sr + 1, sc, dr, dc);
		ArrayList<String> result = new ArrayList<>();
		for (int i = 0; i < resultOne.size(); i++) {
			result.add("H" + resultOne.get(i));
		}
		for (int i = 0; i < resultTwo.size(); i++) {
			result.add("V" + resultTwo.get(i));
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int m = scn.nextInt();
		int n = scn.nextInt();
		ArrayList<String> result = getMazePath(0, 0, m - 1, n - 1);
		System.out.println(result);
	}
}