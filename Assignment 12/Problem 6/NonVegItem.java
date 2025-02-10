class NonVegItem extends FoodItem implements Discountable{
	
	double discount;
	
	NonVegItem(String itemName, int price, int quantity){
		super(itemName, price, quantity);
	}
	
	public void calculateTotalPrice(){
		System.out.println("Total Price is : "+(getPrice()-discount+0.05*getPrice()));
	
	}
	
	public void applyDiscount(){
		this.discount = 0.10*getPrice();
		System.out.println("Discount Applied");
	}

	public void getDiscountDetails(){
		System.out.println("Discount applied on this dish is : "+this.discount);
	}
	
	public void getItemDetails(){
		System.out.println("Non Veg Item name is : "+getItemName());
		System.out.println("Non Veg Item price is : "+getPrice());
		System.out.println("Non Veg Item quantity is : "+getQuantity());
	
	}
}