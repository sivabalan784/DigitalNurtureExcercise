package excercise2.ecommerce;

public class SearchAlgorithms {
    public Product linearsearch(Product[]products,String productName){
for( Product p:products ){
    if(p.getProductName().equals(productName)) {
        return p;
    }
}
return null;
    }
    public Product binarysearch(Product[]products,String productName){
        int low=0;
        int high=products.length-1;
       while(low<=high){
            int mid=(low+high)/2;
            if(products[mid].getProductName().equals(productName)){
                return products[mid];
            }
            else if(products[mid].getProductName().compareTo(productName)<0){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
       return null;
    }
}