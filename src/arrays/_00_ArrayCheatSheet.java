package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] names = {"Sarah", "Joe","Ali", "Jose"};
		//2. print the third element in the array
		System.out.println(names[3]);
		//3. set the third element to a different value
		names[3]="Maria";
		//4. print the third element again
		System.out.println(names[3]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		
		for (int i=0;i<names.length;i++) {
		     System.out.println(names[i]);
		}
		//6. make an array of 50 integers
		int[] moreNames = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		Random randy=new Random();
		
		for (int i = 0; i < 50; i++) {
			moreNames[i]=randy.nextInt(50);
		}
		//8. without printing the entire array, print only the smallest number in the array
		int smallest=50;
		for (int i = 0; i < moreNames.length; i++) {
			if(smallest>moreNames[i]) {
				smallest=moreNames[i];
				
			}
		}
		//9 print the entire array to see if step 8 was correct
		System.out.println(smallest);
		//10. print the largest number in the array.
		
	}
}
