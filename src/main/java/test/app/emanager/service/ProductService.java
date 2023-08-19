package test.app.emanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.app.emanager.model.Product;
import test.app.emanager.model.Variant;
import test.app.emanager.repo.ProductRepo;
import test.app.emanager.repo.VariantRepo;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    @Autowired
    private VariantRepo variantRepo;

    public List<Product> findAll(){
        return productRepo.findAllProducts();
    }

    public Product findById(Long id){
        return productRepo.findProductById(id);
    }

    public Product save(Product product){


        for (Variant variant : product.getVariant()) {
            variant.setProduct(product);
        }
        return productRepo.save(product);
    }


}
