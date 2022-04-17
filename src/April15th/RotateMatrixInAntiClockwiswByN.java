package April15th;

import java.util.Scanner;

public class RotateMatrixInAntiClockwiswByN {
	public static void main (String[]args) {
		Scanner sc=new Scanner(System.in);
		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

		int m = arr.length;
		int n = arr[0].length;
		
		int k=sc.nextInt();

  for(int i=0;i<k;i++) {
		System.out.println("Original Matrix");
		print(arr, m, n);
		transPosedMatrix(arr, m, n);
		System.out.println("Trasposed Matrix");
		print(arr, m, n);
		rotate90Anticlockwise(arr, m, n);
		
		print(arr, m, n);
  }

	}

	private static void print(int[][] arr, int m, int n) {
		// TODO Auto-generated method stub

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++)
				System.out.print(arr[i][j] + " ");

			System.out.println();
		}

	}

	private static void rotate90Anticlockwise(int[][] arr, int m, int n) {
		// TODO Auto-generated method stub

		for (int i = 0; i < m / 2; i++) {
			for (int j = 0; j < n; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[n - 1 - i][j];
				arr[n - 1 - i][j] = temp;

			}
		}

	}

	private static void transPosedMatrix(int[][] arr, int m, int n) {
		// TODO Auto-generated method stub

		for (int i = 0; i < m; i++) {
			for (int j = i; j < n; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}


	}

	
}
	    
