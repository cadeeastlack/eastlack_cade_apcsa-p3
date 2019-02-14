//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class StringRunner
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		StringOddOrEven evenodd = new StringOddOrEven();
		out.print("Enter a word :: ");
		String word = keyboard.nextLine();
		evenodd.setString(word);
		evenodd.isEven();
		out.println(evenodd.toString());
	}
}