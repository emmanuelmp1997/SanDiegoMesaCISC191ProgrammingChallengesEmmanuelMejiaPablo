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
 * Version/date:  1.0 
 * 
 * Responsibilities of class:
 * 
 */
public class Boat
{

	/////////////////////////////////////////////////////////////////////////////
	//////////////////////////  INSTANCE FIELDS  ///////////////////////////////
	///////////////////////////////////////////////////////////////////////////
	
	final private int SERIAL_NUMBER; // a Boat has-a serial number
	
	// Boat descriptions
	private String make; // a Boat has-a make
	private Color color; // a Boat has-a Color
	private int speed; // a Boat has-a speed;
	// Boat Price
	private int price; // a Boat has-a price
	// Authorized Persons
	private Person owner; // a Boat has-an owner
	private Person captain; // a Boat has-a captain
	
	
	private static int counter = 0; //

	/////////////////////////////////////////////////////////////////////////////
	///////////////////////////// CONSTRUCTORS /////////////////////////////////
	///////////////////////////////////////////////////////////////////////////
					// 1. Default Constructor
					// 2. Constructor with make and color data
					// 3. Copy Constructor
	//////////////////////////////////////////////////////////////////////////
	/////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////
	
	
	/**
	 * The DEFAULT CONSTRUCTOR initializes all instance variables.
	 */
	public Boat ()
	{
		make = null;
		color = null;
		speed = 0;
		price = -1;
				
		SERIAL_NUMBER = createNewSerialNumber();	
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
	 * COPY CONSTRUCTOR - all fields are the same except the serial number
	 * @param otherBoat the boat to copy
	 */
	public Boat (Boat otherBoat)
	{
		make = otherBoat.make;
		color = otherBoat.color;
		speed = otherBoat.speed;
		price = otherBoat.price;
		
		SERIAL_NUMBER = createNewSerialNumber();
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
	
	public void setColor(Color newColor)
	{
		color = newColor;
	}
	
	public void setMake (String make)
	{
		this.make = make;
	}
	
	public void setSpeed (int newSpeed)
	{
		speed = newSpeed;
	}
	
	public void setOwner (Person owner)
	{
		this.owner = owner; 
	}
	
	public void setCaptain (Person captain)
	{
		this.captain = captain;
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
	
	public Person getOwner ()
	{
		return owner;
	}
	
	public Person getCaptain ()
	{
		return captain;
	}
																								
	/////////////////////////////////////////////////////////////////////////////
	///////////////////////////  OTHER METHODS  ////////////////////////////////
	///////////////////////////////////////////////////////////////////////////

	/**
	 * The toString method returns the description of the boat object (make and color)
	 * @return a string with the physical description of the boat
	 */
	public String toString()
	{
		StringBuilder output = new StringBuilder();
		output.append("Boat: ");
		output.append("make: " + make + " ");
		output.append("color: " + color.toString());
		return output.toString();
	}
	
	/**
	 * The createNewSerialNumber method returns the current value of the counter static variable
	 * and then increases the value of the counter variable.
	 * @return a serial number for the boat
	 */
	public static int createNewSerialNumber ()
	{
		return ++counter;
	}
	
	/**
	 * The speedUp method increases the value of the speed variable by a unit of one
	 */
	public void speedUp()
	{
		speed = speed + 1;
	}
	
	/**
	 * The slowDown method decreases the value of the speed variable by a unit of one. The minimum value
	 * is zero.
	 */
	public void slowDown()
	{
		if (speed == 0)
		{
			// Do Nothing
		}
		else
		{
			speed =  speed - 1;
		}
	}
	
	/**
	 * The getSerialNumber method returns the serial number of a Boat instance.
	 * @return the value assigned to the SERIAL_NUMBER instance variable
	 */
	public int getSerialNumber ()
	{
		return SERIAL_NUMBER;
	}
	
	
	
	
	
	
	
	
}
