//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

class StringRemover
{
   private String sentence;
   private String remove;

	public StringRemover() 
	{
		sentence = "";
		remove = "";
		
	}
	

	public void setRemover(String s, String rem)
	{
		this.sentence=s;
		this.remove=rem;
	}

	public String removeStrings()
	{
		String cleaned = sentence;
		while (cleaned.indexOf(remove)>=0) {
			int a = cleaned.indexOf(remove);
			if(a-1>0) {
				cleaned = cleaned.substring(0, a-1) + cleaned.substring(a+remove.length());
			}
			else {
				cleaned = cleaned.substring(a+remove.length());
			}
		}
		
		return cleaned + "\n";
	}

	public String toString()
	{
		return sentence + " - String to remove " + remove;
	}
}