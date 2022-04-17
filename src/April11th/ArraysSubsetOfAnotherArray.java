package April11th;

public class ArraysSubsetOfAnotherArray {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int[] b = { 2, 3, 4, 5 };
		boolean c = true;

		if (arr.length > b.length) {
			for (int i = 0; i < b.length; i++) {
				int index = binarySarch(arr, b[i]);
                    //System.out.print(index+" ");
				if (index == -1) {
					c = false;
					break;
				}

			}
		} else {
			for (int i = 0; i < b.length; i++) {
				int index = binarySarch(arr, b[i]);

				if (index == -1) {
					c = false;
					break;
				}

			}
		}

		System.out.print(c);
	}

	private static int binarySarch(int[] arr, int i) {
		// TODO Auto-generated method stub
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (arr[mid] == i)
				return mid;

			else if (arr[mid] > i)
				end = mid - 1;

			else
				start = mid + 1;
		}

		return -1;
	}


}
