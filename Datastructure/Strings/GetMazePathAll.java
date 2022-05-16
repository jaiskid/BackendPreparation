import java.util.*;
import java.io.*;
class GetMazePathAll {
	public static ArrayList<String> getMazePathAll(int sr, int sc, int dr, int dc) {
		if (sr == dr && sc == dc) {
			ArrayList<String> bans = new ArrayList<String>();
			bans.add("");
			return bans;
		}
		ArrayList<String> result = new ArrayList<>();
		for (int jumps = 1; jumps <= dr - sr; jumps++) {
			ArrayList<String> verticalresult = getMazePathAll(sr + jumps, sc, dr, dc);
			for (String s : verticalresult) {
				result.add("V" + jumps + s);
			}
		}
		for (int jumps = 1; jumps <= dc - sc; jumps++) {
			ArrayList<String> Horizontalresult = getMazePathAll(sr, sc + jumps, dr, dc);
			for (String s : Horizontalresult) {
				result.add("H" + jumps + s);
			}
		}
		for (int jumps = 1; jumps <= Math.min(dr - sr, dc - sc); jumps++) {
			ArrayList<String> diagonalresult = getMazePathAll(sr + jumps, sc + jumps, dr, dc);
			for (String s : diagonalresult) {
				result.add("D" + jumps + s);
			}
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		ArrayList<String> result = getMazePathAll(0, 0, n - 1, m - 1);
		System.out.println(result);
	}
}