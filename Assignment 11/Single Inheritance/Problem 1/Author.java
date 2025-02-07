
public class Author extends Book{
    String name;
    String bio;
    Author(String title, int publicationYear, String name, String bio){
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }
    void displayInfo(){
        super.displayInfo();
        System.out.println("name of the author= "+name);
        System.out.println("Description= "+bio);
    }
}
