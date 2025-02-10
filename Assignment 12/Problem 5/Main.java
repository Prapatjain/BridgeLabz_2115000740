import java.util.*;
class Main{
	public static void main(String[] args){
		LibraryItem b1 = new Book(2839, "Lord Of The Rings", "John Ronald");
		
		LibraryItem m1 = new Magazine(8593, "New York Fashion", "Mark Clifton");
		
		LibraryItem d1 = new DVD(4891, "The Man Of Steel", "Howard Christan");
		
		List<LibraryItem> l1 = new ArrayList<>();
		
		l1.add(b1);
		l1.add(m1);
		l1.add(d1);
		
		for(int i=0;i<l1.size();i++){
			
			if(l1.get(i) instanceof Book){
				((Book)l1.get(i)).getItemDetails();
				((Book)l1.get(i)).getLoanDuration();
				((Book)l1.get(i)).reserveItem();
			}
			if(l1.get(i) instanceof Magazine){
				((Magazine)l1.get(i)).getItemDetails();
				((Magazine)l1.get(i)).getLoanDuration();
				((Magazine)l1.get(i)).reserveItem();
			}
			if(l1.get(i) instanceof DVD){
				((DVD)l1.get(i)).getItemDetails();
				((DVD)l1.get(i)).getLoanDuration();
				((DVD)l1.get(i)).reserveItem();
			}
		}
	}
	
}