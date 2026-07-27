package exercise1.inventory;
import java.util.*;
public class InventoryManager {
    HashMap<Integer,Product>hash=new HashMap<>();
    public void addProduct(Product product){
        hash.put(product.getProductId(), product);
    }
    public Product searchProduct(int productId){
        return hash.get(productId);
    }
    public void displayProducts(){
        for(Product p:hash.values()){
            System.out.println(p);
        }
    }
    public void deleteProduct(int productId){
        hash.remove(productId);
    }
    public void updateProduct(int productId,int quantity) {
        Product p = hash.get(productId);
        if (p != null) {
            p.setQuantity(quantity);
        } else {
           System.out.println("product is not found");
        }
    }
}
