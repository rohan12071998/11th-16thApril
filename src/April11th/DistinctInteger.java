package April11th;

public class DistinctInteger {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 2, 3, 5 };
		int b = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] != b) {
				System.out.println(b);
			}
			b++;

		}

	}



}
