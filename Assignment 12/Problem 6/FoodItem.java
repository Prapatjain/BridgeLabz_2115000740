abstract class FoodItem{
	private String itemName;
	private int price;
	private int quantity;
	
	FoodItem(String itemName, int price, int quantity){
		this.itemName = itemName;
		this.price = price;
		this.quantity = quantity;
	}
	
	abstract void calculateTotalPrice();
	
	public void getItemDetails(){
		System.out.println("Food item name is : "+this.itemName);
		System.out.println("Food item price is : "+this.price);
		System.out.println("Food item quantity is : "+this.quantity);
	
	}
	
	public void setItemName(String name){
		this.itemName = name;
	}
	
	public void setPrice(int price){
		this.price = price;
	}
	
	public void setQuantity(int quantity){
		this.quantity = quantity;
	}
	
	public String getItemName(){
		return this.itemName;
	}
	
	public int getPrice(){
		return this.price;
	}
	
	public int getQuantity(){
		return this.quantity;
	}
	

}