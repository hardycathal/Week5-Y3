package ie.atu.week6y3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {

    private ProductService myProduct;

    public ProductController(ProductService myProduct){
        this.myProduct = myProduct;
    }


    @PostMapping("/newProduct")
    public List<Product> newProduct(@RequestBody Product product){

        // business logic to ass this to a database
        // return list of ll products from database
        return myProduct.addProduct(product);
    }

    @GetMapping("/getProducts")
    public List<Product> getProducts(Product product){
        return myProduct.getProducts(product);
    }
}
