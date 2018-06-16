
//****************************************************************************************************
//* Project: < Comp2080_ASSIGN1-CODEGROUP >
//* Assignment: < assignment 1 >
//* Author(s): < Arif, Ankur,Farhad, Igor,Yash>
//* Student Number: < 100883999, 101095272,101093832,101045762,101056010 >
//* Date:30-03-2018
//* Description: 
//****************************************************************************************************
package partOne;
/**
 A class to measure time elapsed.
*/

public class Stopwatch
{
    private long startTime;
    private long stopTime;

    public static final double NANOS_PER_SEC = 1000000000.0;

	/**
	 start the stop watch.
	*/
	public void start()
	{	System.gc();
		startTime = System.nanoTime();
	}

	/**
	 stop the stop watch.
	*/
	public void stop()
	{	stopTime = System.nanoTime();	}

	/**
	elapsed time in secods.
	@return the time recorded on the stopwatch in seconds
	*/
	public double time()
	{	return (stopTime - startTime) / NANOS_PER_SEC;	}

	public String toString()
	{   return "elapsed time: " + timeInNanoseconds() + " Nano seconds.";
	}

	/**
	elapsed time in nanoseconds.
	@return the time recorded on the stopwatch in nanoseconds
	*/
	public long timeInNanoseconds()
	{	return (stopTime - startTime);	}
}
