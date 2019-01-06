package com.paranike.ebsuite.services.Categories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.paranike.ebsuite.common.models.CategoriesDO;
import com.paranike.ebsuite.dao.Categories.CategoriesDAOIX;

@Component
public class CategoriesServiceImpl implements CategoriesServiceIX {
	@Autowired
	CategoriesDAOIX categoriesDao;

	@Override
	public List<CategoriesDO> getAllCategories() {

		return categoriesDao.getAllCategories();
	}

}
