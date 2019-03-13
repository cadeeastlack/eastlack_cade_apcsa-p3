//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{
	public static int go( List<Integer> ray )
	{
		int even =0;
		int odd =0;
		int evenCount =1;
		int oddCount =1;
	
		for (int i=0;i<ray.size();i++)
		{
			if (((ray.get(i)%2) != 0) && (oddCount==1))
			{ 
				odd=i+1;
				oddCount++;
			}
		}	
	
		for (int j=ray.size()-1;j>=0;j--)
		{
			if ((ray.get(j))%2==0 && evenCount ==1)
				{
					even = j+1;
					evenCount++;
				}
				
		}
		if (even==0||odd==0)
			return -1;
		return even-odd;
	}
}