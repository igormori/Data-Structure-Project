

//****************************************************************************************************
//* Project: < Comp2080_ASSIGN1-CODEGROUP >
//* Assignment: < assignment 1 >
//* Author(s): < Arif, Ankur,Farhad, Igor,Yash>
//* Student Number: < 101056010 >
//* Date:30-03-2018

//****************************************************************************************************
package part2;
public class LinkedSequence<T> implements Part2Interface<T>{
	Node<T> firstNode;//this is the reference to the first node in a link list
	Node<T> CurrNode;//this is the reference to the current node in a link list
	public T getCurrNode() {
		if(CurrNode==null)
		{
			throw new NullPointerException("There is no current node");
		}
		return CurrNode.getItems();
	}
	public void addAfter(T element)
	{
		Node<T> node=new Node<T>(element);
		node.setItems(element);
		if(firstNode==null)
		{
			firstNode=node;//if no element firstnode is the node 
			CurrNode=node;//if no element CurrNode is the node 

		}
		else
		{
			if(isCurrent())
			{
				Node<T> currnode=firstNode;
				while(currnode!=CurrNode)
				{
					currnode=currnode.getNextNode();
				}

				if(currnode.getNextNode()!=null)//this condition when the currnode in between two node
				{
					currnode.setNextNode(node);
					node.setNextNode(CurrNode.getNextNode());
				}
				else//this condition is when currnode at the end
				{
					currnode.setNextNode(node);
				}

				CurrNode=node;
			}
			else//when current node not found
			{
				Node<T> curr=firstNode;
				while(curr.getNextNode()!=null)
				{

					curr=curr.getNextNode();

				}
				curr.setNextNode(node);
			}


		}
	}
	public void addBefore(T element)
	{
		Node<T> node=new Node<T>(element);
		node.setItems(element);
		if(CurrNode==null)
			//my current node can have two null situation

		{
			//no.1. when the list is empty that time my currnode is null
			if(firstNode==null)
			{
				firstNode=node;//if no element firstnode is the node 
				CurrNode=node;//if no element CurrNode is the node 
			}
			//no.2. when the list is not empty currnode null
			//but here i need to assign the address of firstnode to newnode
			//and then i will do same like i did on line 69,70
			//this way i can avoid nullpointer exception
			else
			{
				node.setNextNode(firstNode);
				firstNode=node;
				CurrNode=node;
			}


		}
		else
		{
			if(isCurrent())
			{
				Node<T> currnode=firstNode;
				while(currnode.getNextNode()!=CurrNode)
				{
					currnode=currnode.getNextNode();
				}

				if(CurrNode.getNextNode()!=null)//this condition when the currnode in between two node
				{
					currnode.setNextNode(node);
					node.setNextNode(CurrNode);
				}
				else//this condition is when currnode at the end
				{
					currnode.setNextNode(node);
					node.setNextNode(CurrNode);
				}

				CurrNode=node;
			}
			else//when current node not found
			{
				node.setNextNode(firstNode);
				firstNode=node;


			}


		}


	}
	public boolean isCurrent()
	{
		if(getCurrNode()==null)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	public void removeCurrent()
	{
		if(isCurrent())
		{
			Node<T> traverseCurr=firstNode;
			while(traverseCurr.getNextNode()!=CurrNode)
			{
				traverseCurr=traverseCurr.getNextNode();
			}
			if(CurrNode.getNextNode()!=null)
			{

				traverseCurr.setNextNode(CurrNode.getNextNode());//setting the traversecurr to nextnodeof 
			}
			else
			{
				traverseCurr.setNextNode(null);
				CurrNode=null;
			}
		}
		else if(CurrNode.getNextNode()==null)
		{
			throw new NullPointerException("No current element to remove");
			
		}
	}
	public int size()

	{
		int counter=0;
		Node<T> currnode=firstNode;
		while(currnode!=null)
		{
			currnode=currnode.getNextNode();
			counter++;
		}
		return counter;

	}
	public void advance()
	{
		if(isCurrent())//condition to check current node existence 
		{
			if(CurrNode==firstNode && (firstNode.getNextNode()!=null))//condition to check if the current node is in the firstnode and more than one node in the list
			{
				CurrNode=firstNode.getNextNode();
			}
			else if(CurrNode==firstNode && (firstNode.getNextNode()==null))//condition to check if the current node is in the firstnode and just one node in the list
			{
				CurrNode=null;
			}
			else//when i have currnode not in first position and i have multiple node in the list
			{
				Node<T> curr=firstNode;
				while(curr.getNextNode()!=CurrNode)//traversing to get the node right before the current node
				{
					curr=curr.getNextNode();
				}
				if(CurrNode.getNextNode()==null)//if Current node is the last node
				{
					Node<T> temp;
					temp=curr.getNextNode();
					CurrNode=null;
					curr.setNextNode(temp);
				}
				else//any other case
				{
					CurrNode=curr.getNextNode().getNextNode();
				}

			}


		}
		if(CurrNode==null)
		{
			throw new IllegalStateException("The current node is in the end");
		}
	}
	public void insert(T item)
	{
		Node<T> node=new Node<T>(item);
		node.setItems(item);
		if(firstNode==null)
		{
			firstNode=node;
			return;
		}
		else
		{
			Node<T> currnode=firstNode;
			while(currnode.getNextNode()!=null)
			{
				currnode=currnode.getNextNode();
			}
			currnode.setNextNode(node);

		}
	}

	@SuppressWarnings("rawtypes")
	public Node getLastNode() {
		Node<T> curr=firstNode;
		while(curr.getNextNode()!=null)
		{
			curr=curr.getNextNode();

		}
		return curr;
	}

	@SuppressWarnings("unchecked")
	public static LinkedSequence<?> append(LinkedSequence<?> s1, LinkedSequence<?> s2)
	{
		if(s1==null||s2==null)
		{
			throw new NullPointerException("Empty list cannot be appended");

		}
		else
		{
			s1.getLastNode().setNextNode(s2.firstNode);
			return s1;
		}

	}

	public void start()
	{
		if(firstNode==null)
		{
			CurrNode=null;
		}
		else
		{
			CurrNode=firstNode;
		}
	}
	public LinkedSequence<T> clone()
	{
		LinkedSequence<T> newcopy=new LinkedSequence<T>();

		Node<T> currnode=firstNode;
		while(currnode!=null)
		{
			newcopy.insert(currnode.getItems());
			currnode=currnode.getNextNode();					
		}

		return newcopy;
	}
	public void addAll(LinkedSequence<T> seq)
	{
		if(seq.size()>0)
		{
			Node<T> currnode=firstNode;

			while(currnode.getNextNode()!=null)
			{
				currnode=currnode.getNextNode();
			}

			currnode.setNextNode(seq.firstNode);
			currnode=seq.firstNode;


		}	
		else
		{
			throw new NullPointerException("The List to be appended is empty");
		}
	}
	public String toString()

	{
		String s="";
		int counter=1;
		Node<T> curr=firstNode;
		while(curr!=null)
		{
			s=s+"the data in link "+ counter+" is: "+curr.getItems()+"\n";
			curr=curr.getNextNode();
			counter++;
		}
		return s;

	}

}
