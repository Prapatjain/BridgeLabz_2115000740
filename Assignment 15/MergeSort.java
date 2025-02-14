import java.util.*;

class MergeSort{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] bookPrices = new int[n];
		
		for(int i=0;i<n;i++)
			bookPrices[i] = sc.nextInt();
		
		mergeSort(bookPrices, 0, bookPrices.length-1);
		
		for(int i=0;i<n;i++)
			System.out.print(bookPrices[i]+" ");
	}
	
	public static void mergeSort(int[] arr, int left, int right){
		if(left>=right)
			return;
			
		int mid = (left+right)/2;
			
		mergeSort(arr, left, mid);
		mergeSort(arr, mid+1, right);
			
		merge(arr, left, mid, right);
	}
	
	public static void merge(int[] arr, int left, int mid, int right){
		
		int[] l = new int[mid-left+1];
		int[] r = new int[right-mid];

		int inL = 0;
		int inR = 0;
		
		for(int i=left;i<=mid;i++)
			l[inL++] = arr[i];
			
		for(int i=mid+1;i<=right;i++)
			r[inR++] = arr[i];
			
		inL = 0;
		inR = 0;
		int in = left;
		
		while(inL<l.length && inR<r.length){
			if(l[inL] <= r[inR])
				arr[in++] = l[inL++];
			else
				arr[in++] = r[inR++];
			
		}
		
		while(inL<l.length)
			arr[in++] = l[inL++];
		while(inR<r.length)
			arr[in++] = r[inR++];
		
		
	
	}


}