package com.paranike.ebsuite.common.models;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "CATEGORIES")
public class CategoriesDO extends BaseDO {

	private static final long serialVersionUID = 1L;

	@Column(name = "NAME", nullable = false, length = 256)
	private String name;
	@Column(name = "DESCRIPTION", nullable = false, length = 512)
	private String description;
	// Mapped By helps notify hibernate that member variable in other DO is doing
	// the mapping. This helps us in avoiding a mapping table
	@OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
	private Collection<SubCategoriesDO> subCategories = new ArrayList<SubCategoriesDO>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Collection<SubCategoriesDO> getSubCategories() {
		return subCategories;
	}

	public void setSubCategories(Collection<SubCategoriesDO> subCategories) {
		this.subCategories = subCategories;
	}

	@Override
	public String toString() {
		String baseDo = super.toString();
		StringBuilder builder = new StringBuilder();
		builder.append(baseDo);

		builder.append("CategoriesDO [name=");
		builder.append(name);
		builder.append(", description=");
		builder.append(description);
		builder.append(", subCategories=");
		// If we print it here sub class will also print and we will end up in
		// stackoverflow
		builder.append((subCategories == null) ? null : subCategories.size());
		builder.append("]");
		return builder.toString();
	}

}
