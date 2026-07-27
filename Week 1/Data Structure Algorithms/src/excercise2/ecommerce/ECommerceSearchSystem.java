package excercise2.ecommerce;
public class ECommerceSearchSystem {
public static void main(String[]ags){
    SearchAlgorithms searchAlgorithms=new SearchAlgorithms();
    Product[]products={
            new Product(101,"Mobile","Electronics"),
            new Product(102,"Keyboard","Electronics"),
            new Product(103,"Headphones","Accessories"),
            new Product(104,"Television","Appliances")
    };
    System.out.println(searchAlgorithms.linearsearch(products,"Keyboard"));
    System.out.println(searchAlgorithms.linearsearch(products,"Refrigirator"));
    System.out.println(searchAlgorithms.binarysearch(products,"Television"));
    System.out.println(searchAlgorithms.binarysearch(products,"Laptop"));
}
}