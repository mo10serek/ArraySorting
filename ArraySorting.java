/*
 * Created by: Michael Balcerzak
 * Created on: 19-September-2016
 * Created for: ICS4U
 * Daily Assignment – #1-08
 * This program displays randomise numbers and show which is the highest
*/

import java.util.Random;

public class ArraySorting {

	
	public static int AddNumberToArray(int arrayOfNumbers, int number){
		// This function puts a number in the array
		arrayOfNumbers = number;
		
		return arrayOfNumbers;
	}
	
	public static int getMaxValue(int[] array){
		// This function finds the min value
		int max = array[0];  
			for(int i=1;i < array.length;i++){  
				if(array[i] > max){  
			      max = array[i];  
			    }  
			  }  
			  return max;  
			}  

	public static int getMinValue(int[] array){  
		// This function finds the max value
		int min = array[0];  
			for(int i=1;i<array.length;i++){  
			   if(array[i] < min){  
			     min = array[i];  
			   }  
			 }  
			 return min;  
		}  

	public static void main(String[] args) {
		Random rnd = new Random();
		
		// array
		int[] arrayOfNumbers = new int[10];
		
		//numbers
		for (int counter = 0; counter < 10; counter++)
		{
			arrayOfNumbers[counter] = rnd.nextInt(99) + 1;
		}
		
		System.out.println(arrayOfNumbers[0] + System.lineSeparator() + arrayOfNumbers[1] + System.lineSeparator() + arrayOfNumbers[2] + System.lineSeparator() + arrayOfNumbers[3] + System.lineSeparator() + arrayOfNumbers[4] + System.lineSeparator() + arrayOfNumbers[5] + System.lineSeparator() + arrayOfNumbers[6] + System.lineSeparator() + arrayOfNumbers[7] + System.lineSeparator() + arrayOfNumbers[8] + System.lineSeparator() + arrayOfNumbers[9]);
		
		// max and min
		int max;
		int min;
		
		
		// find the max and min
		max = getMaxValue(arrayOfNumbers);
		min = getMinValue(arrayOfNumbers);
		
		// output
		System.out.println(System.lineSeparator() + "Max: " + max + System.lineSeparator() + "Min: " + min );
		}
}
