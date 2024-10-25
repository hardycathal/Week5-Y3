package ie.atu.week6y3;

import jakarta.validation.Valid;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {

    private ProductService myProduct;

    public ProductController(ProductService myProduct){
        this.myProduct = myProduct;
    }


    @PostMapping("/newProduct")
    public List<Product> newProduct(@Valid @RequestBody Product product){

        // business logic to ass this to a database
        // return list of ll products from database

        return myProduct.addProduct(product);
    }

    @GetMapping("/getProducts")
    public List<Product> getProducts(Product product){
        return myProduct.getProducts(product);
    }

    @PutMapping("/updateProduct")
    public List<Product> updateProduct(@Valid @RequestBody Product product){
        return myProduct.updateProduct(product);
    }

    @DeleteMapping("/deleteProduct/{id}")
    public List<Product> deleteProduct(@PathVariable int id){
        return myProduct.deleteProduct(id);
    }
}
