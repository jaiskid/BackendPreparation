import java.util.*;
import java.io.*;
class PrintMazePath {
	public static void printMazePath(int sr, int sc, int dr, int dc, String ans) {
		if (sr == dr && sc == dc) {
			System.out.println(ans);
			return;
		}
		if (sr < 0 || sc < 0 || sr > dr || sc > dc) {
			return;
		}
		printMazePath(sr + 1, sc, dr, dc, ans + 'V');
		printMazePath(sr, sc + 1, dr, dc, ans + 'H');
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		printMazePath(0, 0, n - 1, m - 1, "");
	}
}