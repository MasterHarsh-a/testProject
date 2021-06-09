package Array;

public class checkmaxandmin {
	
 	static int getMax(int arr[], int n) {
		 int result  = arr[0];
		 for(int i =1; i < n; i++)
		 {
			 result = Math.max(result, arr[i]);
			 
		 }
		return result;
		}
	static int getMin(int arr[], int n)
	{
		int result = arr[0];
		for(int i =1; i < n; i++)
		{
			result = Math.min(result, arr[i]);
		}
		return result;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,3,8,5,6,2,1};
		int n = arr.length;
		System.out.println("Maximum element of  array "+ getMax(arr, n));
		System.out.println("Minimum element of array " +getMin(arr, n) );
		
		

	}

}
