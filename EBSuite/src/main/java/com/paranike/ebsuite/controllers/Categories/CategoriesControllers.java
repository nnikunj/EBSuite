package com.paranike.ebsuite.controllers.Categories;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@ComponentScan
@RestController
public class CategoriesControllers {

	@RequestMapping("/categories")
	public String getAllCategories() {
		return "Jai Hind!!! Jai Hanuman";
	}
}
