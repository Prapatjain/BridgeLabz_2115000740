public class Main {

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("Rishabh",134552);
        BankAccount.getTotalAccounts();
        b1.displayDetails(b1);

        Book bk1 = new Book("Selina", "RP Goyal",   2147483648l);
        Book.displayLibraryName();
        bk1.displayDetails(bk1);
        Book.libraryName = "SDS Library"; // change the library name(static value)
        Book.displayLibraryName();
        bk1.displayDetails(bk1);

        Employee e1 = new Employee("Prapat", 1001, "Software Developer");
        Employee.displayTotalEmployees();
        e1.displayDetails(e1);


        Product p1 = new Product("Maggi", 12, 50, 756);
        Product p2 = new Product("chips", 10, 45, 435);
        p1.displayDetails(p1);
        p2.updateDiscount(25);
        p2.displayDetails(p2);

        Student s1 = new Student("Prapat ", 52, "A");
        Student s2 = new Student("Aviral", 12, "B");
        s1.displayDetails(s1);
        s1.displayTotalStudents(s1);
        s2.displayDetails(s2);
        s2.displayTotalStudents(s2);

        Vehicle v1 = new Vehicle("Prapat", "4 wheeler", 4235);
        Vehicle v2 = new Vehicle("Aviral", "2 wheeler", 3423);
        v1.displayDetails(v1);
        v1.updateRegistrationFee(2000);
        v2.displayDetails(v2);

        Patient pa1 = new Patient("Prapat", 21, "Headache", 1234);
        Patient pa2 = new Patient("Aviral", 18, "Colds and Flu", 4352);
        pa1.displayDetails(pa1);
        pa1.getTotalPatients(pa1);
        pa2.displayDetails(pa2);
    }
}
