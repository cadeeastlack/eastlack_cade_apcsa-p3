//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StringEquality
{
	private String wordOne, wordTwo;

	public StringEquality()
	{
		setWords("","");
	}

	public StringEquality(String one, String two)
	{
		setWords(one,two);
	}

	public void setWords(String one, String two)
	{
		wordOne = one;
		wordTwo = two;
	}

	public boolean checkEquality( )
	{
		if(wordOne.equals(wordTwo)) {
			return false;
		}
		else
			return true;
	}

	public String toString()
	{
		if(wordOne.equals(wordTwo) == false) {
			return wordOne + " does not have the same letters as " + wordTwo + "\n";
		}
		return wordOne + " has the same letters as " + wordTwo + "\n";
	}
}