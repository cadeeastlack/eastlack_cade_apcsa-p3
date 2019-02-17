//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Perfect
{
	private int number;

  	public Perfect() {
  		setNum(0);
   	}
  	
   public Perfect(int x) {
   		setNum(x);
   		isPerfect();
   	}

	
   	public void setNum(int x) {
   		number = x;
   	}

	public boolean isPerfect()
	{
		int sums = 0;
		
		for(int i = 1; i < number; i++) {
			if(number % i == 0) {
				sums += i;
			}
		}
		
		
		if(number == sums) 
			return true;
		else
			return false;
	}

	public String toString()
 	{	
 		if(isPerfect()) {
 			return (number + " is perfect.");
 		}

 		else
 			return (number + " is not perfect.");

 	}	
}