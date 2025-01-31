public class Main {
    public static void main(String[] args) {
        System.out.println(" ");
        Employee E1 = new Employee("Prapat",1001,5000000);
        E1.displayDetails();
        E1.setSalary(6000000); // Set the new value to the particular field
        System.out.println("Updated salary: "+E1.getSalary()); // Extract the value of the particular field
        System.out.println(" ");


        Circle c1 = new Circle(10);
        c1.displayDetails();
        c1.setRadius(15); // Set the new value to the particular field
        System.out.println("Updated radius: "+c1.getRadius()); // Extract the value of the particular field
        System.out.println(" ");

        
        Book b1 = new Book("Mathematics", "RD Sharma", 500);
        b1.displayDetails();
        b1.setAuthor("R P Goyal"); // Set the new value to the particular field
        b1.setTitle("Physics"); 
        System.out.println("Author of book: "+b1.getAuthor()); // To get the particular field
        b1.displayDetails();        // TO get all the details
        System.out.println(" ");
    }
}
