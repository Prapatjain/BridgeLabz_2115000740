class LinkedList<T>{

	class Node{
	
		T data;
		Node next;
		
		Node(T data){
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
	
	public void add(T data){
		
		Node nn = new Node(data);
		
		if(tail == null)
			tail = nn;
		else{
			tail.next = nn;
			tail = nn;
		}
		
		if(head == null)
			head = nn;
		
		size++;
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
	
	public void findFromLast(int n){
		if(n>size){
			System.out.println("Cannot find element as "+n+" is greater then size "+size+" of linked list");
			return;
		}
		
		Node temp1 = head;
		Node temp2 = head;
		int c = 1;
		
		while(c<=n){
			temp2 = temp2.next;
			c++;
		}
		
		while(temp2!=null){
			temp1 = temp1.next;
			temp2 = temp2.next;
		}
		
		System.out.println("Value at "+n+"th node from last is : "+temp1.data);
	
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