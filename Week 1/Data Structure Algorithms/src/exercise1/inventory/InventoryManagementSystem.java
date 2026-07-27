package exercise1.inventory;

public class InventoryManagementSystem {
    public static void main(String[]args){
        InventoryManager inventoryManager=new InventoryManager();
        Product p1 = new Product(101, "Laptop", 10, 50000);
        Product p2 = new Product(102, "Mouse", 50, 500);
        Product p3 = new Product(103, "Keyboard", 25, 1500);
        Product p4=new Product(104,"Headphone",10,1000);
        inventoryManager.addProduct(p1);
        inventoryManager.addProduct(p2);
        inventoryManager.addProduct(p3);
        inventoryManager.addProduct(p4);
        inventoryManager.displayProducts();
        System.out.println("Search the product 102");
        System.out.println(inventoryManager.searchProduct(102));
        System.out.println("update the product 102");
        inventoryManager.updateProduct(102, 100);
        System.out.println("Search the product 102");
        System.out.println(inventoryManager.searchProduct(102));
        System.out.println("Delete the product 102");
        inventoryManager.deleteProduct(102);
        System.out.println("After deleting Product 102");
        inventoryManager.displayProducts();

    }
}
