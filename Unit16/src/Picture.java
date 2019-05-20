import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
	  super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
    System.out.print("Name - Cade Eastlack\nPeriod 3\nDate - 4/25/19");
  }
  
  /**
   * Constructor that takes the width and height
   * @param height the height of the desired picture
   * @param width the width of the desired picture
   */
  public Picture(int height, int width)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   * @param copyPicture the picture to copy
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }
  
  ////////////////////// methods ///////////////////////////////////////
  
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
    
  }
  
  /** Method to set the blue to 0 */
  public void zeroBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(0);
      }
    }
  }
  
  public void keepOnlyBlue(){
	  Pixel[][] pixels= this.getPixels2D();
	  for(Pixel[] row : pixels){
		  for(Pixel p : row){
			  p.setRed(0);
			  p.setGreen(0);
		  }
	  }
  }
  
  
  
  
  
  public void keepOnlyRed(){
	  Pixel[][] pixels= this.getPixels2D();
	  for(Pixel[] row : pixels){
		  for(Pixel p : row){
			  p.setBlue(0);
			  p.setGreen(0);
		  }
	  }
  }
  public void keepOnlyGreen(){
	  Pixel[][] pixels= this.getPixels2D();
	  for(Pixel[] row : pixels){
		  for(Pixel p : row){
			  p.setRed(0);
			  p.setBlue(0);
		  }
	  }
  }
  
  public void Negate(){
	  Pixel[][] pixels = this.getPixels2D();
	  for(Pixel[] row : pixels){
		  for(Pixel p : row){
			  p.setRed(255 - p.getRed());
			  p.setGreen(255 - p.getGreen());
			  p.setBlue(255 - p.getBlue());
		  }
	  }
  }
  
 
  public void Grayscale() {
	  Pixel[][] pixels = this.getPixels2D();
	 
	    for (Pixel[] rowArray : pixels)
	    {
	      for (Pixel pixelObj : rowArray)
	      {
	        int gray = (pixelObj.getBlue() + pixelObj.getGreen() + pixelObj.getRed())/3;
	    	pixelObj.setRed(gray);
	        pixelObj.setGreen(gray);
	        pixelObj.setBlue(gray);
	      }
	    }
  }
  
  
  public void FixUnderWater() {
	  Pixel[][] pixels= this.getPixels2D();
	  for(Pixel[] row : pixels){
		  for(Pixel p : row){
			  p.setBlue(p.getBlue() - 65);
			  p.setGreen(p.getGreen() - 65);
			  p.setRed(p.getRed() + 65);
		  }
	  }
  }
  
  /** Method that mirrors the picture around a 
    * vertical mirror in the center of the picture
    * from left to right */
  public void mirrorVertical()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
  }
  
  public void mirrorVerticalRightToLeft()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = width -1; col > width / 2; col--)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
  }
  
  public void mirrorHorizontal(){
	  Pixel[][] pixels = this.getPixels2D();
	  Pixel topPixel = null;
	  Pixel bottomPixel = null;
	  int height = pixels.length;
	  
	  
	  for(int row = 0; row < height / 2; row++){
		  for(int col = 0; col < pixels[0].length; col++){
			  topPixel = pixels[row][col];
			  bottomPixel = pixels[height - 1 - row][col];
			  bottomPixel.setColor(topPixel.getColor());
		  }
	  }
  }
  
  public void mirrorVerticalBotToTop(){
	  Pixel[][] pixels = this.getPixels2D();
	  Pixel topPixel = null;
	  Pixel bottomPixel = null;
	  int height = pixels.length;
	  for(int row = height -1; row > height / 2; row--){
		  for(int col = 0; col < pixels[0].length; col++){
			  topPixel = pixels[row][col];
			  bottomPixel = pixels[height - 1 - row][col];
			  bottomPixel.setColor(topPixel.getColor());
		  }
	  }
  }
  
  public void mirrorDiagonal(){
	  Pixel[][] pixels = this.getPixels2D();
	  Pixel leftPixel = null;
	  Pixel rightPixel = null;
	  int height = pixels.length;
	  for (int row = 0; row < height; row++) {
		  for (int col = 0; col < row; col++) {
			leftPixel = pixels[row][col];
			rightPixel = pixels[col][row];
			rightPixel.setColor(leftPixel.getColor());
		}
	}
  }
  
  /** Mirror just part of a picture of a temple */
  public void mirrorTemple()
  {
    int mirrorPoint = 276;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int count = 0;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = 27; row < 97; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 13; col < mirrorPoint; col++)
      {
        
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row]                       
                         [mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
      }
    }
  }
  
  /** copy from the passed fromPic to the
    * specified startRow and startCol in the
    * current picture
    * @param fromPic the picture to copy from
    * @param startRow the start row to copy to
    * @param startCol the start col to copy to
    */
  
  
  /** Mirror Snowman with 4 arms */
  public void mirrorArms(){
	  int mirrorPoint = 194;
	  Pixel leftPixel = null;
	  Pixel rightPixel = null;
	  Pixel[][] pixels = this.getPixels2D();
	  for (int row = 163; row < mirrorPoint; row++) {
		for(int col = 103; col < 291; col++){
			leftPixel = pixels[row][col];
			rightPixel = pixels[mirrorPoint-row+mirrorPoint][col];
			rightPixel.setColor(leftPixel.getColor());
		}
	}
  }
  
  /** Mirror seagull to right so seagulls are right next to each other*/
  public void mirrorGull() {
	  int mirrorPoint = 342;
	  Pixel leftPixel = null;
	  Pixel rightPixel = null;
		
	  Pixel[][] pixels = this.getPixels2D();
		    
	  // loop through the rows
	  for (int row = 234; row < 321; row++)
	  {
		  // loop from 13 to just before the mirror point
		  for (int col = 239; col < mirrorPoint; col++)
		  {
		       
			  leftPixel = pixels[row][col];      
			  rightPixel = pixels[row][mirrorPoint - col + mirrorPoint];
			  rightPixel.setColor(leftPixel.getColor());
		  }
	  }

  }

  /** copy from the passed fromPic to the
   * specified startRow and startCol in the
   * current picture
   * @param fromPic the picture to copy from
   * @param startRow the start row to copy to
   * @param startCol the start col to copy to
   */
  
  	public void copy(Picture fromPic,int startRow, int startCol)
  	{
  		Pixel fromPixel = null;
  		Pixel toPixel = null;
  		Pixel[][] toPixels = this.getPixels2D();
  		Pixel[][] fromPixels = fromPic.getPixels2D();
  		for (int fromRow = 0, toRow = startRow; 
         fromRow < fromPixels.length &&
         toRow < toPixels.length; 
         fromRow++, toRow++)
  		{
  			for (int fromCol = 0, toCol = startCol; 
  			fromCol < fromPixels[0].length &&
  			toCol < toPixels[0].length;  
  			fromCol++, toCol++)
  			{
  				fromPixel = fromPixels[fromRow][fromCol];
  				toPixel = toPixels[toRow][toCol];
  				toPixel.setColor(fromPixel.getColor());
  			}
  		}   
  	}

  
  	public void copy2(Picture fromPic,int startRow, int startCol, int endRow, int endCol)
  	{
  		Pixel fromPixel = null;
  		Pixel toPixel = null;
  		Pixel[][] toPixels = this.getPixels2D();
  		Pixel[][] fromPixels = fromPic.getPixels2D();
 	 
 	 	for (int fromRow = 0, toRow = startRow; fromRow < fromPixels.length && toRow < endRow; fromRow++, toRow++)
 	 	{
 	 		for (int fromCol = 0, toCol = startCol; fromCol < fromPixels[0].length && toCol < endCol; fromCol++, toCol++)
 	 		{
 	 			fromPixel = fromPixels[fromRow][fromCol];
 	 			toPixel = toPixels[toRow][toCol];
 	 			toPixel.setColor(fromPixel.getColor());
 	 		}
 	 	}   
 	}
  
  	public void myCollage() {
  		Picture flower1 = new Picture("src/images/flower1.jpg");
  		flower1.mirrorVerticalBotToTop();
  		Picture flower2 = new Picture("src/images/flower2.jpg");
  		flower2.Grayscale();
  		this.copy(flower1,0,0);
  		this.copy(flower2,100,0);
  		this.copy(flower1,200,0);
  		Picture nextflower = new Picture("src/images/flower1.jpg");
  		nextflower.keepOnlyGreen();
  		this.copy(nextflower,300,0);
  		this.copy(flower1,400,0);
  		this.mirrorVertical();
	}
  
  /** Method to create a collage of several pictures */
  	public void createCollage()
  	{
  		Picture flower1 = new Picture("src/images/flower1.jpg");
  		Picture flower2 = new Picture("src/images/flower2.jpg");
  		this.copy(flower1,0,0);
  		this.copy(flower2,100,0);
  		this.copy(flower1,200,0);
  		Picture flowerNoBlue = new Picture(flower2);
  		flowerNoBlue.zeroBlue();
  		this.copy(flowerNoBlue,300,0);
  		this.copy(flower1,400,0);
  		this.copy(flower2,500,0);
  		this.mirrorVertical();
  		this.write("src/images/640x480.jpg");
  	}
  
  
  /** Method to show large changes in color 
    * @param edgeDist the distance for finding edges
    */
  	public void edgeDetection(int edgeDist)
  	{
  		Pixel leftPixel = null;
  		Pixel rightPixel = null;
  		Pixel[][] pixels = this.getPixels2D();
  		Color rightColor = null;
  		for (int row = 0; row < pixels.length; row++)
  		{
  			for (int col = 0; col < pixels[0].length-1; col++)
  			{
  				leftPixel = pixels[row][col];
  				rightPixel = pixels[row][col+1];
  				rightColor = rightPixel.getColor();
  				if (leftPixel.colorDistance(rightColor) > edgeDist)
  					leftPixel.setColor(Color.BLACK);
  				else
  					leftPixel.setColor(Color.WHITE);
  			}
  		}
  	}
  
  	public void encode(Picture messagePict) 
  	{
		Pixel[][] messagePixels = messagePict.getPixels2D();
		Pixel[][] currPixels = this.getPixels2D();
		Pixel currPixel = null;
		Pixel messagePixel = null;
		Pixel leftPixel = null;
		for (int row = 0; row < this.getHeight(); row++) {
			for (int col = 1; col < this.getWidth() - 1; col++) {
				currPixel = currPixels[row][col];
				leftPixel = currPixels[row][col - 1];
				if (currPixel.equals(leftPixel)) {
					currPixel.setRed(currPixel.getRed() + 1);
					currPixel.setGreen(currPixel.getGreen());
					currPixel.setBlue(currPixel.getBlue());
				}
			}
		}
		
		for (int row = 0; row < messagePict.getHeight(); row++) {
			for (int col = 1; col < messagePict.getWidth(); col+=2) {
				currPixel = currPixels[row][col];
				messagePixel = messagePixels[row][col];
				if (messagePixel.colorDistance(Color.BLACK) < 50) {
					leftPixel = currPixels[row][col - 1];
					currPixel.setColor(leftPixel.getColor());
				}
			}
		}
	}

	/*
	 * for (int row = 0; row < messagePict.getHeight(); row++) { for (int col =
	 * 0; col < messagePict.getWidth(); col++) { currPixel =
	 * currPixels[row][col]; messagePixel = messagePixels[row][col]; if
	 * (messagePixel.colorDistance(Color.BLACK) < 50) { rightPixel =
	 * currPixels[row][col + 1]; currPixel.setColor(rightPixel.getColor()); } }
	 * }
	 */
	

	/**
	 * Method to decode a message hidden in the red value of the current picture
	 * 
	 * @return the picture with the hidden message
	 */
	/*
	 * public Picture decode() { Pixel[][] pixels = this.getPixels2D(); int
	 * height = this.getHeight(); int width = this.getWidth(); Pixel currPixel =
	 * null;
	 * 
	 * Pixel messagePixel = null; Picture messagePicture = new Picture(height,
	 * width); Pixel[][] messagePixels = messagePicture.getPixels2D(); int count
	 * = 0; for (int row = 0; row < this.getHeight(); row++) { for (int col = 0;
	 * col < this.getWidth(); col++) { currPixel = pixels[row][col];
	 * messagePixel = messagePixels[row][col]; if (currPixel.getRed() % 2 == 1)
	 * { messagePixel.setColor(Color.BLACK); count++; } } }
	 * System.out.println(count); return messagePicture; }
	 */
	public Picture decode() 
	{
		Pixel[][] pixels = this.getPixels2D();
		int height = this.getHeight();
		int width = this.getWidth();
		Pixel currPixel = null;
		Pixel leftPixel = null;
		Pixel messagePixel = null;
		Picture messagePicture = new Picture(height, width);
		Pixel[][] messagePixels = messagePicture.getPixels2D();
		for (int row = 0; row < this.getHeight(); row++) {
			for (int col = 1; col < this.getWidth() - 1; col++) {
				currPixel = pixels[row][col];
				leftPixel = pixels[row][col - 1];
				messagePixel = messagePixels[row][col];
				if (currPixel.equals(leftPixel)) {
					messagePixel.setColor(Color.BLACK);
					// messagePixels[row][col + 1].setColor(Color.BLACK);
				}
			}
		}
		return messagePicture;
	}
  
  /* Main method for testing - each class in Java can have a main 
   * method 
   */
  	public static void main(String[] args) 
  	{
  		Picture beach = new Picture("src/images/beach.jpg");
  		beach.explore();
  		beach.zeroBlue();
  		beach.explore();
  	}
  
} // this } is the end of class Picture, put all new methods before this
