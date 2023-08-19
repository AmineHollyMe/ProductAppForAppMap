package test.app.emanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import test.app.emanager.model.Category;
import test.app.emanager.model.Product;

import java.util.List;

public interface ProductRepo extends JpaRepository<Product, Long> {


    @Query("SELECT p FROM Product p WHERE p.deleted = false")
    List<Product> findAllProducts();

    @Query("SELECT p FROM Product p WHERE p.deleted = false AND p.id = :idProduct")
    Product findProductById(@Param("idProduct") Long idProduct);
}
