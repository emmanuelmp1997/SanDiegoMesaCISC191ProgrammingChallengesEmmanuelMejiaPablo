package edu.sdmesa.cisc191;

import java.awt.Color;
import edu.gatech.cc.DigitalPicture;
import edu.gatech.cc.Picture;
import edu.gatech.cc.Pixel;

/**
 * Lead Author(s):
 * 
 * @author Emmanuel Mejia Pablo
 * @author
 *         <<add additional lead authors here, with a full first and last name>>
 * 
 *         Other contributors:
 *         <<add additional contributors (mentors, tutors, friends) here, with
 *         contact information>>
 * 
 *         References:
 *         Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented
 *         Problem Solving.
 *         Retrieved from
 *         https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 * 
 *         <<add more references here>>
 * 
 *         Version/date: 09-08-2024
 * 
 *         Responsibilities of class:
 * 
 */
public class Logic
{
	private static Pixel[][] pixelsOfPicture;
	
	private static Pixel pixel;
	
	private static int redValue;
	private static int greenValue;
	private static int blueValue;
	private static int averageRGB;
	private static Color newColor;
	
	private static Color tempColorHolder;
	
	private static int row, column;
	
	private static int columnLength;
	
	/**
	 * Alters the picture so that each pixel's blue channel has been zeroed out.
	 * All
	 * other channels remain the same
	 * 
	 * @param picture the image to be altered
	 */
	public static void zeroBlue(DigitalPicture picture)
	{

		// obtain a representation of the picture as a 2D array of Pixel objects
		Pixel[][] pixels2D = picture.getPixels2D();

		// Traverse the 2D array
		for (int row = 0; row < pixels2D.length; row++)
		{
			for (int col = 0; col < pixels2D[row].length; col++)
			{
				// invoke the setBlue method on each Pixel object
				pixels2D[row][col].setBlue(0);
			}
		}

	}
	
	/**
	 * Purpose: Make the picture black & white, and gray
	 * @param picture
	 */
	public static void blackAndWhite(DigitalPicture picture)
	{
		pixelsOfPicture = picture.getPixels2D();
		
		for (row = 0 ; row < pixelsOfPicture.length ; row++)
		{
			columnLength = pixelsOfPicture[row].length;
			
			for (column = 0 ; column < columnLength ; column++)
			{
				pixel = pixelsOfPicture[row][column];
				
				averageRGB = (pixel.getRed() + pixel.getGreen() + pixel.getBlue()) / 3;
				
				pixel.setRed(averageRGB);
				pixel.setGreen(averageRGB);
				pixel.setBlue(averageRGB);
			}
		}
	}
	
	/**
	 * Purpose: Invert the colors of image
	 * @param picture
	 */
	public static void negative(DigitalPicture picture)
	{
		pixelsOfPicture = picture.getPixels2D();
		
		for (row = 0 ; row < pixelsOfPicture.length ; row++) //ENTERS THE ROW
		{
			columnLength = pixelsOfPicture[row].length; 
			
			for(column = 0; column < columnLength ; column++) //ENTERS THE COLUMN
			{
				pixel = pixelsOfPicture[row][column];
				
				redValue = 255 - pixel.getRed();
				greenValue = 255 - pixel.getGreen();
				blueValue = 255 - pixel.getBlue();
				
				pixel.setRed(redValue);
				pixel.setGreen(greenValue);
				pixel.setBlue(blueValue);
			}
		}

	}
	
	/**
	 * Purpose: Simulate that the picture was taken at sunset
	 * @param picture
	 * @param redMultiplier Factor increase of the red (usually > 1)
	 * @param greenBlueMultiplier Factor increase of green and blue (usually < 1)
	 */
	public static void makeSunset(DigitalPicture picture, double redMultiplier,
			double greenBlueMultiplier)
	{
		pixelsOfPicture = picture.getPixels2D();
		
		for (row = 0 ; row < pixelsOfPicture.length ; row++)
		{
			columnLength = pixelsOfPicture[row].length;
			for (column = 0 ; column < columnLength ; column++)
			{
				pixel = pixelsOfPicture[row][column];
				
				// Calculates the new RGB values of the pixel
				redValue = (int) (pixel.getRed() * redMultiplier);
				greenValue = (int) (pixel.getGreen() * greenBlueMultiplier);
			    blueValue = (int) (pixel.getBlue() * greenBlueMultiplier);
			    
			    // Bounds the values to 255 max
			    if (redValue > 255)
			    		redValue = 255;
			    if (greenValue > 255)
			    		greenValue = 255;
			    if (blueValue > 255)
			    		blueValue = 255;
			    
			    newColor = new Color(redValue, greenValue, blueValue);
				
			    pixel.setColor(newColor);
			}
		}

	}
	


