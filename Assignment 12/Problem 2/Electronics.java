class Electronics extends Product implements Taxable{
	
	private double tax;
	private double discount;
	
	Electronics(int productId, String name, int price){
		super(productId, name, price);
	}
	
	public void calculateDiscount(){
		discount = 0.2*getPrice();
	}

	public void calculateTax(){
		tax = 0.1*getPrice();
	}
	
	public void getTaxDetails(){
		System.out.println("Tax on the Product is : "+tax);
	}
	
	public void getDiscountDetails(){
		System.out.println("Discount on the Product is : "+discount);
	}
	
	public void showFinalPrice(){
		System.out.println("Final Price of the Product is : "+(getPrice()+tax-discount));
	}
	
}