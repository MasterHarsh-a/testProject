package Array;

public class occurrenceinarray {

	public static void main(String[] args) {
			int x = 2;
			int[] arr = {1,2,2,2,3,4,5,6};
			int count = 0;
			for(int i = 0; i< arr.length;i++)
			{ 	
				if( x == arr[i])
				{
					count++;
					
				}
			
			}
			System.out.println("" +count);	
		
		// TODO Auto-generated method stub

	}

}
