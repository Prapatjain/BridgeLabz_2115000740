class Main{


	public static void main(String[] args){
	
		Stack st = new Stack();
		
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		
		System.out.println(st.top());
		
		st.display();
		
		System.out.println(st.pop());
	
		st.display();
		
		
	}


}