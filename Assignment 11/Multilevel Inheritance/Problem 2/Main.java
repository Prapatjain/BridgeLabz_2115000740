

public class Main {
    public static void main(String[] args) {
        System.out.println(" ");
        Course c= new Course("Biology", 3.5);
        c.display();
        OnlineCourse oc = new OnlineCourse("Physics", 2.5, "Coursera", true);
        oc.display();
        PaidOnlineCourse pd = new PaidOnlineCourse("Math", 4.5, "Udemy", true, 1000, 100);
        pd.display();
    }
}
