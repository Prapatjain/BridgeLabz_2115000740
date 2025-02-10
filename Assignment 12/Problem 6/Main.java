import java.util.*;
class Main{
	public static void main(String[] args){
		FoodItem vg1 = new VegItem("Matar Paneer", 250, 450);
		FoodItem nvg1 = new NonVegItem("Butter Chicken", 500, 500);
		
		List<FoodItem> l1 = new ArrayList<>();
		
		l1.add(vg1);
		l1.add(nvg1);
		
		for(int i=0;i<l1.size();i++){
			if(l1.get(i) instanceof VegItem){
			
				((VegItem)l1.get(i)).getItemDetails();
				((VegItem)l1.get(i)).applyDiscount();
				((VegItem)l1.get(i)).getDiscountDetails();
				((VegItem)l1.get(i)).calculateTotalPrice();
			}
			if(l1.get(i) instanceof NonVegItem){
			
				((NonVegItem)l1.get(i)).getItemDetails();
				((NonVegItem)l1.get(i)).applyDiscount();
				((NonVegItem)l1.get(i)).getDiscountDetails();
				((NonVegItem)l1.get(i)).calculateTotalPrice();
			}
			
		}
	
	}

}