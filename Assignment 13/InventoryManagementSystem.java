import java.util.*;
class InventoryManagementSystem{
	
	class Node{
	
		int itemId;
		String name;
		int quantity;
		int price;
		
		Node next;
	
		Node(int itemId, String name, int quantity, int price){
		
			this.itemId = itemId;
			this.name = name;
			this.quantity = quantity;
			this.price = price;
		
			this.next = null;
		}
		
		Node(Node n){
			this.itemId = n.itemId;
			this.name = n.name;
			this.quantity = n.quantity;
			this.price = n.price;
		
			this.next = null;
		}
		
		public void display(){
			System.out.println("Item id is : "+this.itemId);
			System.out.println("Item name is : "+this.name);
			System.out.println("Item quantity is : "+this.quantity);
			System.out.println("Item price is : "+this.price);
		}
		
	}
	
	Node head;
	Node tail;
	int size;
	
	InventoryManagementSystem(){
		this.head = null;
		this.tail = null;
		this.size = 0;
	}
	
	public void addLast(int itemId, String name, int quantity, int price){
		
		Node nn = new Node(itemId, name, quantity, price);
		
		if(tail == null)
			tail = nn;
		else{
			tail.next = nn;
			tail = nn;
		}
		
		if(head == null)
			head = nn;
		
		size++;
		
		System.out.println("Node is added at Last");
	}
	
	public void addFirst(int itemId, String name, int quantity, int price){
		
		Node nn = new Node(itemId, name, quantity, price);
		
		Node temp = head;	
		
		head = nn;
		head.next = temp;
		
		size++;
		
		System.out.println("Node is added at First");
	}
	
	public void addAt(int itemId, String name, int quantity, int price, int place){
		
		if(place > (size+1) || place <= 0){
			System.out.println("Can not add at this position");
			return;
		}
		if(place == 1){
			addFirst(itemId, name, quantity, price);
			return;
		}
		if(place == (size+1)){
			addLast(itemId, name, quantity, price);
			return;
		}
		
		
		Node temp = head;
		int c = 1;
		while(c <= place && temp != null){
			if(c == (place-1)){
				Node nn = new Node(itemId, name, quantity, price);
				nn.next = temp.next;
				temp.next = nn;
				System.out.println("Node has been added to the place "+place);
			}
			temp = temp.next;
			c++;
		}
		
	}
	
	public void delete(int itemId){
		//if at first place
		if(head.itemId == itemId){
			head = head.next;
			return;
		}
		
		Node prev = null;
		Node temp = head;
		
		while(temp != null){
			if(temp.itemId == itemId){
				prev.next = temp.next;
				if(temp.next == null) //if at last place
					tail = prev;
			}
				
			prev = temp;
			temp = temp.next;
		}
		
	}
	
	public void search(int itemId){
		Node temp = head;
		while(temp != null){
			if(temp.itemId == itemId){
				temp.display();
				return;
			}
			temp = temp.next;
		}
		System.out.println("Cannot find the Item with Item Id : "+itemId);
	}
	
	public void search(String name){
		Node temp = head;
		while(temp != null){
			if(temp.name.equals(name)){
				temp.display();
				return;
			}
			temp = temp.next;
		}
		System.out.println("Cannot find the Item with name : "+name);
	}
	
	public void displayAll(){
		
		Node temp = head;
		
		while(temp != null){
			temp.display();
			System.out.println();
			temp = temp.next;
		}
	}
	
	public void updateQuantity(int itemId, int quantity){
		Node temp = head;
		
		while(temp != null){
			if(temp.itemId == itemId){
				temp.quantity = quantity;
				return;
			}
			temp = temp.next;
		}
		
		System.out.println("Can not find Item with item id : "+itemId);
	}
	
	public void totalValue(){
		Node temp = head;
		int sum = 0;
		while(temp != null){
			sum += temp.price*temp.quantity;
			temp = temp.next;
		}
		
		System.out.println("Total Inventory value is : "+sum);
	}
	
	public void sortName(){
		head = mergeSort(head);
		
	}
	
	private Node mergeSort(Node head){
		if(head == null || head.next == null)
			return head;
	
		Node mid = getMid(head);
		
		Node nextToMid = mid.next;
		mid.next = null;
		
		Node left = mergeSort(head);
		Node right = mergeSort(nextToMid);
		
		return merge(left, right);
	
	
	}
	private Node getMid(Node head){
		if(head == null || head.next == null)
			return head;
		
		Node temp1 = head;
		Node temp2 = head;
		while(temp1.next != null && temp1.next.next != null){
			temp1 = temp1.next.next;
			temp2 = temp2.next;
		}
		
		return temp2;
		
	}
	private Node merge(Node left, Node right){
		
		if(left == null) 
			return right;
		if(right == null) 
			return left;
	
		Node curr = new Node(1, "null", 2, 3);
		Node newHead = curr;
		
		while(left != null && right != null){
			if(left.name.compareTo(right.name) <= 0){
				curr.next = left;
				left = left.next;
			}
			else{
				curr.next = right;
				right = right.next;
			}
			curr = curr.next;
		}
	
		if(left != null)
			curr.next = left;
		if(right != null)
			curr.next = right;
		
		return newHead.next;
			
	}

	public static void main(String[] args){
		InventoryManagementSystem l1 = new InventoryManagementSystem();
		
		l1.addLast(10, "Maggi", 21, 230);
		l1.addLast(13, "Detergent", 22, 291);
		l1.addLast(16, "Football", 21, 932);
		l1.addLast(25, "Controller", 20, 500);
		
		l1.displayAll();
		
		l1.addFirst(5, "Zebronics Keyboard", 21, 1000);
		
		l1.addAt(8, "Horsh Shoe", 20, 300, 2);
		
		l1.displayAll();
		
		l1.search(13);
		
		l1.updateQuantity(25, 15);
		
		l1.displayAll();
		
		l1.delete(16);
		
		l1.displayAll();
		
		l1.sortName();
		
		l1.displayAll();
		
}

}