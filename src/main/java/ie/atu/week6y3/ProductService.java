package ie.atu.week6y3;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> myList = new ArrayList<>();
    public List<Product> addProduct(Product product){
        //imagine we have a connection to a database
        myList.add(product);
        return myList;
    }

    public List<Product> getProducts(Product product){
        return myList;
    }

    public List<Product> updateProduct(Product product){
        for(int i = 0; i < myList.size(); i++){
            if(product.getId()==myList.get(i).getId()){
                myList.set(i, product);
                break;
            }
        }
        return myList;
    }

    public List<Product> deleteProduct(int id){
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i).getId() == id) {
                myList.remove(i);
                break;
            }
        }
        return myList;

    }
}
