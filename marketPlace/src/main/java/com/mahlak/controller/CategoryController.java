package com.mahlak.controller;

import com.mahlak.data.CategoryRepository;
import com.mahlak.data.GifRepository;
import com.mahlak.model.Category;
import com.mahlak.model.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by abdallahrizk on 18/06/2017.
 */
@Controller
public class CategoryController {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private GifRepository gifRepository;


    @RequestMapping(value = "/categories")
    public String listGifts(ModelMap modelMap){
        List<Category> allCategories = categoryRepository.getAllCategories();
        modelMap.put("categories", allCategories);
        return "categories";

    }



    @RequestMapping("/category/{id}")
    public String categoryDetails(@PathVariable int id, ModelMap modelMap){
        Category category = categoryRepository.findByName(id);
        modelMap.put("category",category);

        List<Gif> gifs = gifRepository.findById(id);
        modelMap.put("gifs", gifs);

        return "category";

    }
}
