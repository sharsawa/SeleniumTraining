package JAVABasics;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] myArray = {10, 20, 30, 40};
		System.out.println("First Value : " + myArray[0]);
		System.out.println("Second Value : " + myArray[1]);
		System.out.println("Third Value : " + myArray[2]);
		System.out.println("Last/Fourth Value : " + myArray[3]);
		
		String [] StrArray = {"One", "Two", "Three"};
		System.out.println("First Value : " + StrArray[0]);
		System.out.println("Second Value : " + StrArray[1]);
		System.out.println("Third Value : " + StrArray[2]);
		
		//Checking length of array
		int len = myArray.length;
		System.out.println("Length of Int Array = " +len);
		System.out.println("Length of str array = " +StrArray.length);
		
		//Performing sorting on int array
		Arrays.sort(myArray);
		for (int i =0; i<myArray.length ; i++) {
			System.out.println(myArray[i]);
		}
	}

}
