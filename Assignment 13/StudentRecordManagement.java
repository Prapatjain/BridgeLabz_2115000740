class StudentRecordManagement{
	
	class Node{
	
		int rollNumber;
		String name;
		int age;
		String grade;
		
		Node next;
	
		Node(int rollNumber, String name, int age, String grade){
		
			this.rollNumber = rollNumber;
			this.name = name;
			this.age = age;
			this.grade = grade;
		
			this.next = null;
		}
		
		public void display(){
			System.out.println("Student Roll Number is : "+this.rollNumber);
			System.out.println("Student name is : "+this.name);
			System.out.println("Student age is : "+this.age);
			System.out.println("Student grade is : "+this.grade);
		}
		

	}
	
	Node head;
	Node tail;
	int size;
	
	StudentRecordManagement(){
		this.head = null;
		this.tail = null;
		this.size = 0;
	}
	
	public void addLast(int rollNumber, String name, int age, String grade){
		
		Node nn = new Node(rollNumber, name, age, grade);
		
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
	
	public void addFirst(int rollNumber, String name, int age, String grade){
		
		Node nn = new Node(rollNumber, name, age, grade);
		
		Node temp = head;	
		
		head = nn;
		head.next = temp;
		
		size++;
		
		System.out.println("Node is added at First");
	}
	
	public void addAt(int rollNumber, String name, int age, String grade, int place){
		
		if(place > (size+1) || place <= 0){
			System.out.println("Can not add at this position");
			return;
		}
		if(place == 1){
			addFirst(rollNumber, name, age, grade);
			return;
		}
		if(place == (size+1)){
			addLast(rollNumber, name, age, grade);
			return;
		}
		
		
		Node temp = head;
		int c = 1;
		while(c <= place && temp != null){
			if(c == (place-1)){
				Node nn = new Node(rollNumber, name, age, grade);
				nn.next = temp.next;
				temp.next = nn;
				System.out.println("Node has been added to the place "+place);
			}
			temp = temp.next;
			c++;
		}
		
	}
	
	public void delete(int rollNumber){
		//if at first place
		if(head.rollNumber == rollNumber){
			head = head.next;
			return;
		}
		
		Node prev = null;
		Node temp = head;
		
		while(temp != null){
			if(temp.rollNumber == rollNumber){
				prev.next = temp.next;
				if(temp.next == null) //if at last place
					tail = prev;
			}
				
			prev = temp;
			temp = temp.next;
		}
		
	}
	
	public void search(int rollNumber){
		Node temp = head;
		while(temp != null){
			if(temp.rollNumber == rollNumber){
				temp.display();
				return;
			}
			temp = temp.next;
		}
		System.out.println("Cannot find the student with Roll Number : "+rollNumber);
	}
	
	public void displayAll(){
		
		Node temp = head;
		
		while(temp != null){
			temp.display();
			System.out.println();
			temp = temp.next;
		}
	}
	
	public void updateGrade(int rollNumber, String grade){
		Node temp = head;
		
		while(temp != null){
			if(temp.rollNumber == rollNumber){
				temp.grade = grade;
				return;
			}
			temp = temp.next;
		}
		
		System.out.println("Can not find Student with Roll Number : "+rollNumber);
	}
	
	public static void main(String[] args){
		StudentRecordManagement l1 = new StudentRecordManagement();
		
		l1.addLast(52, "Prapat Jain", 21, "A");
		l1.addLast(13, "Aviral Jain", 22, "B");
		l1.addLast(16, "Nihit Jain", 21, "D");
		l1.addLast(25, "Sajal Saraf", 20, "C");
		
		l1.addFirst(5, "Naman Agarwal", 21, "O");
		
		l1.addAt(8, "Kushagra Gupta", 20, "C+", 2);
		
		l1.displayAll();
		
		l1.search(13);
		
		l1.updateGrade(25, "C+");
		
		l1.displayAll();
		
		l1.delete(16);
		
		l1.displayAll();
}
}