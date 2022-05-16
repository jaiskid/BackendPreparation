import java.util.*;
import java.io.*;
public class NQueen {
	public static Boolean isItsSafe(boolean[][] chess, int row, int col) {
		//check col
		for (int i = 0; i < row ; i++) {
			if (chess[i][col] == true) {
				return false;
			}
		}
		// check diagonal d1

		for (int i = row - 1, j = col + 1; i >= 0 && j < chess.length; i--, j++) {
			if (chess[i][j] == true) {
				return false;
			}
		}
		// check diagonal d2
		for (int i = row - 1, j = col - 1; i >= 0 && j >= 0 ; i--, j--) {
			if (chess[i][j] == true) {
				return false;
			}
		}
		return true;
	}
	public static void printNQueens(boolean[][] chess, String asf, int row) {
		if (row == chess.length) {
			System.out.println(asf + '.');
			return;
		}
		for (int col = 0; col < chess.length; col++) {
			if (isItsSafe(chess, row, col)) {
				chess[row][col] = true;
				printNQueens(chess, asf + row + '.' + col + ", ", row + 1);
				chess[row][col] = false;
			}

		}
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		printNQueens(new boolean[n][n], "", 0);
	}
}