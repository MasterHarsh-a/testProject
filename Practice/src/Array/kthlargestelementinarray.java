package Array;

public class kthlargestelementinarray {
	 
	void largestnumber( int arr[]) {
		int n = arr.length;	
	for(int  i=0; i<n-1; i++) {	
		int min_index= i;
		
		for(int j=i+1; j<n; j++) {
			if(arr[j]<arr[min_index]) 
				min_index=j;
			int  min_element =arr[min_index];
			arr[min_index] = arr[i];
			arr[i]= min_element;
					
		}
	}
	}
	void printarray(int n , int arr[]) {
		 for(int i =0; i<n; i++)
		 {
			 System.out.print(arr[i]+"");
		   System.out.println();
		 }
	}
		

	public static void main(String args[])
	{
		int[] arr = {7,10,4,3,20,15};
		int n = arr.length;
		int k =4;
		kthlargestelementinarray ob = new kthlargestelementinarray ();
		ob.largestnumber( arr);
		ob.printarray(n, arr);
		System.out.println("Kth largest element in array");
		System.out.println(arr[k]+ " ");
	}
}
