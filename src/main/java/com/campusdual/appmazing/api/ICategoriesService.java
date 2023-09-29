package com.campusdual.appmazing.api;

import com.campusdual.appmazing.model.dao.CategoriesDao;
import com.campusdual.appmazing.model.dto.CategoriesDTO;

import java.util.List;

public interface ICategoriesService {
        CategoriesDTO queryCategories (CategoriesDTO categoriesDTO);
        List<CategoriesDTO> queryAllCategories ();

        int insertCategories   (CategoriesDTO categories);

        int updateCategories (CategoriesDTO categories);
        int deleteCategories (CategoriesDTO categories);

    }


