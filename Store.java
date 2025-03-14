import java.util.ArrayList;
import java.util.List;

class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Price: $" + price + ", Quantity: " + quantity;
    }
}

class RetailStore {
    private List<Product> products;

    public RetailStore() {
        this.products = new ArrayList<>();
    }

    
    public void addProduct(Product product) {
        products.add(product);
    }

   
    public void removeProduct(String productName) {
        Product productToRemove = null;
        for (Product product : products) {
            if (product.getName().equals(productName)) {
                productToRemove = product;
                break;
            }
        }

        if (productToRemove != null) {
            products.remove(productToRemove);
            System.out.println(productName + " has been removed from the store.");
        } else {
            System.out.println("Product with name " + productName + " not found.");
        }
    }

    
    public void editProduct(String productName, String newName, Double newPrice, Integer newQuantity) {
        for (Product product : products) {
            if (product.getName().equals(productName)) {
                if (newName != null) {
                    product.setName(newName);
                }
                if (newPrice != null) {
                    product.setPrice(newPrice);
                }
                if (newQuantity != null) {
                    product.setQuantity(newQuantity);
                }
                System.out.println(productName + " has been updated.");
                return;
            }
        }
        System.out.println("Product with name " + productName + " not found.");
    }

   
    public void displayProducts() {
        if (products.isEmpty()) {
            System.out.println("No products available.");
        } else {
            for (Product product : products) {
                System.out.println(product);
            }
        }
    }
}

public class Store {
    public static void main(String[] args) {
        RetailStore store = new RetailStore();

        
        Product product1 = new Product("Apple", 1.2, 50);
        Product product2 = new Product("Carrot", 0.5, 100);
        Product product3 = new Product("Milk", 1.5, 30);

        store.addProduct(product1);
        store.addProduct(product2);
        store.addProduct(product3);

        
        store.displayProducts();

       
        store.editProduct("Carrot", null, 0.6, 120);

        
        store.displayProducts();

        
        store.removeProduct("Milk");

        
        store.displayProducts();
    }
}
