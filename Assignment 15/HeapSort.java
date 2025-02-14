import java.util.*;

class HeapSort{

		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			
			HeapSort salaryDemands = new HeapSort();
			for(int i=0;i<n;i++)
				salaryDemands.add(sc.nextInt());
				
			for(int i=0;i<n;i++)
				System.out.print(salaryDemands.remove()+" ");
		
		}

		private ArrayList<Integer> list;
		
		public HeapSort() {
			list=new ArrayList<>();
		}
		public void add(int item) {
			list.add(item);
			upheapify(list.size()-1);
		}
		private void upheapify(int ci) { 
			int pi=(ci-1)/2;
			if(list.get(pi)<list.get(ci)) {
				Swap(pi,ci);
				upheapify(pi);
			}
			
		}
		public void Swap(int pi,int ci) {
			int temp=list.get(pi);
			list.set(pi, list.get(ci));	
			list.set(ci, temp);
		}
		public int remove() {	
			int rv=list.get(0);
			Swap(0,list.size()-1);
			list.remove(list.size()-1);
			downheapify(0);
			return rv;
		}
		private void downheapify(int pi) {
			int lci=2*pi+1;
			int rci=2*pi+2;
			int maxi=pi;
			if(lci<list.size()&&list.get(lci)>list.get(maxi))
				maxi=lci;
			if(rci<list.size()&&list.get(rci)>list.get(maxi))
				maxi=rci;
			if(maxi!=pi) {
				Swap(pi,maxi);
				downheapify(maxi);
			}
		}
		public int get() {
			return list.get(0);
		}
		public void Display() {
			System.out.println(list);
		}

}