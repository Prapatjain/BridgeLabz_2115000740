import java.util.*;
public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int productPrices[]= new int[n];
		for(int i=0;i<n;i++)
			productPrices[i] = sc.nextInt();
		quicksort(productPrices,0,productPrices.length-1);
		for(int i=0;i<productPrices.length;i++)
			System.out.print(productPrices[i]+" ");
	}
	public static void quicksort(int[]arr,int lo,int hi) {
		if(lo>=hi) {
			return;
		}
		int idx=index(arr,lo,hi);
		quicksort(arr,lo,idx-1);
		quicksort(arr,idx+1,hi);
	}
	public static int index(int[] arr,int lo,int hi) {	
		int last_element=arr[hi];	
		int idx=lo;
		for(int i=lo;i<hi;i++) {
			if(arr[i]<=arr[hi]) {
				int temp=arr[i];
				arr[i]=arr[idx];
				arr[idx]=temp;
				idx++;
			}
		}
		int temp=arr[idx];
		arr[idx]=arr[hi];
		arr[hi]=temp;
		return idx;
	}
}