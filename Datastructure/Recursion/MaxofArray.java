import java.util.*;
import java.io.*;
class MaxofArray {
	public static int MaxArray(int[]arr,int idx){
		if(idx == arr.length-1){
			return arr[idx];
		}
		int maxelement = MaxArray(arr,idx+1);
		return Math.max(maxelement,arr[idx]);
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int [] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		System.out.println(MaxArray(arr,0));
	}
}