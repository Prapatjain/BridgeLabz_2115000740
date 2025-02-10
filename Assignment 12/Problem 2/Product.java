abstract class Product{
	private int productId;
	private String name;
	private int price;
	
	Product(int productId, String name, int price){
			this.productId = productId;
			this.name = name;
			this.price = price;
		
	}
	
	abstract void calculateDiscount();
	
	public void displayDetails(){
		System.out.println("Product name is : "+name);
		System.out.println("Product id is : "+productId);
		System.out.println("Product price is :"+price);
	}
	
	void setName(String name){
		this.name = name;
	}
	
	void setPrice(int price){
		this.price = price;
	}
	
	String getName(){
		return name;
	}
	
	int getPrice(){
		return price;
	}
	
	int getProductId(){
		return productId;
	}
	
}