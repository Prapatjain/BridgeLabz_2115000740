public class Main {
    public static void main(String[] args) {
	
        Teacher teacher = new Teacher("Mr. Smith", 40, "Mathematics");
        Student student = new Student("Alice", 14, 9);
        Staff staff = new Staff("Mrs. Johnson", 35, "Administration");

        teacher.displayDetails();
        teacher.displayRole();

        System.out.println();

        student.displayDetails();
        student.displayRole();

        System.out.println();

        staff.displayDetails();
        staff.displayRole();
    }
}
