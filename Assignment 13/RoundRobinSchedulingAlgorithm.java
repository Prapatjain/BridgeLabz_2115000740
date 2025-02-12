class RoundRobinSchedulingAlgorithm{
	
	class Node{
	
		int processId;
		int burstTime;
		int priority;

		Node next;
	
		Node(int processId, int burstTime, int priority){
		
			this.processId = processId;
			this.burstTime = burstTime;
			this.priority = priority;
		
			this.next = this;
		}
		
		public void display(){
			System.out.println("Process Id is : "+this.processId);
			System.out.println("Process Burst Time is : "+this.burstTime);
			System.out.println("Process Priority is : "+this.priority);
			System.out.println();
		}
		

	}
	
	Node head;
	Node tail;
	int size;
	
	RoundRobinSchedulingAlgorithm(){
		this.head = null;
		this.tail = null;
		this.size = 0;
	}
	
	public void addLast(int processId, int burstTime, int priority){
		
		Node nn = new Node(processId, burstTime, priority);
		
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
	
	public void delete(int processId){
		//if at first place
		if(head.processId == processId){
			head = head.next;
			tail.next = head;
			return;
		}
		
		Node prev = null;
		Node temp = head;
		
		do{
			if(temp.processId == processId){
				prev.next = temp.next;
				if(temp.next == null) //if at last place
					tail = prev;
			}
				
			prev = temp;
			temp = temp.next;
		}while(temp != head);
		
	}
	
	public void displayAll(){
		
		Node temp = head;
		
		do{
			temp.display();
			temp = temp.next;
		}while(temp != head);
	}
	
	public void simulateRoundRobin(int timeQuantum){
		
		Node temp = head;
		int c = 1;
		int cycles = 1;
		int avgWaitingTime = 0;
		int avgTurnAroundTime = 0;
		while(c>0){
			c = 0;
			temp = head;
			System.out.println("Processes in cycle "+cycles+" are : ");
			System.out.println();
			do{
				if(temp.burstTime == 0){
					temp = temp.next;
				}
				else if(temp.burstTime <= timeQuantum){
					temp.burstTime = 0;
					temp.display();
					temp = temp.next;
					c = 1;
					//total execution time of all processes
					avgTurnAroundTime += timeQuantum;
				}
				else{
					temp.burstTime -= timeQuantum;
					temp.display();
					temp = temp.next;
					c = 1;
					//total execution time of all processes
					avgTurnAroundTime += timeQuantum;
				}
				
			}while(temp != head);
			
			if(c == 0){
				System.out.println("No more process are remaining to execute");
				System.out.println();
			}
			cycles++;
			
			
		}
		
		temp = head;
		int arrivalTime = 0;
		do{
			//total waiting time of all processes
			avgWaitingTime += arrivalTime*timeQuantum - arrivalTime;
			temp = temp.next;
			arrivalTime++;
			
		}while(temp != head);
		
		avgTurnAroundTime -= avgWaitingTime;
		
		avgTurnAroundTime = avgTurnAroundTime / this.size;
		avgWaitingTime = avgWaitingTime / this.size;
		
		System.out.println("Average Waiting time for all process is : "+avgWaitingTime);
		System.out.println("Average Turn-Around time for al process is : "+avgTurnAroundTime);
	}
	
	public static void main(String[] args){
		RoundRobinSchedulingAlgorithm cl1 = new RoundRobinSchedulingAlgorithm();
		
		cl1.addLast(5, 14, 4);
		cl1.addLast(10, 11, 3);
		cl1.addLast(15, 5, 6);
		cl1.addLast(19, 10, 2);
		cl1.addLast(12, 4, 1);
		
		cl1.displayAll();
		
		cl1.delete(12);
		
		cl1.displayAll();
		
		cl1.simulateRoundRobin(2);
		
	}
	
}