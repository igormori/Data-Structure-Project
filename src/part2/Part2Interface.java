//****************************************************************************************************
//* Project: < Comp2080_ASSIGN1-CODEGROUP >
//* Assignment: < assignment 1 >
//* Author(s): < Arif, Ankur,Farhad, Igor,Yash>
//* Student Number: < 101056010 >
//* Date:30-03-2018

//****************************************************************************************************

package part2;
public interface Part2Interface<T> {
	public void addAfter(T element);
	public void addAll(LinkedSequence<T> seq);
	public void addBefore(T element);
	public void advance();
	public LinkedSequence<T> clone();
	public T getCurrNode();
	public boolean isCurrent();
	public void removeCurrent();
	public int size();
	public void start();
	
	

}
