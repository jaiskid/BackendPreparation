import java.util.*;
class GetStairPath {
	public static ArrayList<String> getStairPath(int n) {
		if (n == 0) {
			ArrayList<String> bans = new ArrayList<>();
			bans.add("");
			return bans;
		}
		if(n<0){
			return new ArrayList<>();
		}
		ArrayList<String> one = getStairPath(n - 1);
		ArrayList<String> two = getStairPath(n - 2);
		ArrayList<String> three = getStairPath(n - 3);
		ArrayList<String> finalAnswer = new ArrayList<>();
		for (String i : one) {
			finalAnswer.add("1" + i);
		}
		for (String j : two) {
			finalAnswer.add("2" + j);
		}
		for (String k : three) {
			finalAnswer.add("3" + k);
		}
		return finalAnswer;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		System.out.print(getStairPath(n));
	}
}