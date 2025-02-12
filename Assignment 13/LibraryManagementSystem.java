import java.util.*;
class LibraryManagementSystem{
	
	class Node{
	
		String title;
		String author;
		String genre;
		int bookId;
		boolean availabilityStatus;
		
		Node next;
		Node prev;
	
		Node(String title, String author, String genre, int bookId){
		
			this.title = title;
			this.author = author;
			this.genre = genre;
			this.bookId = bookId;
		
			this.availabilityStatus = true;
			this.next = null;
			this.prev= null;
		}
		
		public void display(){
			System.out.println("Book Title is : "+this.title);
			System.out.println("Book Author is : "+this.author);
			System.out.println("Book Genre is : "+this.genre);
			System.out.println("Book Id is : "+this.bookId);
			System.out.println("Availability of Book is : "+this.availabilityStatus);
		}
		

	}
	
	Node head;
	Node tail;
	int size;
	
	LibraryManagementSystem(){
		this.head = null;
		this.tail = null;
		this.size = 0;
	}
	
	public void addLast(String title, String author, String genre, int bookId){
		
		Node nn = new Node(title, author, genre, bookId);
		
		if(tail == null)
			tail = nn;
		else{
			tail.next = nn;
			nn.prev = tail;
			tail = nn;
		}
		
		if(head == null)
			head = nn;
		
		size++;
		
		System.out.println("Node is added at Last");
	}
	
	public void addFirst(String title, String author, String genre, int bookId){
		
		Node nn = new Node(title, author, genre, bookId);
		
		Node temp = head;	
		
		head = nn;
		head.next = temp;
		temp.prev = head;
		
		size++;
		
		System.out.println("Node is added at First");
	}
	
	public void addAt(String title, String author, String genre, int bookId, int place){
		
		if(place > (size+1) || place <= 0){
			System.out.println("Can not add at this position");
			return;
		}
		if(place == 1){
			addFirst(title, author, genre, bookId);
			return;
		}
		if(place == (size+1)){
			addLast(title, author, genre, bookId);
			return;
		}
		
		
		Node temp = head;
		int c = 1;
		while(c <= place && temp != null){
			if(c == (place-1)){
				Node nn = new Node(title, author, genre, bookId);
				nn.next = temp.next;
				temp.next.prev = nn;
				temp.next = nn;
				nn.prev = temp;
				System.out.println("Node has been added to the place "+place);
			}
			temp = temp.next;
			c++;
		}
		size++;
		
	}
	
	public void delete(int bookId){
		//if at first place
		if(head.bookId == bookId){
			head = head.next;
			head.prev = null;
			size--;
			return;
		}
		
		Node prev = null;
		Node temp = head;
		
		while(temp != null){
			if(temp.bookId == bookId){
				prev.next = temp.next;
				if(temp.next == null) //if at last place
					tail = prev;
				if(temp.next != null)
					temp.next.prev = prev; //updating the previous of temp.next
				size--;
				return;
			}
				
			prev = temp;
			temp = temp.next;
		}
		System.out.println("Cannot find the Book with book Id : "+bookId);
		
	}
	
	public void search(String match){
		Node temp = head;
		boolean found = false;
		while(temp != null){
		//continue
			if(temp.title.equals(match) || temp.author.equals(match)){
				temp.display();
				found = true;
			}
			temp = temp.next;
		}
		if(!found)
			System.out.println("Cannot find the Book with the given input");
	}
	
	
	public void displayAll(){
		
		Node temp = head;
		
		while(temp != null){
			temp.display();
			System.out.println();
			temp = temp.next;
		}
	}
	
	public void displayAllReverse(){
		
		Node temp = tail;
		
		while(temp != null){
			temp.display();
			System.out.println();
			temp = temp.prev;
		}
		
	}
	
	public void updateAvailability(String title, boolean availabilityStatus){
		Node temp = head;
		
		while(temp != null){
			if(temp.title.equals(title)){
				temp.availabilityStatus = availabilityStatus;
				return;
			}
			temp = temp.next;
		}
		
		System.out.println("Can not find Book with title : "+title);
	}
	
	public void countBooks(){
		System.out.println("The number of Books in the library are : "+this.size);
	}

	public static void main(String[] args){
		LibraryManagementSystem dl1 = new LibraryManagementSystem();
		
		dl1.addLast("Arthashastra", "Kautilya", "politics", 324);
		dl1.addLast("Geeta Rahasya", "Bal Gangadhar", "Life Lessons", 542);
		dl1.addLast("Alice in Wonderland", "Lewis Carroll", "Fairy Tale", 165);
		dl1.addLast("Pride and Prejudice", "Jane Austen", "Love Story", 447);
		
		dl1.displayAll();
		
		dl1.addFirst("Frankenstein", "Mary Sheley", "Tragedy", 113);
		
		dl1.displayAll();
		
		dl1.search("Geeta Rahasya");
		
		dl1.search("Jane Austen");
		
		dl1.delete(165);
		
		dl1.updateAvailability("Frankenstein", false);
		
		dl1.displayAll();
		
		dl1.addAt("Don Quixote", "Miguel de Cervantes", "Suspense Thriller", 876, 4);
		
		dl1.displayAll();
		
		dl1.displayAllReverse();
		
		dl1.countBooks();
		
	} 
	
}