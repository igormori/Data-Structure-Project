

//****************************************************************************************************
//* Project: < Comp2080_ASSIGN1-CODEGROUP >
//* Assignment: < assignment 1 >
//* Author(s): < Arif, Ankur,Farhad, Igor,Yash>
//* Student Number: < 101056010 >
//* Date:30-03-2018
//* Description: <My custom method to test mysteriuos method of timing.java>
//****************************************************************************************************
package part2;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedSequence<String> s1=new LinkedSequence<String>();
		try
		{
			s1.getCurrNode();
		}
		catch(NullPointerException e)
		{
			System.out.println(e.getMessage());
		}
		s1.addAfter("a");
		System.out.println(s1.getCurrNode());
		s1.addAfter("b");
		s1.addAfter("c");
		System.out.print(s1.toString());
		System.out.println(s1.getCurrNode());
		if(s1.isCurrent())
		{
			System.out.println("found");
		}
		else
		{
			System.out.println("not found");
		}
		
		s1.removeCurrent();
		System.out.println(s1.toString());
		try
		{
			s1.getCurrNode();
		}
		catch(NullPointerException e)
		{
			System.out.println(e.getMessage());
		}
		s1.addBefore("before");
		System.out.println(s1.toString());
		System.out.println(s1.getCurrNode());
		System.out.println(s1.size());
				s1.advance();
		System.out.println(s1.getCurrNode());
		s1.advance();
		System.out.println(s1.getCurrNode());
		System.out.println("-----------");
		try//trying to advance when the current node in the end
		{
			s1.advance();
		}
		catch(IllegalStateException e)
		{
			System.out.println(e.getMessage());
		}
		
		//after executing this part give nullpointer exception 
		try
		{
			System.out.println(s1.getCurrNode());
		}
		catch(NullPointerException e)
		{
			System.out.println(e.getMessage());
		}
		
		
		try
		{
			s1.removeCurrent();
		}
		catch(NullPointerException e)
		{
			System.out.println(e.getMessage());
		}
		
		s1.start();
		System.out.println(s1.getCurrNode());		
		System.out.println(s1.toString());
		LinkedSequence<String> s3=new LinkedSequence<String>();
		LinkedSequence<String> s2=new LinkedSequence<String>();
		s2.addAfter("t");
		s2.addAfter("r");
		s2.addAfter("y");
		System.out.println(s3.toString());
		try
		{
			s1.addAll(s3);//trying to add an empty list
		}
		catch(NullPointerException e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s1.toString());
		LinkedSequence<String> s4=new LinkedSequence<String>();
		s4=s1.clone();
		System.out.println(s3.toString());
		System.out.println(s1.toString());
		LinkedSequence<String> l1=new LinkedSequence<String>();
		l1.insert("a");
		l1.insert("b");
		l1.insert("c");
		System.out.println(l1.toString());
		LinkedSequence<Integer> l3=null;

		try//trying to append an empty list
		{
			LinkedSequence LL=LinkedSequence.append(l1, l3);
		}
		catch(NullPointerException e)
		{
			System.out.println(e.getMessage());
		}
		LinkedSequence<Integer> l2=new LinkedSequence<Integer>();
		l2.insert(1);
		l2.insert(2);
		l2.insert(3);
		try
		{
			LinkedSequence LL=LinkedSequence.append(l1, l2);
			System.out.println(LL.toString());
		}
		catch(NullPointerException e)
		{
			System.out.println(e.getMessage());
		}
		
	}

}
