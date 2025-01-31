public class Book {
    private String title;
    private String author;
    private double price;
    Book(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public void setTitle(String title)
    {
        this.title = title;
    }
    public void setAuthor(String author)
    {
        this.author = author;
    }
    public void setPrice(double price)
    {
        this.price = price;
    }

    public String getTitle()
    {
        return this.title;
    }
    public String getAuthor(){
        return this.author;
    }
    public double getPrice(){
        return this.price;
    }
    void displayDetails(){
        System.out.println("Title of the Book: "+title);
        System.out.println("Author of the Book: "+author);
        System.out.println("Price of the Book: "+price);
    }
}
