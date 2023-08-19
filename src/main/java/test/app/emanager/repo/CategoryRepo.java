package test.app.emanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import test.app.emanager.model.Category;

import java.util.List;


public interface CategoryRepo extends JpaRepository<Category, Long> {

    @Query("SELECT c FROM Category c WHERE c.deleted = false")
    List<Category> findAllCategories();

    @Query("SELECT c FROM Category c WHERE c.deleted = false AND c.id = :idCategory")
    Category findCategoryById(@Param("idCategory") Long idCategory);
}
