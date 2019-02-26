//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFive
{
   private char letter;
   private int amount;

	public TriangleFive()
	{
		setLetter(' ');
		setAmount(0);
	}

	public TriangleFive(char c, int amt)
	{
		setLetter(c);
		setAmount(amt);
	}

	public void setLetter(char c)
	{
		letter = Character.toUpperCase(c);
	}

	public void setAmount(int amt)
	{
		amount = amt; 
	}

	public String toString()
	{
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String output="";
		
		int position = alphabet.indexOf(letter);
		
		
		for(int i = 0; i < amount; i++) 
		{
			for(int j = amount; j > i; j--) 
			{
				for(int k = j; k > -1; k--) 
				{
					if(k > 0)
					{
						output += alphabet.substring(position, position+1);
					}
					else if( k == 0)
					{
						output += " ";
						if(position < 25)
							position++;
						else
							position = 0;	
					}
				}
				
				if(j == i + 1)
				{
					output += "\n";
					position = alphabet.indexOf(letter); 
				}			
			}	
		}	
		return output;
	}
}