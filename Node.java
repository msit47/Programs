package Pack1;

public class Node {
 private int data;
 private Node nextnode;
 
public int getData() {
	return data;
}
public void setData(int data) {
	this.data = data;
}
public Node getNextnode() {
	return nextnode;
}
public void setNextnode(Node nextnode) {
	this.nextnode = nextnode;
}
 Node(int data)
 {
	 this.data=data;
 }
@Override
public String toString() {
	return ""+this.data;
}
}
