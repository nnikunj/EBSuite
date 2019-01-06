package com.paranike.ebsuite.controllers.Categories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
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

	@SuppressWarnings("rawtypes")
	@RequestMapping(value = "/categories", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity saveCategories(@RequestBody CategoriesDO categoriesDO) {
		categoryService.addCategory(categoriesDO);
		return new ResponseEntity(HttpStatus.CREATED);

	}

}
