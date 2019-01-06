package com.paranike.ebsuite.common.models;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "SUB_CATEGORIES")
public class SubCategoriesDO extends BaseDO {

	private static final long serialVersionUID = 1L;

	@Column(name = "NAME", nullable = false, length = 256)
	private String name;
	@Column(name = "DESCRIPTION", nullable = false, length = 512)
	private String description;

	@ManyToOne
	@JoinColumn(name = "CATEGORY_FK")
	private CategoriesDO category;

	// We are letting hibernate know other class is mapping it
	@ManyToMany(mappedBy = "subCategories")
	private Collection<ItemsDO> items = new ArrayList<ItemsDO>();

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

	public CategoriesDO getCategory() {
		return category;
	}

	public void setCategory(CategoriesDO category) {
		this.category = category;
	}

	public Collection<ItemsDO> getItems() {
		return items;
	}

	public void setItems(Collection<ItemsDO> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		String baseDo = super.toString();
		StringBuilder builder = new StringBuilder();
		builder.append(baseDo);
		builder.append("SubCategoriesDO [name=");
		builder.append(name);
		builder.append(", description=");
		builder.append(description);
		// We can print it here as category itself will just print size
		builder.append(", category=");
		builder.append(category);
		builder.append(", items=");
		builder.append((items == null) ? null : items.size());
		builder.append("]");
		return builder.toString();
	}

}
