wwpackage edu.sdmesa.cisc191;

/**
 * Lead Author(s):
 * @author 
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
 * 
 * Responsibilities of class:
 * 
 */
/**
 */
public class M2ArrayChallenge
{
	/**
	 * Purpose: Find a given value in the array given
	 * 
	 * @param array to search
	 * @return true if the value is in the array, otherwise false
	 */
	public static boolean contains(char[] array, char value)
	{
		boolean elementFound = false;
		int i = 0;
		while(!elementFound && i<array.length)
		{
			if(array[i] == value)
				elementFound = true;
			i++;
		}
		return elementFound;
	}
	
	
	
	
	/**
	 * Purpose: return the index where the character passed an argument is found
	 * 
	 * @param array to search
	 * @return the index where the wanted character is found
	 */
	public static int find(char[] array, char ch)
	{
		int indexOfChar = -1;
	
		int i = 0;
		while(i<array.length && indexOfChar == -1)
		{
			if(array[i] == ch)
				indexOfChar = i;
			i++;
		}

		return indexOfChar;
	}	
	
	
	
	
	
	/**
	 * Purpose: return the number of occurrences of a given char in an array of chars
	 * 
	 * @param array to search
	 * @return the total number of occurrences
	 */
	public static int countValues(char[] array, char value)
	{
		int count = 0;
		for(char element : array)
		{
			if(element == value)
				count++;
		}
		return count;
	}	
	
	
	
	
	
	/**
	 * Purpose: checks if the numerical values are in increasing order from left to right
	 * 
	 * @param array to search
	 * @return true if elements are in increasing order
	 */
	public static boolean inOrder(char[] array)
	{
		for(int i = 0; i < array.length - 1 ; i++)
		{
			if(array[i] > array[i+1])
				return false;
		}
		return true;
	}	
	
	
	
	
	
	
	/**
	 * Purpose: switch the specified element with the next element in an array of characters
	 * 
	 * @param array to search
	 * @return void because arrays of primitive data types are somewhat mutable
	 */
	public static void swapElements(char[] array, int index)
	{
		char temp = array[index];
		array[index] = array[index + 1];
		array[index+1] = temp;
		//return ???;
	}	
	
	
	
	

	/**
	 * Purpose: To organize a char array in ascending order
	 * 
	 * @param array to search
	 * @return none
	 */
	public static void bubbleUp(char[] array)
	{
		for(int i = 0; i < array.length - 1; i++)
		{
			if(array[i] > array[i+1])
				swapElements(array, i);
		}
		//return ???;
	}	
	
	
	
	
	
	
	/**
	 * Purpose: The bubblesort method sorts an array
	 * 
	 * @param array
	 * @return none
	 */
	public static void bubbleSort(char[] array)
	{
		while(!inOrder(array))
		{
			bubbleUp(array);
		}
		//return ???;
	}
	
	
	
	
	

	/**
	 * Purpose: To make a deep copy of the passed array of characters.
	 * 
	 * @param array the array to search
	 * @return a new reference to an identical array.
	 */
	public static char[] copy(char[] array)
	{
		char[] copy = new char[array.length];
		
		for (int i = 0 ; i < array.length ; i++ )
		{
			copy[i] = array[i];
		}
		
		return copy;
	}
	
	
	
	

	
	/**
	 * Purpose: Checks if the elements of two arrays are equal at the same index
	 * 
	 * @param array1 array to search
	 * @param array2 array to search
	 * @return true if all the elements are equal
	 */
	public static boolean arrayElementsEqual(char[] array1, char[] array2)
	{		
		//First, check if the arrays have the same length
		if (array1.length != array2.length)
			return false;
		
		//Check if elements are identical
		else
		{
			for (int i = 0 ; i < array1.length ; i++)
			{
				if (array1[i] != array2[i])
					return false; //exit the if elements are not equal
			}
				
		}
		
		
		return true;
	}
	
	
	
	
	
	
	/**
	 * Purpose: To return an array that has the same elements as the passed array reordered backwards.
	 * 
	 * @param array the array to search
	 * @return the reordered array.
	 */
	public static char[] backwards(char[] array)
	{
		char[] backwardsArray = new char[array.length];
		
		int i = 0; //To add elements to the new array starting at the first index
		int j = array.length - 1; // To get the elements from the passed array starting at the last index
		
		for ( ; j >= 0 ; i++, j--)
		{
			backwardsArray[i] = array[j];
		}
		
		return backwardsArray;
	}
	
	
	
	
	
	

	/**
	 * Purpose: Checks if the elements from the start to the midpoint are exactly the same as the elements from end to the midpoint.
	 * 
	 * @param array to search
	 * @return true if the array is symmetrical at its midpoint.
	 */
	public static boolean isPalindrome(char[] array)
	{
		char[] backwardsArray = backwards(array);
		char elementInForwardDirection; 
		char elementInBackwardDirection;
		
		for(int i = 0 ; i < array.length/2 ; i++)
		{
			elementInForwardDirection = array[i];
			elementInBackwardDirection = backwardsArray[i];
			
			if (elementInForwardDirection != elementInBackwardDirection)
				return false;
		}
		
		return true;
	}
	
	
	
	
	
	

	/**
	 * Purpose: Returns the element from the passed row and column number
	 * 
	 * @param array the array to search
	 * @param row the row or the element of the outer array.
	 * @param colum the column or the element of the inner array.
	 * @return the element at the specified row and column.
	 */
	public static int getElement(int[][] array, int row, int column)
	{
		return array[row][column];
	}
	
	
	
	
	

	/**
	 * Purpose: To find the sum of all the elements in a specified row. Each element of the outer array contains one row.
	 * 
	 * @param array to search
	 * @param row the row of elements to add
	 * @return the total sum
	 */
	public static int addRow(int[][] array, int row)
	{
		int totalRows = array[row].length; 
		int sum = 0;
		
		for(int i = 0 ; i < totalRows ; i++)
		{
			sum += array[row][i];
		}
		
		return sum;
	}
	
	
	
	
	
	

	/**
	 * Purpose: To find the sum of all the elements in a specified column. 
	 * 
	 * @param array
	 * @return
	 */
	public static int addColumn(int[][] array, int column)
	{
		int sum = 0;
		
		for( int i = 0 ; i < array.length ; i++)
		{
			sum += array[i][column];
		}
		return sum;
	}
	
	
	
//	/**
//	 * Purpose:
//	 * 
//	 * @param array
//	 * @return
//	 */
//	public static ??? ???(???[] array)
//	{
//		return ???;
//	}
	
	
	
//	/**
//	 * Purpose:
//	 * 
//	 * @param array
//	 * @return
//	 */
//	public static ??? ???(???[] array)
//	{
//		return ???;
//	}
	
	
//	/**
//	 * Purpose:
//	 * 
//	 * @param array
//	 * @return
//	 */
//	public static ??? ???(???[] array)
//	{
//		return ???;
//	}
	
}
