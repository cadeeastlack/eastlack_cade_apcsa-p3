//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		String name1 = "";
		String name2 = "";
		int size1 = 0;
		int size2 = 0;
		
		//ask for name and size
		System.out.print("Enter 1st monster's name : ");
		name1 = keyboard.next();
		System.out.print("Enter 1st monster's size : ");
		size1 = keyboard.nextInt();
		
		//instantiate monster one
		Skeleton monster1 = new Skeleton(name1, size1);
		
		//ask for name and size
		System.out.print("Enter 2nd monster's name : ");
		name2 = keyboard.next();
		System.out.print("Enter 2nd monster's size : ");
		size2 = keyboard.nextInt();
		
		//instantiate monster two
		Skeleton monster2 = new Skeleton(name2, size2);
		
		System.out.println("\nMonster 1 - " + monster1);
		System.out.println("Monster 2 - " + monster2 + "\n");
		
		if(monster1.isBigger(monster2)) {
			System.out.println("Monster one is bigger than Monster two.");
		}
		else if (monster1.isSmaller(monster2)) {
			System.out.println("Monster one is smaller than Monster two.");
		}
		
		if (monster1.namesTheSame(monster2)) {
			System.out.println("Monster one has the same name as Monster two.\n");
		}
		else {
			System.out.println("Monster does not have the same name as Monster two.\n");
		}
	}
}