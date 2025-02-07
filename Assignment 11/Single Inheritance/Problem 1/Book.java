
public class Book {
    String title;
    int publicationYear;
    Book(String title, int publicationYear){
        this.title =title;
        this.publicationYear = publicationYear;
    }
    void displayInfo(){
        System.out.println("title of the Book= "+title);
        System.out.println("Publication Year= "+publicationYear);
    }
}
