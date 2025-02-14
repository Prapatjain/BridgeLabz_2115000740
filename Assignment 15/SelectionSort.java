import java.util.*;

class SelectionSort{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int examScores[] = new int[n];
		
		for(int i=0;i<n;i++)
			examScores[i] = sc.nextInt();
		
		selectionSort(examScores);
		
		for(int i=0;i<n;i++)
			System.out.print(examScores[i]+" ");
	
	}
	
	public static void selectionSort(int[] arr){
	
		for(int i=0;i<arr.length;i++){
			int minEle = arr[i];
			int in = -1;
			
			for(int j=i+1;j<arr.length;j++){
				if(minEle > arr[j]){
					minEle = arr[j];
					in = j;
				}
			
			}
			
			if(in == -1)
				continue;
				
			int temp = arr[i];
			arr[i] = arr[in];
			arr[in] = temp;
		
		}
	
	}
	
}