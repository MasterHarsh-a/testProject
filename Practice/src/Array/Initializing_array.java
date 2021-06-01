package Array;

public class Initializing_array {
	int[] intArray; // initializing array
	
	public  static void main(String[] args) {
		
		//Creating Arrays
		 int[] myList = {1, 2, 7, 4, 5 ,6, 5,8};
		 
		 System.out.println("-------Array Element------" );
		System.out.println(">>Size of Array- " +myList.length ); //Determining the length of an Array
		
		// Printing  array Elements	
		for (int i =0; i<myList.length; i++) {	
			 System.out.println(myList[i] + "");
		}
		 //Adding all array Elements
		int total = 0;
		for(int i =0; i<myList.length;  i++) {
		  total += myList[i];
		}
		System.out.println(">>Total of ArrayElements>>");
		System.out.println(""+total);
		
		//Greatest Element of an Array(myList)
		int max = myList[0];
		for(int i = 1; i< myList.length; i++ ) {
			if(myList[i]> max) {
				max = myList[i];
			}
			}
		System.out.println(">>Greatest Array Element>>");
		System.out.println(""+ max);
	}
	 
	
	

}
