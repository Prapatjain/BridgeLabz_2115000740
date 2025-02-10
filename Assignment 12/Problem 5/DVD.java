class DVD extends LibraryItem implements Reservable{
	
	private boolean reserved = true;
	
	DVD(int itemId, String title, String author){
		super(itemId, title, author);
	}

	public String getLoanDuration(){
			return "8 days";
	}
	
	public void reserveItem(){
		if(checkAvailability()){
			System.out.println("Item reserved for "+getLoanDuration());
			this.reserved = false;
		}
		else
			System.out.println("Item is not Available yet");
	}
	
	public boolean checkAvailability(){
		return this.reserved;
	}
	
	public void getItemDetails(){
		System.out.println("DVD Id is : "+getItemId());
		System.out.println("Title of this DVD is : "+getTitle());
		System.out.println("Author of this DVD is : "+getAuthor());
	}
	
}