package April16th;

public class ReverseOfNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=12345;
		int i=0;
		print(n,i);

	}

	private static void print(int n, int i) {
		// TODO Auto-generated method stub
		if(0>=n) {
			return;
		}else {
			System.out.print(n%10);
			print(n/10,i);
		}
	}


}
