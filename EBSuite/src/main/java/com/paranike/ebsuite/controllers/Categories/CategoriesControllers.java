package com.paranike.ebsuite.controllers.Categories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paranike.ebsuite.common.models.CategoriesDO;
import com.paranike.ebsuite.services.Categories.CategoriesServiceIX;

@ComponentScan
@RestController
public class CategoriesControllers {
	@Autowired
	private CategoriesServiceIX categoryService;

	@RequestMapping("/categories")
	public List<CategoriesDO> getAllCategories() {
		return categoryService.getAllCategories();

	}
}
