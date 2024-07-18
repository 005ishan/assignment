package Assignment;
import java.util.ArrayList;


/*3.	Create a ShoppingCart class to simulate an online shopping cart. 
The class should have the following attributes: cart ID, customer name, and items (a list of products). 
Include methods to addltem(), removeltem(), and calculateTotal(). 
Implement functionality to create new shopping carts, add/remove items, and calculate the total cost of items in the cart.*/
public class task3 {
    public static void main(String[] args) {
        ShoppingCart sc = new ShoppingCart();
        sc.cartID=101;
        sc.customerName="Ram";
        Product p1 = new Product("Water", 20, 5);
        Product p2 = new Product("Lays", 100, 15);
        Product p3 = new Product("Oreo", 30, 30);
        sc.addItem(p1);
        sc.addItem(p2);
        sc.addItem(p3);
        sc.removeItem(p3);
        sc.cartDetails();
        System.out.println("The total price of:\n"+p1.productName+","+p2.productName+" is "+sc.calculateTotal());
        
    }
}

class Product{
    String productName;
    double priceperUnit;
    int quantity;

    public Product(String productName, double priceperUnit, int quantity){
        this.productName=productName;
        this.priceperUnit=priceperUnit;
        this.quantity=quantity;
    }
}
class ShoppingCart{
    public int cartID;
    public String customerName;
    ArrayList<Product> items = new ArrayList<>();

   
        
    public void addItem(Product product){
        items.add(product);
    }
    public void removeItem(Product product){
        items.remove(product);
    }
    void cartDetails() {
        System.out.println("Cart ID: " + cartID);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Items in the cart: ");
        for (Product item : items) {
            System.out.println("Product Name: " + item.productName +", Quantity: "+item.quantity+", Price per Unit: " + item.priceperUnit);
        }
    }
    double calculateTotal(){
        double Total=0;
        for (Product item : items) {
            Total += item.priceperUnit*item.quantity;
        }
        return Total;
    }
    
}

    