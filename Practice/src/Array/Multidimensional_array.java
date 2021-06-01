package Array;

public class Multidimensional_array {

	public static void main(String[] args) {
		// TODO print 2D array and  3D array
		
		int twoD[][] = {{1,2},{3,4}}; // Initializing 2D array
		
		 //Printing 2D Array
		for(int i=0; i<2; i++) {
			for  (int j =0; j<2; j++) {
				
				System.out.print( twoD[i][j] +" ");
			}
	       System.out.println();
			
			
		}
		
	}

}