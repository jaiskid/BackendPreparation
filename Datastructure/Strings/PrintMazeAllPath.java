import java.util.*;
import java.io.*;
class PrintMazeAllPath {
	public static void printMazeAllPath(int sr, int sc, int dr, int dc, String ans) {
		if (sr == dr && sc == dc) {
			System.out.println(ans);
			return;
		}
		for (int jumps = 1; jumps <= dc - sc; jumps++) {
			printMazeAllPath(sr, sc + jumps, dr, dc, ans + "H" + jumps );
		}
		for (int jumps = 1; jumps <= dr - sr; jumps++) {
			printMazeAllPath(sr + jumps, sc, dr, dc, ans + "V" + jumps);
		}
		for (int jumps = 1; jumps <= Math.min((dr - sr), (dc - sc)); jumps++) {
			printMazeAllPath(sr + jumps, sc + jumps, dr, dc, ans + "D" + jumps);
		}
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		printMazeAllPath(0, 0, n - 1, m - 1, "");
	}
}