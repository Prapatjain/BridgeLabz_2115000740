abstract class LibraryItem{
	private int itemId;
	private String title;
	private String author;
	
	LibraryItem(int itemId, String title, String author){
		this.itemId = itemId;
		this.title = title;
		this.author = author;
	}
	
	abstract String getLoanDuration();

	public void getItemDetails(){
		System.out.println("Item Id is : "+itemId);
		System.out.println("Title of this LibraryItem is : "+title);
		System.out.println("Author of this LibraryItem is : "+author);
	}
	
	void setTitle(String title){
		this.title = title;
	}
	
	void setAuthor(String author){
		this.author = author;
	}
	
	int getItemId(){
		return this.itemId;
	}
	
	String getTitle(){
		return this.title;
	}
	
	String getAuthor(){
		return this.author;
	}
	
}