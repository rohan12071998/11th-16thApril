package April11th;

public class UnionOfTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 3, 5, 6, 8, 9 };
		int[] b = { 5, 7, 9 };
       
		for(int i=0;i<a.length;i++)
		System.out.print(a[i]+" ");
		
		if (a.length > b.length) {
			for (int i = 0; i < b.length; i++) {
				int index = binarySerch(a, b[i]);
                
				if (index == -1) {
					System.out.println(b[i] + " ");
				}
			}
		}
		
		else
		{
			for (int i = 0; i < a.length; i++) {
				int index = binarySerch(b, a[i]);
                
				if (index == -1) {
					System.out.println(b[i] + " ");
				}
			}
		}
			

	}

	private static int binarySerch(int[] a, int i) {
		// TODO Auto-generated method stub

		int s = 0;
		int e = a.length - 1;
		while (s <= e) {
			int mid = s + (e - s) / 2;

			if (a[mid] == i)
				return mid;

			else if (i < a[mid])
				e = mid - 1;

			else
				s = mid + 1;

		}
		return -1;
	}

}