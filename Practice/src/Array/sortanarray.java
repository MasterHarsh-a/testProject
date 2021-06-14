package Array;

public class sortanarray {
	

	void selectionsorrt(int arr[])
	{
		int n = arr.length;
	
		//for is using to go to every element index
	for(int i=0; i<n-1; i++) {
		
		int min_index= i;
		//for is using the minimum element in unsorted element 
		for(int j=i+1; j<n; j++) {
			if(arr[j]<arr[min_index])
			min_index=j;
		//swap the minimum element with the first element 	
			int  min_element =arr[min_index];
			arr[min_index] = arr[i];
			arr[i]= min_element;
			
			
				
			
			
		}
	}
	
	}
	void printarray(int arr[])
	{ 
		int n = arr.length;
		 for (int i=0; i<n; ++i)
	            System.out.print(arr[i]+" ");
	        System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,3,5,6,1,9,7};
			
		
		sortanarray ob = new sortanarray();
		ob.selectionsorrt(arr);
		System.out.println("sorted array");
		ob.printarray(arr);
		
		
	//
		
		
		
		

	}

}
