public class Book {

    String title;
    String author;
    final long isbn;
    static String libraryName= "GLA Library";

    Book(String title, String author, long isbn){  //Parameterized constructor

        this.title=title;
        this.author=author;
        this.isbn = isbn;
    }
     static void displayLibraryName(){
        System.out.println("\nLibrary Name: "+Book.libraryName);
    }
    void displayDetails(Object b){ //instance of operator
        if(b instanceof Book){
            System.out.println("Title of the book: "+title);
            System.out.println("Author of the book: "+author);
            System.out.println("ISBN Number of book: "+isbn);
        }
        else{
            System.out.println("Not an instance of the Book class.");
        }
    }
}
