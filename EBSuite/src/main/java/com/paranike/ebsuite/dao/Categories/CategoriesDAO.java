package com.paranike.ebsuite.dao.Categories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.paranike.ebsuite.common.models.CategoriesDO;

@Component
public class CategoriesDAO implements CategoriesDAOIX {
	@Autowired
	private CategoriesRepository categoriesRepo;

	@Override
	public List<CategoriesDO> getAllCategories() {
		ArrayList<CategoriesDO> retList = new ArrayList<CategoriesDO>();
		categoriesRepo.findAll().forEach(retList::add);
		return retList;
	}

}
