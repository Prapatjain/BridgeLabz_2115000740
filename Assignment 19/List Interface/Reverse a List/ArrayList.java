class ArrayList{

	int[] arr;
	int size;
	
	ArrayList(){
		arr = new int[4];
		this.size = 0;
	}

	public void add(int ele){
	
		if(size>=arr.length){
			int[] arr2 = new int[arr.length+arr.length/2];
			
			for(int i=0;i<arr.length;i++)
				arr2[i] = arr[i];
			arr = arr2;
		}
		
		arr[size++] = ele;
	
	}
	
	public void remove(int index){
		if(index >= size){
			System.out.println("Cannot remove element at given index");
			return;
		}
		
		for(int i=index+1;i<size;i++){
			arr[i-1] = arr[i];
		}
		size--;
	}
	
	public void display(){
	
		for(int i=0;i<size;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
	
	}
	
	public void reverse(){
		
		int i = 0, j = size-1;
		while(i<=j){
			
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		
	}

}