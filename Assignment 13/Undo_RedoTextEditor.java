import java.util.*;
class Undo_RedoTextEditor{
	
	class Node{
	
		String text;

		Node next;
		Node prev;
	
		Node(String text){
			this.text = text;
		
			this.next = null;
			this.prev= null;
		}
		
		public void display(){
			System.out.print(this.text+" ");
		}
		

	}
	
	Node head;
	Node tail;
	
	Node curr;
	
	int size;
	int limit;
	int undoes;
	
	Undo_RedoTextEditor(int limit){
		this.head = null;
		this.tail = null;
		
		this.curr = null;
		
		this.size = 0;
		this.limit = limit;
		
		this.undoes = 0;
	}
	
	public void add(String text){
		
		Node nn = new Node(text);
		
		if(curr == null){
			curr = nn;
			tail = nn;
			undoes = 0;
		}
		else{
			curr.next = nn;
			nn.prev = curr;
			curr = nn;
			tail = curr;
			undoes = 0;
		}
		
		if(head == null)
			head = nn;
		
		size++;
		
		System.out.println("Node is added at Last");
	}
	
	public void delete(String text){
		//if at first place
		if(head.text.equals(text)){
			head = head.next;
			head.prev = null;
			return;
		}
		
		Node prev = null;
		Node temp = head;
		
		while(temp != null){
			if(temp.text.equals(text)){
				prev.next = temp.next;
				if(temp.next == null) //if at last place
					tail = prev;
				if(temp.next != null)
					temp.next.prev = prev; //updating the previous of temp.next
			}
				
			prev = temp;
			temp = temp.next;
		}
		
	}
	
	public void displayAll(){
		
		Node temp = head;
		
		while(temp != curr.next){
			temp.display();
			temp = temp.next;
		}
		System.out.println();
	}
	
	public void undo(){
		
		if(undoes >= limit){
			System.out.println("Cannot undo more than "+limit+" times");
			return;
		}
		
		curr = curr.prev;
		undoes++;
		
	}
	
	public void redo(){
		
		if(curr == null || curr.next == null){
			System.out.println("Can not Redo  anymore");
			return;
		}
		curr = curr.next;
		undoes--;
	}

	public static void main(String[] args){
		
		Undo_RedoTextEditor dl1 = new Undo_RedoTextEditor(3);
		
		dl1.add("Hello");
		dl1.add("My name is");
		dl1.add("Prapat Jain.");
		dl1.add("How are you");
		dl1.add("Doing?");
		
		dl1.displayAll();
		
		dl1.undo();
		dl1.undo();
		dl1.undo();
		
		dl1.displayAll();
		
		dl1.redo();
		
		dl1.displayAll();
		
		dl1.undo();
		
		dl1.add("Nihit Jain");
		
		dl1.displayAll();
	}

	
}