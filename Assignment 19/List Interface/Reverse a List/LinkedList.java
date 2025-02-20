class LinkedList{

	class Node{
	
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			
			this.next = null;
		}
	
	}
	
	Node head;
	Node tail;
	int size;
		
		LinkedList(){
			this.head = null;
			this.tail = null;
			this.size = 0;
		
		}
	
	public void add(int data){
		
		Node nn = new Node(data);
		
		if(tail == null)
			tail = nn;
		else{
			tail.next = nn;
			tail = nn;
		}
		
		if(head == null)
			head = nn;
		
	
	}
	
	public void remove(int index){
	
		if(index >= size){
			System.out.println("Cannot remove element at given index");
			return;
		}	
		
		if(index == 0){
			head = head.next;
			size--;
			return;
		}
		Node temp = head;
		Node prev = null;
		int c = 0; 
		
		while(temp !=null){
		
			if(c == index){
				prev.next = temp.next;
				temp.next = null;
				break;
			}
			c++;
			prev = temp;
			temp = temp.next;
		
		}
		size--;
	}
	
	public void reverse(){
	
		Node curr = head;
		Node prev = null;
		
		while(curr!=null){
			
			Node next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		
		head = prev;
	
	}
	
	public void display(){
		
		Node temp = head;
		while(temp != null){
			
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
		
	}

}