package service;

import model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StockManager{
    private List<Product> productList;

    public StockManager(){
        this.productList = new ArrayList<Product>();
    }
    public void addProduct(Product p) {
        productList.add(p);
    }
    public void removeProduct(int id){
        productList.removeIf(p -> p.getId() == id);
    }
    public Product findproduct(int id){
        Optional<Object> productlist = Optional.empty();
        return productlist.stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .orElse(null);
    }
}


