import java.util.*;
class MovieManagementSystem{
	
	class Node{
	
		String title;
		String director;
		int yearOfRelease;
		double rating;
		
		Node next;
		Node prev;
	
		Node(String title, String director, int yearOfRelease, double rating){
		
			this.title = title;
			this.director = director;
			this.yearOfRelease = yearOfRelease;
			this.rating = rating;
		
			this.next = null;
			this.prev= null;
		}
		
		public void display(){
			System.out.println("Movie Title is : "+this.title);
			System.out.println("Movie Director is : "+this.director);
			System.out.println("Movie year of release is : "+this.yearOfRelease);
			System.out.println("Movie Rating is : "+this.rating);
		}
		

	}
	
	Node head;
	Node tail;
	int size;
	
	MovieManagementSystem(){
		this.head = null;
		this.tail = null;
		this.size = 0;
	}
	
	public void addLast(String title, String director, int yearOfRelease, double rating){
		
		Node nn = new Node(title, director, yearOfRelease, rating);
		
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
	
	public void addFirst(String title, String director, int yearOfRelease, double rating){
		
		Node nn = new Node(title, director, yearOfRelease, rating);
		
		Node temp = head;	
		
		head = nn;
		head.next = temp;
		temp.prev = head;
		
		size++;
		
		System.out.println("Node is added at First");
	}
	
	public void addAt(String title, String director, int yearOfRelease, double rating, int place){
		
		if(place > (size+1) || place <= 0){
			System.out.println("Can not add at this position");
			return;
		}
		if(place == 1){
			addFirst(title, director, yearOfRelease, rating);
			return;
		}
		if(place == (size+1)){
			addLast(title, director, yearOfRelease, rating);
			return;
		}
		
		
		Node temp = head;
		int c = 1;
		while(c <= place && temp != null){
			if(c == (place-1)){
				Node nn = new Node(title, director, yearOfRelease, rating);
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
	
	public void delete(String title){
		//if at first place
		if(head.title.equals(title)){
			head = head.next;
			head.prev = null;
			return;
		}
		
		Node prev = null;
		Node temp = head;
		
		while(temp != null){
			if(temp.title.equals(title)){
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
	
	public void search(String director){
		Node temp = head;
		boolean found = false;
		while(temp != null){
			if(temp.director.equals(director)){
				temp.display();
				found = true;
			}
			temp = temp.next;
		}
		if(!found)
			System.out.println("Cannot find the Movie with Director : "+director);
	}
	
	public void search(double rating){
		Node temp = head;
		boolean found = false;
		while(temp != null){
			if(temp.rating == rating){
				temp.display();
				found = true;
			}
			temp = temp.next;
		}
		if(!found)
			System.out.println("Cannot find the Movie with Rating : "+rating);
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
	
	public void updateRating(String title, double rating){
		Node temp = head;
		
		while(temp != null){
			if(temp.title.equals(title)){
				temp.rating = rating;
				return;
			}
			temp = temp.next;
		}
		
		System.out.println("Can not find Movie with title : "+title);
	}

	public static void main(String[] args){
		MovieManagementSystem dl1 = new MovieManagementSystem();
		
		dl1.addLast("Once Upon a Time... in Hollywood", "Quentin Tarantino", 2019, 7.6);
		dl1.addLast("The Trauma Code: Heroes on Call", "Lee Do-yoon", 2025, 8.5);
		dl1.addLast("Black Swan", "Darren Afronofsky", 2010, 8.0);
		dl1.addLast("The Martian", "Ridley Scott", 2015, 8.0);
		
		dl1.displayAll();
		
		dl1.addFirst("Black Panther : Wakanda Forever", "Ryan Coogler", 2022, 6.7);
		
		dl1.displayAll();
		
		dl1.search("Darren Afronofsky");
		
		dl1.search(8.0);
		
		dl1.delete("Black Swan");
		
		dl1.updateRating("The Martian", 8.5);
		
		dl1.displayAll();
		
		dl1.addAt("Jaani Dushman", "Ritik Tyagi", 2015, 4.5, 4);
		
		dl1.displayAll();
		
		dl1.displayAllReverse();
		
	} 
	
}