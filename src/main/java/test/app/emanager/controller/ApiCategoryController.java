package test.app.emanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import test.app.emanager.model.Category;
import test.app.emanager.model.Employee;
import test.app.emanager.service.CategoryService;
import test.app.emanager.service.EmployeeService;
import test.app.emanager.service.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("/Category")
public class ApiCategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/all")
    public ResponseEntity<List<Category>> getAllE(){
        List<Category> Categories = categoryService.findAllCategories();
        return new ResponseEntity<>(Categories, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Category> getE(@PathVariable("id") Long id){
        Category Category = categoryService.findCategoryById(id);
        return new ResponseEntity<>(Category, HttpStatus.OK);
    }


    @PostMapping("/add")
    public ResponseEntity<Category> addE(@RequestBody Category Category){
        Category newCategory = categoryService.addCategory(Category);
        return new ResponseEntity<>(newCategory, HttpStatus.CREATED);
    }





}
