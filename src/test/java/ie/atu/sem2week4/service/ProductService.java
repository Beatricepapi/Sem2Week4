package ie.atu.sem2week4.service;

import ie.atu.sem2week4.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    private final List<Product> productList = new ArrayList<>();

    public Product addProduct(Product product) {
        productList.add(product);
        return product;
    }

    public List<Product> getAllProducts() {
        return productList;
    }
}