package cisc191.sdmesa.edu;

import java.awt.Color;

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

//TODO: implement and remove all TODOs

/**
 */
public class Boat
{

	/////////////////////////////////////////////////////////////////////////////
	//////////////////////////  INSTANCE FIELDS  ///////////////////////////////
	///////////////////////////////////////////////////////////////////////////
	
	private String make; // a Boat has-a make
	private Color color; // a Boat has-a Color
	private int speed; // a Boat has-a speed;
	private int price; // a Boat has-a price

	/////////////////////////////////////////////////////////////////////////////
	///////////////////////////// CONSTRUCTORS /////////////////////////////////
	///////////////////////////////////////////////////////////////////////////
	// 1. Default Constructor
	// 2. Constructor with make and color data
	// 3. Copy Constructor
	
	
	/**
	 * The DEFAULT CONSTRUCTOR initializes all instance variables.
	 */
	public Boat ()
	{
		make = null;
		color = null;
		speed = 0;
		price = -1;	
	}
	
	/**
	 * Initializes the make and color with the passed parameters
	 * @param initMake the make of the Boat
	 * @param initColor the color of the Boat
	 */
	public Boat(String initMake, Color initColor)
	{
		this(); //invoke default constructor
		make = initMake;
		color = initColor;
	}
	
	/**
	 * COPY CONSTRUCTOR 
	 * @param otherBoat the boat to copy
	 */
	public Boat (Boat otherBoat)
	{
		make = otherBoat.make;
		color = otherBoat.color;
		speed = otherBoat.speed;
		price = otherBoat.price;
	}
	
	
	
	/////////////////////////////////////////////////////////////////////////////
	/////////////////////////////  ACCESSORS  //////////////////////////////////
	///////////////////////////////////////////////////////////////////////////
	
	/**
	 * Purpose: // TODO
	 * @return // TODO
	 */
	public String getMake()
	{
		// TODO
		return make;
	}

	/**
	 * Purpose: // TODO
	 * @return // TODO
	 */
	public Color getColor()
	{
		// TODO
		return color;
	}

	/**
	 * Purpose: // TODO
	 * @return // TODO
	 */
	public int getSpeed()
	{
		// TODO
		return speed;
	}
	
	/**
	 * Purpose: to return the price of the boat
	 */
	public int getPrice()
	{
		// TODO Auto-generated method stub
		return price;
	}
	
	
	/////////////////////////////////////////////////////////////////////////////
	/////////////////////////////  MUTATORS  ///////////////////////////////////
	///////////////////////////////////////////////////////////////////////////
	
	/**
	 * Purpose: To update the price field of Boat objects.
	 * @param newPrice the new price to assign as the instance' price
	 */
	public void setPrice (int newPrice)
	{
		price = newPrice;
	}
	
	public void setColor(Color n)
	{
		
	}
	
	
}
