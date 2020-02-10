package com.cliff.recipe.controllers;

import com.cliff.recipe.domain.Category;
import com.cliff.recipe.domain.UnitOfMeasure;
import com.cliff.recipe.repositories.CategoryRepository;
import com.cliff.recipe.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {
    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(){
        Optional<Category> categoryOptional = categoryRepository.findByDescription("Chinese");
        Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("Teaspoon");
        System.out.println("Cat Id is " + categoryOptional.get().getId());
        System.out.println("Unit Id is " + unitOfMeasureOptional.get().getId());


        return "index";

    }
}
