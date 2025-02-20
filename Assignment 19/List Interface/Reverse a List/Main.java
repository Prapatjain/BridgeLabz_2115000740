class Main{

	public static void main(String[] args){
	
		LinkedList l1 = new LinkedList();
		ArrayList l2 = new ArrayList();
		
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.add(5);
		
		l1.display();
		
		l1.reverse();
		
		l1.display();
		
		l2.add(1);
		l2.add(2);
		l2.add(3);
		l2.add(4);
		l2.add(5);
	
		l2.display();
		l2.reverse();
		l2.display();
	
	}
	

}