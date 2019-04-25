/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
	Picture beach = new Picture("src/images/beach.jpg");
    //beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test keepOnlyBlue */
  public static void testKeepOnlyBlue()
  {
    Picture beach = new Picture("src/images/beach.jpg");
    //beach.explore();
    beach.keepOnlyBlue();
    beach.explore();
  }
  /** Method to test keepOnlyRed */
  public static void testKeepOnlyRed()
  {
    Picture beach = new Picture("src/images/beach.jpg");
    //beach.explore();
    beach.keepOnlyRed();
    beach.explore();
  }
  /** Method to test keepOnlyGreen */
  public static void testKeepOnlyGreen()
  {
    Picture beach = new Picture("src/images/beach.jpg");
    //beach.explore();
    beach.keepOnlyGreen();
    beach.explore();
  }
  
  
  /** Method to test testNegate */
  public static void testNegate()
  {
    Picture beach = new Picture("src/images/beach.jpg");
    //beach.explore();
    beach.Negate();
    beach.explore();
  }
  
  
  /** Method to test testGrayscale */
  public static void testGrayscale()
  {
    Picture beach = new Picture("src/images/beach.jpg");
    //beach.explore();
    beach.Grayscale();
    beach.explore();
  }
  
  
  /** Method to test testFixUnderwater */
  public static void testFixUnderwater() {
	  Picture water = new Picture("src/images/water.jpg");
	  //water.explore();
	  water.FixUnderWater();
	  water.explore();
  }
 
  
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
	Picture caterpillar = new Picture("src/images/caterpillar.jpg");
    //caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  
  public static void testMirrorVerticalRightToLeft()
  {
    Picture redMCycle = new Picture("src/images/redMotorcycle.jpg");
    //redMCycle.explore();
    redMCycle.mirrorVerticalRightToLeft();
    redMCycle.explore();
  }
  
  public static void testMirrorVerticalBotToTop()
  {
    Picture redMCycle = new Picture("src/images/redMotorcycle.jpg");
    //redMCycle.explore();
    redMCycle.mirrorVerticalBotToTop();
    redMCycle.explore();
  }
  public static void testMirrorDiagonal()
  {
    Picture beach = new Picture("src/images/beach.jpg");
    //beach.explore();
    beach.mirrorDiagonal();
    beach.explore();
  }
  /** Method to test mirrorHorizontal */
  public static void testMirrorHorizontal()
  {
    Picture caterpillar = new Picture("src/images/caterpillar.jpg");
    //caterpillar.explore();
    caterpillar.mirrorHorizontal();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
	  Picture temple = new Picture("src/images/temple.jpg");
    //temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  /** Method to test mirrorArms*/
  public static void testMirrorArms() {
	  Picture snowman = new Picture("src/images/snowman.jpg");
	  //snowman.explore();
	  snowman.mirrorArms();
	  snowman.explore();
  }
  /** Method to test mirrorGull*/
  public static void testMirrorGull() {
	  Picture gull = new Picture("src/images/seagull.jpg");
	  //gull.explore();
	  gull.mirrorGull();
	  gull.explore();
  }

  
  /** Method to test the collage method and save it to prior empty one  */
  public static void testCollage()
  {
    Picture canvas = new Picture("src/images/640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  
  /** Method to test the new advanced beautiful collage*/
  public static void testMyCollage() {
	  	Picture canvas = new Picture("src/images/640x480.jpg");
	    canvas.myCollage();
	    canvas.explore();
}
  
  
  
  /** Method to test the copy  method onto collage */
  public static void testCopy(){
	  Picture copy = new Picture("src/images/640x480.jpg");
	  Picture copied = new Picture("src/images/snowman.jpg");
	  //copy.explore();
	  copy.copy(copied, 72, 120);
	  copy.explore();
  }
  
  
  /** Method to test the 1/4 fraction pic method */
  public static void testCopy2(){
	  Picture copy = new Picture("src/images/640x480.jpg");
	  Picture copied = new Picture("src/images/snowman.jpg");
	  //copy.explore();
	  copy.copy2(copied, 200, 300, 400, 500);
	  copy.explore();
  }
  
 
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("src/images/swan.jpg");
    swan.explore();
    swan.edgeDetection(10);
    swan.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
	  //Picture tester = new Picture();
	  
	  //testZeroBlue(); //finished
	  //testKeepOnlyBlue();   //finished
	  //testKeepOnlyRed(); //finished
	  //testKeepOnlyGreen(); //finished
	  //testNegate(); //finished
	  //testGrayscale();  //finished
	  //testFixUnderwater(); //finished
	  //testMirrorVertical();//finished
	  //testMirrorHorizontal(); //finished
	  //testMirrorDiagonal(); //finished
	  //testMirrorVerticalRightToLeft();//finished
	  //testMirrorVerticalBotToTop(); //finished
	  //testMirrorTemple();//finished
	  //testMirrorArms();//finished
	  //testMirrorGull();//finished
	  //testCollage();//finished
	  testCopy();//finished
	  //testCopy2();//finished
	  //testMyCollage();//finished
	  //testEdgeDetection();//finished
    
	  
	  //not finished down below 
    //THIS IS NASTY WATER DOWN SOUTH
	  
	  //testEdgeDetection2();
	  //testChromakey();
	  //testEncodeAndDecode();
	  //testGetCountRedOverValue(250);
	  //testSetRedToHalfValueInTopHalf();
	  //testClearBlueOverValue(200);
	  //testGetAverageForColumn(0);
  }
}