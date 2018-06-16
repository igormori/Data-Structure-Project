

//****************************************************************************************************
//* Project: < Comp2080_ASSIGN1-CODEGROUP >
//* Assignment: < assignment 1 >
//* Author(s): < Arif, Ankur,Farhad, Igor,Yash>
//* Student Number: < 100883999, 101095272,101093832,101045762,101056010 >
//* Date:30-03-2018
//* Description: 
//****************************************************************************************************
package partOne;
import java.math.BigInteger;

public class mymethodtotest {
	public static void testDaffy(int start, int end)
	{
		Stopwatch sw=new Stopwatch();
		
			for (int i=start;i<=end;i++)
			{
				sw.start();
				Timing.daffy(i);
				sw.stop();
				System.out.println("For Value of N = "+i +"  " +sw.toString());
			}		
	}
	public static void testDonald(int start, int end)
	{
		Stopwatch sw=new Stopwatch();
		for (int i=start;i<=end;i++)
		{
			sw.start();
			Timing.donald(i);
			sw.stop();
			System.out.println("For Value of N = "+i +"  " +sw.toString());
		}
	}
	
	public static void testgyro(int start, int end)
	{
		Stopwatch sw=new Stopwatch();
		
		
		for (int i=start;i<=end;i*=2)
		{
			int[] myarr=Timing.randomarr(i);
			Timing.pluto(myarr);
			sw.start();
			Timing.gyro(myarr);
			sw.stop();
			System.out.println("For Value of N = "+i +"  " +sw.toString());
		}
		
	}
	public static void testfactBigint(int start, int end)

	{
		Stopwatch sw=new Stopwatch();

		for (int i=start;i<=end;i*=2)
		{
			BigInteger bgn=BigInteger.valueOf((long) i);
			sw.start();
			Timing.fact(bgn);
			sw.stop();
			System.out.println("For Value of N = "+i +"  " +sw.toString());		
		}
	}
	
	
	public static void testMickey(int start, int end)

	{
		Stopwatch timer = new Stopwatch();

		for(int i=start; i<=end; i*=2)

		{

			Timing.randomarr(i);

			timer.start();

			Timing.mickey(Timing.randomarr(i));

			timer.stop();

			System.out.println("For Value of N = "+i +"  " +timer.toString());		

		}

	}
    
	public static void testMinnie(int start, int end)
	{
		Stopwatch timer = new Stopwatch();
		for(int i=start; i<=end; i*=2)
		{
			int[] myarr=Timing.randomarr(i);
			timer.start();
			Timing.minnie(myarr);
			timer.stop();
			System.out.println("For Value of N = "+i +"  " +timer.toString());					
		}
	}
	public static void testGoofy(int start, int end)
	{
		Stopwatch timer = new Stopwatch();
		for(int i=start; i<=end; i*=2)
		{
			int[] myarr=Timing.randomarr(i);
			timer.start();
			Timing.goofy(myarr);
			timer.stop();
			System.out.println("For Value of N = "+i +"  " +timer.toString());					
		}
	}
	public static void testPluto(int start, int end)
	{
		Stopwatch timer = new Stopwatch();

		for(int i=start; i<=end; i*=2)

		{
			int[] myarr=Timing.randomarr(i);
			timer.start();
			Timing.pluto(myarr);
			timer.stop();
			System.out.println("For Value of N = "+i +"  " +timer.toString());		

			
		}
	}
   

}
