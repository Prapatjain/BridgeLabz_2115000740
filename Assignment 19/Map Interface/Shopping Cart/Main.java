public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addProduct("Laptop", 1000);
        cart.addProduct("Mouse", 50);
        cart.addProduct("Keyboard", 80);
        cart.addProduct("Monitor", 300);
        cart.addProduct("Headphones", 120);

        System.out.println("Products sorted by price:");
        cart.displayByPrice();
    }
}
