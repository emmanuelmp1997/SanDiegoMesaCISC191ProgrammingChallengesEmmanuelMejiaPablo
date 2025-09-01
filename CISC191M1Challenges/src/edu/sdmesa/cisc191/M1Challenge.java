package edu.sdmesa.cisc191;

/**
 * Lead Author(s):
 * @author Emmanuel Mejia Pablo
 * @author 
 * <<add additional lead authors here, with a full first and last name>>
 * 
 * Other contributors:
 * <<add additional contributors (mentors, tutors, friends) here, with contact information>>
 * 
 * References:
 * Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 * Retrieved from https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 * 
 * <<add more references here>>
 *  
 * Version/date: 
 * @version 1.0 08-31-2025
 * 
 * Responsibilities of class:
 * 
 */

 // See INSTRUCTIONS in TestM1Challenge

public class M1Challenge
{
	/**
	 * Purpose: add two numbers
	 * @param a one number
	 * @param b another number
	 * @return the sum of a and b
	 */
	public static int add(int a, int b)
	{
		return a + b;
	}
	
	/**
	 * Purpose: multiply two numbers
	 * @param a one number
	 * @param b another number
	 * @return the product of a and b
	 */
	public static int multiply(int a, int b)
	{
		return a * b;
	}
	
	/**
	 * Purpose: return the first element in the array given
	 * 
	 * @param array to search
	 * @return first element
	 */
	public static int getFirst(int[] array)
	{
		return array[0];
	}
	
	/**
	 * Purpose: return the last element in the array given
	 * 
	 * @param array to search
	 * @return last element
	 */
	public static int getLast(int[] array)
	{
		int lastIndex = array.length - 1;
		return array[lastIndex];
	}
	
	/**
	 * Purpose: return the middle element in an array with an odd number of elements
	 * 
	 * @param array to search
	 * @return middle element
	 */
	public static int getMiddle(int[] array)
	{
		int middleIndex = array.length / 2;
		return array[middleIndex];
	}

	/**
	 * Purpose: return the element that has the maximum value
	 * 
	 * @param array to search
	 * @return the greatest number in the array
	 */
	public static int max(int[] array)
	{
		int  maxValue = array[0];
		int index = 1;
		while(index < array.length)
		{
			if(array[index] > maxValue)
			maxValue = array[index];
			index++;
		} 
		return maxValue;
	}
	
	/**
	 * Purpose: return the element that has the minimum value
	 * 
	 * @param array to search
	 * @return the smallest number in the array
	 */
	public static int min(int[] array)
	{
		int  minValue = array[0];
		int index = 1;
		while(index < array.length)
		{
			if(array[index] < minValue)
			minValue = array[index];
			index++;
		} 
		return minValue;
	}
	
	/**
	 * Purpose: return the sum of all the elements
	 * 
	 * @param array to search
	 * @return the sum of all the elements in the array
	 */
	public static int sum(int[] array)
	{
		int sum = 0;
		int index = 0;
		while(index < array.length)
		{
			sum += array[index];
			index++;
		}
		return sum;
	}
	
	/**
	 * Purpose: return the average of the elements in the array
	 * 
	 * @param array to search
	 * @return average of elements
	 */
	public static double average(int[] array)
	{
		int sumOfElements = sum(array);
		
		double average = (double)sumOfElements / array.length;
		return average;
	}
	
}
