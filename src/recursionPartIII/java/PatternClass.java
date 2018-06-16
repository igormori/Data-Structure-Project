

//****************************************************************************************************
//* Project: < Comp2080_ASSIGN1-CODEGROUP >
//* Assignment: < assignment 1 >
//* Author(s): < Arif, Ankur,Farhad, Igor,Yash>
//* Student Number: < 100883999, 101095272,101093832,101045762,101056010 >
//* Date:30-03-2018
//* Description: 
//****************************************************************************************************
package recursionPartIII.java;

public class PatternClass 
{
	//Pttern one with *   
	public static String starrow(int x)//this method to print column of *
	{
		if (x > 1)
		{
			return "*" + starrow(x-1);
		}
		else
		{
			return "*";
		}

	}

	public static void starpattern3(int x, int y)//this method is responsible for maintaining the row
	{
		System.out.print(starrow(x));
		System.out.println();
		if (x < y)
			starpattern3(x + 1, y);
		System.out.print(starrow(x));
		System.out.println();
	}

	//Pttern No Two 

	public static void level3(String string, int levels) 
	{

		if(levels<1) 
		{
			return;
		}

		level3(string,levels-1);
		string += levels;

		System.out.println(string);


	}
}
