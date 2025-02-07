
public class Main {
    public static void main(String[] args) {
        System.out.println(" ");
        Developer d = new Developer("Prapat", 1001, 1500000, "java");
        d.displayDetails();
        Manager m = new Manager("amit", 5005, 4560000);
        m.displayDetails();
        Intern i =new Intern("Vinita", 3003, 120000);
        i.displayDetails();
    }
}
