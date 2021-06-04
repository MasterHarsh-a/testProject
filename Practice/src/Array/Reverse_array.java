package Array;

import java.util.Arrays;
import java.util.Collections;

public class Reverse_array {

	public static void main(String[] args) {
		// TODO 1> Create a array
		// 2> Use Collection.reverse
		//3>print reverse array
		Integer value[]= {1, 2, 3, 4, 5, 6, 7 ,8 ,9,0};
		System.out.println("Before Reversing :" +Arrays.toString(value));
		//Use of Collection.Reverse
		Collections.reverse(Arrays.asList(value));
		System.out.println("After Reverse:" + Arrays.toString(value));
		
		//Reversing String Value
		String value1[]= {"Practice"," make", "Man","Perfect"};
		System.out.println("Before Reversing"+Arrays.deepToString(value1));
		Collections.reverse(Arrays.asList(value1));
		System.out.println("After Reverse"+Arrays.deepToString(value1));

	}

}
