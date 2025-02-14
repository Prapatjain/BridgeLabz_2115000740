import java.util.*;

class InsertionSort{

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] employeeIDs = new int[n];
		
		for(int i=0;i<n;i++)
			employeeIDs[i] = sc.nextInt();
		
		insertionSort(employeeIDs);
		
		for(int i=0;i<employeeIDs.length;i++)
			System.out.print(employeeIDs[i]+" ");
	}
	
	public static void insertionSort(int[] arr){
		
		for(int i=1;i<arr.length;i++){
			
			int temp = arr[i];
			int in = i-1;
			while(in >= 0 && arr[in]>temp){
				arr[in+1] = arr[in];
				in--;
			}
			arr[in+1] = temp;
		
		}
	
	
	}

}