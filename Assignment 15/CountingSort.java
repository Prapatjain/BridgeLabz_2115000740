import java.util.*;

class CountingSort{

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] studentAges = new int[n];
		
		for(int i=0;i<n;i++)
			studentAges[i] = sc.nextInt();	
		
		countingSort(studentAges);
		
		for(int i=0;i<n;i++)
			System.out.print(studentAges[i]+" ");
	}
	
	public static void countingSort(int[] arr){
		
		int max = Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++)
			max = Math.max(max, arr[i]);
		
		int[] freq = new int[max+1];
		
		for(int i=0;i<arr.length;i++)
			freq[arr[i]]++;
		
		int in = 0;
		
		for(int i=0;i<freq.length;i++){
			while(freq[i]-- > 0)
				arr[in++] = i;
		
		}
		
		
		
	}
}