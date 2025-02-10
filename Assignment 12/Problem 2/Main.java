import java.util.*;
class Main{
	public static void main(String[] args){
		Product ec1 = new Electronics(4235, "Controller", 1000);
		
		Product c1 = new Clothing(2352, "T-Shirt", 500);
		
		Product g1 = new Groceries(6168, "Cup Set", 1500);
		
		List<Product> l1 = new ArrayList<>();
		
		l1.add(ec1);
		l1.add(c1);
		l1.add(g1);
		
		for(int i=0;i<l1.size();i++){
			l1.get(i).displayDetails();
			
			if(l1.get(i) instanceof Electronics){
				((Electronics)l1.get(i)).calculateTax();
				((Electronics)l1.get(i)).getTaxDetails();
				((Electronics)l1.get(i)).calculateDiscount();
				((Electronics)l1.get(i)).getDiscountDetails();
				((Electronics)l1.get(i)).showFinalPrice();
			}
			if(l1.get(i) instanceof Clothing){
				((Clothing)l1.get(i)).calculateTax();
				((Clothing)l1.get(i)).getTaxDetails();
				((Clothing)l1.get(i)).calculateDiscount();
				((Clothing)l1.get(i)).getDiscountDetails();
				((Clothing)l1.get(i)).showFinalPrice();
			}
			if(l1.get(i) instanceof Groceries){
				((Groceries)l1.get(i)).calculateTax();
				((Groceries)l1.get(i)).getTaxDetails();
				((Groceries)l1.get(i)).calculateDiscount();
				((Groceries)l1.get(i)).getDiscountDetails();
				((Groceries)l1.get(i)).showFinalPrice();
			}
			
		}
		
	}

}