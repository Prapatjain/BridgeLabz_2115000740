import java.util.*;
class OnlineTicketReservationSystem{
	
	class Node{
		String customerName;
		String movieName;
		String seatNumber;
		int ticketId;
		int bookingTime;
		
		Node next;
	
		Node(String customerName, String movieName, String seatNumber, int ticketId, int bookingTime){
			this.customerName = customerName;
			this.movieName = movieName;
			this.seatNumber = seatNumber;
			this.ticketId = ticketId;
			this.bookingTime = bookingTime;
			this.next = this;
		}
		
		public void display(){
			System.out.println("Customer Name is : "+this.customerName);
			System.out.println("Movie Name is : "+this.movieName);
			System.out.println("Seat Number is : "+this.seatNumber);
			System.out.println("Ticket Id is : "+this.ticketId);
			System.out.println("Booking time is : "+this.bookingTime);
		}
	}
	
	int size;
	Node head;
	Node tail;
	
	OnlineTicketReservationSystem(){
		this.size = 0;
		this.head = null;
		this.tail = null;
	}
	
	public void calculateTotalTickets(){
		System.out.println("Total number of tickets are : "+this.size);
	}
	
	public void displayAll(){
		if(head == null) return;
		Node temp = head;
		do{
			temp.display();
			System.out.println();
			temp = temp.next;
		}while(temp != head);
	}
	
	public void search(String str){
		Node temp = head;
		boolean found = false;
		if(head == null) return;
		do{
			if(temp.customerName.equals(str) || temp.movieName.equals(str)){
				temp.display();
				found = true;
			}
			temp = temp.next;
		}while(temp != head);
		if(!found)
			System.out.println("Cannot find the Ticket with given Details: ");
	}
	
	public void delete(int ticketId){
		if(head == null) return;
		if(head.ticketId == ticketId){
			if(head == tail){
				head = null;
				tail = null;
			} else {
				head = head.next;
				tail.next = head;
			}
			size--;
			return;
		}
		Node prev = head;
		Node temp = head.next;
		do{
			if(temp.ticketId == ticketId){
				prev.next = temp.next;
				if(temp == tail)
					tail = prev;
				size--;
				return;
			}
			prev = temp;
			temp = temp.next;
		}while(temp != head);
	}
	
	public void addLast(String customerName, String movieName, String seatNumber, int ticketId, int bookingTime){
		Node nn = new Node(customerName, movieName, seatNumber, ticketId, bookingTime);
		if(tail == null)
			tail = nn;
		else{
			tail.next = nn;
			tail = nn;
		}
		if(head == null)
			head = nn;
		tail.next = head;
		size++;
		System.out.println("Node is added at Last");
	}

	public static void main(String[] args){
		
		OnlineTicketReservationSystem cl1 = new OnlineTicketReservationSystem();
		
		cl1.addLast( "Prapat Jain", "Guide", "B25",3244, 12);
		cl1.addLast("Naman Agarwal", "Guide", "D03",5323, 12);
		cl1.addLast( "Kushagra Sharma", "Krish 3", "A18", 8593,3);
		//cl1.addLast(0832, "Vedansh Gautam", "Fast And Furious", "C34", 6);
		cl1.addLast( "Nihit Jain", "Black Panther", "D04",1236, 9);
		
		cl1.displayAll();
		
		cl1.calculateTotalTickets();
		
		cl1.delete(8593);
		
		cl1.calculateTotalTickets();
		
		cl1.displayAll();
		
		cl1.search("Guide");
	}

}
