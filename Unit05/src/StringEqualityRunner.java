//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;

import java.util.Scanner;

public class StringEqualityRunner
{
	public static void main( String args[] )
	{
		//add test cases
		Scanner keyboard = new Scanner(System.in);
		StringEquality ws = new StringEquality();
		out.print("Enter: ");
		String wordOne = keyboard.nextLine();
		String wordTwo = keyboard.nextLine();
		ws.setWords(wordOne, wordTwo);
		ws.checkEquality();
		out.println(ws.toString());
	}
}