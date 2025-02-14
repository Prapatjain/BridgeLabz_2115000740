import java.util.*;
class BubbleSort{
	
		public static void main(String[] args){
			
			Scanner sc = new Scanner(System.in);
			
			int n = sc.nextInt();
			int[] studentMarks = new int[n];
			
			for(int i=0;i<studentMarks.length;i++)
				studentMarks[i] = sc.nextInt();
			
			bubbleSort(studentMarks);
			
			for(int i=0;i<studentMarks.length;i++)
				System.out.print(studentMarks[i]+" ");
		}
		
		public static void bubbleSort(int[] arr){
		
			for(int i=0;i<arr.length;i++){
				boolean swaps = false;
				
				for(int j=1;j<arr.length;j++){
					if(arr[j] < arr[j-1]){
						int temp = arr[j];
						arr[j] = arr[j-1];
						arr[j-1] = temp;
						swaps = true;
					}
				
				}
				if(!swaps)
					break;	
			}
			
		}


}