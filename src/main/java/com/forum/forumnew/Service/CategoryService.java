package com.forum.forumnew.Service;

import com.forum.forumnew.Model.Category;
import com.forum.forumnew.View.Response.CategoryResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;

@Service
@AllArgsConstructor
public class CategoryService {

    public CategoryResponse Catigorissimus(){
        Category category = new Category();
        Timestamp created = new Timestamp(System.currentTimeMillis());

        category.setName("Как белка потерял свои яйцы");
        category.setCreated(created);

        CategoryResponse response = CategoryResponse.builder()
            .id(category.getId())
            .user_id(category.getUser_id())
            .name(category.getName())
            .slug(category.getSlug())
            .created(category.getCreated())
            .status(category.getStatus())
            .build();

        return response;
    }
}
