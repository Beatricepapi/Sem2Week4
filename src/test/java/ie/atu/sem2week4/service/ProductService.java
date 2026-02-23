package ie.atu.sem2week4.service;

import ie.atu.sem2week4.model.Product;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> products = new ArrayList<Product>();
    private long nextId = 1;

    public Product addProduct(Product product)
    {
        product.setId(nextId++);
        products.add(product);
        return product;
    }
}
