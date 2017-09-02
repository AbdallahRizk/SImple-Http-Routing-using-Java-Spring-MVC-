package com.mahlak.data;


import com.mahlak.model.Category;
import com.mahlak.model.Gif;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * Created by abdallahrizk on 18/06/2017.
 */

@Component
public class CategoryRepository {

    private static final List<Category> ALL_CATEGORIES = Arrays.asList(
            new Category(1,"Technology"),
            new Category(2, "People"),
            new Category(3,"Destruction")
    );

    public List<Category> getAllCategories(){
        return ALL_CATEGORIES;
    }
    Gif gif;
    public Category findByName(int id){
        for (Category category : ALL_CATEGORIES){
            if(category.getId() == id){
                return category;
            }
        }
        return null;
    }


}
