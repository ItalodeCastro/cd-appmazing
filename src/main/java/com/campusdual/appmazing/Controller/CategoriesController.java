package com.campusdual.appmazing.Controller;

import com.campusdual.appmazing.api.ICategoriesService;
import com.campusdual.appmazing.api.IProductService;
import com.campusdual.appmazing.model.dto.CategoriesDTO;
import com.campusdual.appmazing.model.dto.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/categories")
public class CategoriesController {

        @Autowired
        ICategoriesService categoriesService;

        @GetMapping
        public String testController() {
            return "Categories controller works!";
        }

        @PostMapping
        public String testController(@RequestBody String name) {
            return "Categories controller works, " + name + "!";
        }

        @GetMapping(value = "/testMethod")
        public String testControllerMethod(){
            return "Categories controller method works!";
        }

        @PostMapping(value = "/get")
        public CategoriesDTO queryCategories   (@RequestBody CategoriesDTO categories){
            return (CategoriesDTO) this.categoriesService.queryCategories(categories);

        }
        @GetMapping (value = "/getAll")
        public List<CategoriesDTO> queryAllCategories () {
            return this.categoriesService.queryAllCategories();
        }

        @PostMapping (value = "/add")
        public int insertCategories  (@RequestBody CategoriesDTO categories){
            return this.categoriesService.insertCategories(categories);

        }

        @PutMapping(value = "/update")
        public int updateCategories (@RequestBody CategoriesDTO categories){
            return this.categoriesService.updateCategories(categories);

        }

        @DeleteMapping(value = "/delete")
        public int deleteCategories (@RequestBody CategoriesDTO categories){
            return this.categoriesService.deleteCategories(categories);

        }
        //"date_added": "2022-01-01T23:00:00.000+00:00"
    }

