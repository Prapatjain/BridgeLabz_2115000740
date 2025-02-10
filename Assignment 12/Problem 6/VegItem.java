class VegItem extends FoodItem implements Discountable{
	
	double discount;
	
	VegItem(String itemName, int price, int quantity){
		super(itemName, price, quantity);
	}
	
	public void calculateTotalPrice(){
		System.out.println("Total Price is : "+(getPrice()-discount));
	
	}
	
	public void applyDiscount(){
		this.discount = 0.20*getPrice();
		System.out.println("Discount Applied");
	}

	public void getDiscountDetails(){
		System.out.println("Discount applied on this dish is : "+this.discount);
	}
	
	public void getItemDetails(){
		System.out.println("Veg Item name is : "+getItemName());
		System.out.println("Veg Item price is : "+getPrice());
		System.out.println("Veg Item quantity is : "+getQuantity());
	
	}
}