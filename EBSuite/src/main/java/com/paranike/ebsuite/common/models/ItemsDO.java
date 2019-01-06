package com.paranike.ebsuite.common.models;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ITEMS")
public class ItemsDO extends BaseDO {

	private static final long serialVersionUID = 1L;
	@Column(name = "NAME", nullable = false, length = 256)
	private String name;
	@Column(name = "DESCRIPTION", nullable = false, length = 512)
	private String description;
	@ManyToMany
	@JoinTable(name = "ITEMS_SUBCATEGORIES_MAPPING", joinColumns = @JoinColumn(name = "ITEM_FK"), inverseJoinColumns = @JoinColumn(name = "SUBCATEGORY_FK"))
	private Collection<SubCategoriesDO> subCategories = new ArrayList<SubCategoriesDO>();

	private Double unitCostPrice;

	private String measuringUnit;

	// Mapping is taken care by other class
	@OneToMany(mappedBy = "item", cascade = CascadeType.ALL)
	private Collection<ItemsAttributesDO> itemAttributes = new ArrayList<ItemsAttributesDO>();

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "INVENTORY_FK")
	private InventoryDO inventory;

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

	public Double getUnitCostPrice() {
		return unitCostPrice;
	}

	public void setUnitCostPrice(Double unitCostPrice) {
		this.unitCostPrice = unitCostPrice;
	}

	public String getMeasuringUnit() {
		return measuringUnit;
	}

	public void setMeasuringUnit(String measuringUnit) {
		this.measuringUnit = measuringUnit;
	}

	public Collection<ItemsAttributesDO> getItemAttributes() {
		return itemAttributes;
	}

	public void setItemAttributes(Collection<ItemsAttributesDO> itemAttributes) {
		this.itemAttributes = itemAttributes;
	}

	public InventoryDO getInventory() {
		return inventory;
	}

	public void setInventory(InventoryDO inventory) {
		this.inventory = inventory;
	}

	@Override
	public String toString() {
		String baseDo = super.toString();
		StringBuilder builder = new StringBuilder();
		builder.append(baseDo);
		builder.append("ItemsDO [name=");
		builder.append(name);
		builder.append(", description=");
		builder.append(description);
		builder.append(", subCategories=");
		// We can add subCategories as subCategories wont print item
		builder.append((subCategories == null) ? null : subCategories);
		builder.append(", unitCostPrice=");
		builder.append(unitCostPrice);
		builder.append(", measuringUnit=");
		builder.append(measuringUnit);
		builder.append(" itemAttributes=");
		builder.append((itemAttributes == null) ? null : itemAttributes.size());
		builder.append(", inventory=");
		// Print just Quant of inventory
		builder.append((inventory == null) ? null : inventory.getQunatity());
		builder.append("]");
		return builder.toString();
	}

}
