package Challenge01.src;
import Challenge01.src.domain.Product;

public class TechChallenge01 {
    public static void main(String[] args) {
        Product product = new Product();
        product.setName("Jack Daniels");
        product.setPrice(129.90);
        product.setQuantity(38);

        product.displayProductInfo();

        product.addedStock(10);// Add 10 units to stock
        product.displayProductInfo();

        product.removeStock(5);// Remove 5 units from stock
        product.displayProductInfo();

        product.getTotalPrice(); // Display the total price of the product
    }

}
