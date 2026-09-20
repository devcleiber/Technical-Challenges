package Challenge01.src.domain;

public class Product {
    private String name;
    private double price;
    private int quantity;


    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price){
        this.price = price;
        if (price < 0){
            System.out.println("Price's be dont negative");}
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
        if (quantity < 0) {
            System.out.println("Quantity wont's be negative"); }
    }
    public void displayProductInfo() {
        System.out.println("Product Name: " + getName());
        System.out.println("Price: $" + getPrice());
        System.out.println("Quantity: " + getQuantity());
    }
    public void addedStock(int additional){
        if (additional > 0) {
            quantity += additional;
            System.out.println("Added " + additional + " units to stock.");
        } else {
            System.out.println("Invalid quantity to add.");
        }
    }
    public void removeStock(int remove){
        if (remove > 0) {
            if (remove <= quantity) {
                quantity -= remove;
                System.out.println("Removed " + remove + " units from stock.");
            } else {
                System.out.println("Not enough units in stock.");
            }
        } else {
            System.out.println("Invalid quantity to remove.");
        }
    }
    public double getTotalPrice() {
        return price * quantity;
    }


    //public void CreateProduct(){
        // Implement the logic to register a product }//
}

