package Pack1;

public class Linkedlist {
private Node head;
//private Node tail=null;
Linkedlist()
{
	this.head=null;
}
public Node getHead() {
	return head;
}

public void setHead(Node head) {
	this.head = head;
}
//Insert at the start
public void insertAtStart(int data)
{
	Node newnode=new Node(data);
	newnode.setNextnode(null);
	if(head==null)
	{
		head=newnode;
		//tail=newnode;
	}
	else
	{
		newnode.setNextnode(head);
		head=newnode;
	}
}
@SuppressWarnings("null")
public void print()
{
	Node current=head;
	if(current==null)
	{
		System.out.println("Linked list is empty");
	}
	while(current!=null)
	{
		System.out.println(current.getData());
		current=current.getNextnode();
	}
	
}



}
