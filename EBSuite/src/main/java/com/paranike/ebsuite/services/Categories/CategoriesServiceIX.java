package com.paranike.ebsuite.services.Categories;

import java.util.List;

import org.springframework.stereotype.Service;

import com.paranike.ebsuite.common.models.CategoriesDO;

@Service
public interface CategoriesServiceIX {
	public List<CategoriesDO> getAllCategories();
}
