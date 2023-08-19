package test.app.emanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.app.emanager.model.Category;
import test.app.emanager.repo.CategoryRepo;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepo categoryRepo;

    public List<Category> findAllCategories(){
        return categoryRepo.findAllCategories();
    }

    public Category findCategoryById(Long idCategory){
        return categoryRepo.findCategoryById(idCategory);
    }

    public Category addCategory(Category category){
        return categoryRepo.save(category);
    }
}
