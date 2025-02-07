public class Main {
    public static void main(String[] args) {
       
        Chef chef = new Chef("Gordon Ramsay", 101, "Italian Cuisine");
        Waiter waiter = new Waiter("John Doe", 202, 5);

       
        chef.displayDetails();
        chef.performDuties();

        System.out.println();

        waiter.displayDetails();
        waiter.performDuties();
    }
}
