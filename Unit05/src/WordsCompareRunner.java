//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

import java.util.Scanner;

public class WordsCompareRunner
{
   public static void main( String args[] )
   {
	   Scanner keyboard = new Scanner(System.in);
	   WordsCompare dictionary = new WordsCompare();
	   
	   for(int i=1; i<=4; i++) {
		   out.println("Enter 2 words: ");
		   String wordOne = keyboard.nextLine();
		   String wordTwo = keyboard.nextLine();
	   
		   dictionary.setWords(wordOne, wordTwo);
		   dictionary.compare();
		   out.println(dictionary.toString());
	   
	   }
	}
}