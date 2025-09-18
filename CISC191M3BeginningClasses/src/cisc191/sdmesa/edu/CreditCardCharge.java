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
 * Version/date: 
 * 
 * Responsibilities of class:
 * 
 */

public class CreditCardCharge
{
	/////////////////////////////////////////////////////////////////////////////
	//////////////////////////  INSTANCE FIELDS  ///////////////////////////////
	///////////////////////////////////////////////////////////////////////////
	
	private int year; // a CreditCardChard has-a year
	private int month; // a CreditCardCharge has-a month
	private int day; // a CreditCardCharge has-a day
	private Boat purchasedBoat; // a CreditCardChard has-a purchased Boat
	private String companyName ; // a CreditCardCharge has-a company Name
	private CreditCard chargedCard; // a CreditCardCharge has-a credit card
	
	/////////////////////////////////////////////////////////////////////////////
	///////////////////////////// CONSTRUCTORS /////////////////////////////////
	///////////////////////////////////////////////////////////////////////////
	
	public CreditCardCharge ()
	{
		year = -1;
		month = -1;
		day = -1;
		purchasedBoat = null;
		companyName = null;
		chargedCard = null;
		
	}
	
	public CreditCardCharge (int year, int month, int day, Boat purchasedBoat, String companyName, CreditCard chargedCard)
	{
		this();
		
		this.year = year;
		this.month = month;
		this.day = day;
		this.purchasedBoat = purchasedBoat;
		this.companyName =companyName;
		this.chargedCard = chargedCard;
	}
	
	/////////////////////////////////////////////////////////////////////////////
	/////////////////////////////  MUTATORS  ///////////////////////////////////
	///////////////////////////////////////////////////////////////////////////

	/////////////////////////////////////////////////////////////////////////////
	/////////////////////////////  ACCESSORS  //////////////////////////////////
	///////////////////////////////////////////////////////////////////////////
	
	/////////////////////////////////////////////////////////////////////////////
	///////////////////////////  OTHER METHODS  ////////////////////////////////
	///////////////////////////////////////////////////////////////////////////

	public String toString ()
	{
		StringBuilder output = new StringBuilder ("");
		output.append(year + "/" + month + "/" + day + " ");
		output.append(chargedCard.toString() + " ");
		output.append(companyName + " ");
		output.append(purchasedBoat.getMake() + " $" + purchasedBoat.getPrice());
		
		return output.toString();
	}
	
	/////////////////////////////////////////////////////////////////////////////
	///////////////////////////  MAIN METHOD  ////////////////////////////////
	///////////////////////////////////////////////////////////////////////////
	
	public static void main (String[] arg)
	{
		Person person = new Person("Alex Keaton", "619-555-1212", "92111");
		CreditCard card = new CreditCard("4444111122223333", "12/24", "123", person);
		Boat boat = new Boat("SpeedyBoat", Color.GREEN);
		boat.setPrice(19995);		
		CreditCardCharge charge = new CreditCardCharge(2020, 8, 14, boat, "BoatCo", card);
		
		System.out.println(charge.toString());
	}

}
