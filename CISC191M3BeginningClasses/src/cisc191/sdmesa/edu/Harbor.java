package cisc191.sdmesa.edu;

import java.awt.Color;

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
 * Version/date: 1.0
 * 
 * Responsibilities of class:
 * 
 */

public class Harbor
{
	/////////////////////////////////////////////////////////////////////////////
	//////////////////////////  INSTANCE FIELDS  ///////////////////////////////
	///////////////////////////////////////////////////////////////////////////
	
	private Boat[] harborStock;
	
	/////////////////////////////////////////////////////////////////////////////
	///////////////////////////// CONSTRUCTORS /////////////////////////////////
	///////////////////////////////////////////////////////////////////////////
	
	/**
	 * 
	 */
	public Harbor ()
	{
		harborStock = null;
	}
	
	/**
	 * This constructor takes in the size of the harborStock array
	 * and initializes the elements in the array to null
	 * @param size
	 */
	public Harbor (int size)
	{
		this();
		harborStock = new Boat[size];
		
		for (int i = 0 ; i < harborStock.length ; i++)
		{
			harborStock[i] = null;
		}
	}
	
	/////////////////////////////////////////////////////////////////////////////
	/////////////////////////////  MUTATORS  ///////////////////////////////////
	///////////////////////////////////////////////////////////////////////////
	
	public void setBoatAt (Boat boat, int index)
	{
		//Boat boatCopy = new Boat(boat);
		harborStock[index] = boat;
	}
	
	
	/////////////////////////////////////////////////////////////////////////////
	/////////////////////////////  ACCESSORS  //////////////////////////////////
	///////////////////////////////////////////////////////////////////////////
	
	public Boat getBoatAt (int index)
	{
		return harborStock[index];
	} 
	
	/**
	 * The getInventory method creates a new array object who's elements reference
	 * the same boat objects as the original array.
	 * @return the copied array
	 */
	public Boat[] getInventory ()
	{
		Boat[] copyOfInventory = new Boat[harborStock.length];
		
		for (int i = 0 ; i < harborStock.length ; i++)
		{
			copyOfInventory[i] = harborStock[i];
		}
		return copyOfInventory;
	}
	
	/////////////////////////////////////////////////////////////////////////////
	///////////////////////////  OTHER METHODS  ////////////////////////////////
	///////////////////////////////////////////////////////////////////////////
	
	public Boat parkBoatAt (Boat boat, int index)
	{
	
		Boat boatParkedAtIndex = harborStock[index];
		setBoatAt(boat, index);
		return boatParkedAtIndex;
	}
	
}
