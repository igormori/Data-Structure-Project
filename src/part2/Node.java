//****************************************************************************************************
//* Project: < Comp2080_ASSIGN1-CODEGROUP >
//* Assignment: < assignment 1 >
//* Author(s): < Arif, Ankur,Farhad, Igor,Yash>
//* Student Number: < 100883999, 101095272,101093832,101045762,101056010 >
//* Date:30-03-2018
//* Description: 
//****************************************************************************************************
package part2;

public class Node<T> {
	private T items;
	private Node<T> nextNode; //this is self refrencial object to the next node of a link list
	public Node(T items)//constructor
	{
		this.items=items;
	}
	public void setItems(T items)
	{
		this.items=items;
	}
	public T getItems() 
	{
		return items;
	}
	public void setNextNode(Node<T> nextNode)
	{
		this.nextNode=nextNode;
	}
	public Node<T> getNextNode()
	{
		return nextNode;
	}

}
