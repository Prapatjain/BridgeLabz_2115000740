class Magazine extends LibraryItem implements Reservable{
	private boolean reserved = true;
	
	Magazine(int itemId, String title, String author){
		super(itemId, title, author);
	}

	public String getLoanDuration(){
			return "7 days";
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
		System.out.println("Magazine Id is : "+getItemId());
		System.out.println("Title of this Magazine is : "+getTitle());
		System.out.println("Author of this Magazine is : "+getAuthor());
	}
	
	
}