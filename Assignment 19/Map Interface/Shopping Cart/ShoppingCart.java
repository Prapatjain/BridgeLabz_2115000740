import java.util.*;

public class ShoppingCart {
    HashMap<String, Integer> productPrices;
    LinkedHashMap<String, Integer> orderedItems;
    TreeMap<Integer, String> sortedByPrice;

    ShoppingCart() {
        this.productPrices = new HashMap<>();
        this.orderedItems = new LinkedHashMap<>();
        this.sortedByPrice = new TreeMap<>();
    }

    public void addProduct(String product, int price) {
        productPrices.put(product, price);
        orderedItems.put(product, price);
        sortedByPrice.put(price, product);
    }

    public void displayByPrice() {
        System.out.println("Products sorted by price:");
        for (Map.Entry<Integer, String> entry : sortedByPrice.entrySet()) {
            System.out.println(entry.getValue() + " - $" + entry.getKey());
        }
    }
}
