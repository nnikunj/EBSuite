package com.paranike.ebsuite.dao.Categories;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.paranike.ebsuite.common.models.CategoriesDO;

@Repository
public interface CategoriesDAOIX {

	public List<CategoriesDO> getAllCategories();

	public void add(CategoriesDO categoriesDO);

}
