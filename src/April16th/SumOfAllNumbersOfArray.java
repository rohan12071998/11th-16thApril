package April16th;

public class SumOfAllNumbersOfArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,4,68,28,4};
		int i=0;
		int sum=0;
		Printsum(arr,i,sum);

	}

	private static void Printsum(int[] arr,int i, int sum) {
		// TODO Auto-generated method stub
		if(i>arr.length-1) {
			System.out.print(sum);
			return;
		}else {
			sum+=arr[i];
			Printsum(arr,i+1,sum);
			
		}
		
	}


}
