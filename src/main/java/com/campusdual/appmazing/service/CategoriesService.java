package com.campusdual.appmazing.service;

import com.campusdual.appmazing.api.ICategoriesService;
import com.campusdual.appmazing.model.Categories;
import com.campusdual.appmazing.model.dao.CategoriesDao;
import com.campusdual.appmazing.model.dto.CategoriesDTO;
import com.campusdual.appmazing.model.dto.dtopmapper.CategoriesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("CategoriesService")
@Lazy
public class CategoriesService implements ICategoriesService {
        @Autowired
        private CategoriesDao categoriesDAo;

        @Override
        public CategoriesDTO queryCategories(CategoriesDTO categoriesDTO) {
            Categories categories = CategoriesMapper.INSTANCE.toEntity(categoriesDTO);
            Categories categoriesFinal = this.categoriesDAo.getReferenceById(categories.getId());
            return null;
        }

        @Override
        public List<CategoriesDTO> queryAllCategories() {
            return CategoriesMapper.INSTANCE.toDTOList(this.categoriesDAo.findAll());
        }

        @Override
        public int insertCategories(CategoriesDTO categoriesDTO) {
            Categories categories = CategoriesMapper.INSTANCE.toEntity(categoriesDTO);
            this.categoriesDAo.saveAndFlush(categories);
            return categories.getId();
        }

        @Override
        public int updateCategories(CategoriesDTO categoriesDTO) {
            return this.insertCategories(categoriesDTO);
        }

        @Override
        public int deleteCategories(CategoriesDTO categories) {
            int id = categories.getId();
            Categories categoriesEntity = CategoriesMapper.INSTANCE.toEntity(categories);
            categoriesDAo.delete(categoriesEntity);
            return id;
        }

    }

