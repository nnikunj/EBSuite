package com.paranike.ebsuite.dao.Categories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.paranike.ebsuite.common.models.CategoriesDO;

@Repository
public interface CategoriesRepository extends CrudRepository<CategoriesDO, Long> {

}
