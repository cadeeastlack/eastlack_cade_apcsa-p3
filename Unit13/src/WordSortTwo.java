//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class WordSortTwo{
	private String[] wordRay;

	public WordSortTwo(String sentence){
		wordRay = sentence.split(" ");
	}
	
	public void sort(){
		for(int i = 1; i < wordRay.length; i++){
			String val = wordRay[i];
			int j = i;
			while(j > 0 && val.compareTo(wordRay[j-1]) < 0){
				wordRay[j] = wordRay[j-1];
				j--;
			}
			wordRay[j] = val;
		}
	}
	public String toString(){
		String output="";
		for(String s : wordRay) output += s + "\n";
		return output+"\n\n";
	}
}