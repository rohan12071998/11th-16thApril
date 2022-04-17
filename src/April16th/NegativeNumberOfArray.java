package April16th;

import java.util.Arrays;

public class NegativeNumberOfArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int a[]= {2,5,6,-5,78,90};
	Arrays.sort(a);
	int i=0;
	print(a,i);
	}

	private static void print(int[] a, int i) {
		// TODO Auto-generated method stub
		if(i<=a.length-1) {
			System.out.print(a[i]);
			return;
		}else {
			print(a,i+1);
		}
		
	}


}
