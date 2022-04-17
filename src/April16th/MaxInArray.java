package April16th;

import java.util.Arrays;

public class MaxInArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {3,5,7,45,1,0};
		Arrays.sort(a);
		int i=0;
		PrintMax(a,i);
		

	}

	private static void PrintMax(int[] a, int i) {
		// TODO Auto-generated method stub
		if(i>=a.length-1) {
			System.out.println(a[i]+" ");
			return;
		}else {
		PrintMax(a,i+1);
		}
		
	}

}



