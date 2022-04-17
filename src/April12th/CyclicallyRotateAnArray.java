package April12th;
import java.util.*;

public class CyclicallyRotateAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n[]= {1,2,3,4,5};
		Reverse(n);

	}

	private static void Reverse(int[] n) {
		// TODO Auto-generated method stub
		int temp=n.length;
		for(int i=n.length-1;i>=1;i--) {
			n[i]=n[i-1];
			
		}
		n[0]=temp;
		System.out.print(Arrays.toString(n));
	}

}
