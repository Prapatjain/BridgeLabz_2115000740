import java.util.*;

class CircularBuffer{

	int[] arr;
	int in;
	int size;
	
	CircularBuffer(int size){
	
		arr = new int[size];
		in = 0;
		size = 0;
		
	}
	
	public void add(int ele){
	
		arr[in] = ele;
		in = (in+1)%arr.length;
		
		if(size < arr.length)
			size++;
	
	}
	
	public int peek(){
		
		return arr[0];
	
	}
	
	public int poll(){
	
		if(size == 0){
			System.out.println("Cannot get element as queue is empty");
			return -1;
		}
		
		int ele = arr[0];
		
		for(int i=1;i<size;i++)
			arr[i-1] = arr[i];
		
		size--;
		return ele;
		
	}
	
	public void display(){
		
		for(int i=0;i<size;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}


}