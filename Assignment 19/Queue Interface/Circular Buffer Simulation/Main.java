class Main{

	public static void main(String[] args){
	
		CircularBuffer cb = new CircularBuffer(5);
		
		cb.add(1);
		cb.add(2);
		cb.add(3);
		cb.add(4);
		cb.add(5);
		cb.add(6);
		
		cb.display();
		
		System.out.println(cb.peek());
		
		System.out.println(cb.poll());
		
		cb.display();

	}

}