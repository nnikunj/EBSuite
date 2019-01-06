package com.paranike.ebsuite.common.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ITEM_ATTRIBUTES")
public class ItemsAttributesDO extends BaseDO {

	private static final long serialVersionUID = 1L;

	@Column(name = "ATTR_NAME", nullable = false, length = 45)
	private String attrName;

	@Column(name = "ATTR_VALUE", nullable = false, length = 45)
	private String attrValue;

	@ManyToOne
	@JoinColumn(name = "ITEM_FK")
	private ItemsDO item;

	public String getAttrName() {
		return attrName;
	}

	public void setAttrName(String attrName) {
		this.attrName = attrName;
	}

	public String getAttrValue() {
		return attrValue;
	}

	public void setAttrValue(String attrValue) {
		this.attrValue = attrValue;
	}

	public ItemsDO getItem() {
		return item;
	}

	public void setItem(ItemsDO item) {
		this.item = item;
	}

	@Override
	public String toString() {
		String baseDo = super.toString();
		StringBuilder builder = new StringBuilder();
		builder.append(baseDo);
		builder.append("ItemsAttributesDO [attrName=");
		builder.append(attrName);
		builder.append(", attrValue=");
		builder.append(attrValue);
		builder.append(", item=");
		builder.append(item);
		builder.append("]");
		return builder.toString();
	}

}