	/**
	 * Purpose: to swap two pixels
	 */
	public static void pixelSwap()
	
	
	/**
	 * Purpose: Flip the image left to right (as used in many selfie cams)
	 * @param picture
	 */
	public static void flipHorizontal(DigitalPicture picture)
	{
		
		pixelsOfPicture = picture.getPixels2D();
		for (row = 0 ; row < pixelsOfPicture.length ; row++)
		{
			columnLength = pixelsOfPicture[row].length;
			int columnIndexInReverse = (columnLength - 1);
			Pixel tempPixelHolder;
			for (column = 0 ; column < (columnLength/2) ; column++ , columnIndexInReverse--)
			{
				// Gets the colors of the specified Pixel
				redValue = pixelsOfPicture[row][column].getRed();
				greenValue = pixelsOfPicture[row][column].getGreen();
				blueValue = pixelsOfPicture[row][column].getBlue();
				newColor = new Color (redValue, greenValue, blueValue);
				
				// Gets the colors of the specified Pixel
				redValue = pixelsOfPicture[row][columnIndexInReverse].getRed();
				greenValue = pixelsOfPicture[row][columnIndexInReverse].getGreen();
				blueValue = pixelsOfPicture[row][columnIndexInReverse].getBlue();
				tempColorHolder = new Color (redValue, greenValue, blueValue);
				
				pixelsOfPicture[row][columnIndexInReverse].setColor(newColor);
				
				pixelsOfPicture[row][column].setColor(tempColorHolder);
			}
		}
		
	}

//	/**
//	 * Purpose: Turn the picture up-side-down
//	 * @param picture
//	 */
//	public static void flipVertical(DigitalPicture picture)
//	{
//		pixelsOfPicture = picture.getPixels2D();
//		int rowIndexInReverse = pixelsOfPicture.length - 1;
//		for (row = 0 ; row < (pixelsOfPicture.length/2) ; row++, rowIndexInReverse--)
//		{
//			Pixel tempPixelHolder;
//			columnLength = pixelsOfPicture[row].length;
//			for (column = 0 ; column < columnLength ; column++)
//			{
//				tempPixelHolder = pixelsOfPicture[rowIndexInReverse][column];
//				pixelsOfPicture[rowIndexInReverse][column] = pixelsOfPicture[row][column];
//				pixelsOfPicture[row][column] = tempPixelHolder;
//			}
//		}
//
//	}

	/**
	 * Purpose: Make the image less sharp
	 * @param picture
	 */
	public static void blur(DigitalPicture picture)
	{
		// TODO Implement this method

	}

	/*
	 * Use the main method in this file to visually inspect the "filters" that
	 * you are
	 * applying to the image(s)! Please see the comment(s) for examples.
	 */
	public static void main(String[] arg)
	{

		// Create a myPicture object from the provided file name.
		// If you use your own image, be sure to place it in the images folder
		// of this project
		DigitalPicture myPicture = new Picture("bees.png");
		myPicture.setTitle("Original Image");

		// Use the explore method of the object to view the picture.
		myPicture.explore();

		/*
		 * Apply the filter then invoke explorer again to view the changes. :)
		 * ---------------------------------------------------------------------
		 * ---------------
		 */

		// Apply one of the filters then view the image again with explore!
		blackAndWhite(myPicture); // <----- Change this to one of the other filters
								// that you have written
		myPicture.setTitle("After Filter"); // change the title of the JFrame
		myPicture.explore();

	}

}
