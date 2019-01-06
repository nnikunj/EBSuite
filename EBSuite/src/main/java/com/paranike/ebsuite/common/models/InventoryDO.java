package com.paranike.ebsuite.common.models;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "INVENTORY")
public class InventoryDO extends BaseDO {

	private static final long serialVersionUID = 1L;

	@OneToOne
	@JoinColumn(name = "ITEM_FK")
	private ItemsDO item;
	@Column(name = "QUANTITY")
	private Integer qunatity;

	@OneToMany(mappedBy = "inventory")
	private Collection<InventoryLedgerDO> ledgers = new ArrayList<InventoryLedgerDO>();

	public ItemsDO getItem() {
		return item;
	}

	public void setItem(ItemsDO item) {
		this.item = item;
	}

	public Integer getQunatity() {
		return qunatity;
	}

	public void setQunatity(Integer qunatity) {
		this.qunatity = qunatity;
	}

	public Collection<InventoryLedgerDO> getLedgers() {
		return ledgers;
	}

	public void setLedgers(Collection<InventoryLedgerDO> ledgers) {
		this.ledgers = ledgers;
	}

	@Override
	public String toString() {
		String baseDo = super.toString();
		StringBuilder builder = new StringBuilder();
		builder.append(baseDo);
		builder.append("InventoryDO [item=");
		builder.append((item == null) ? null : item.getName());
		builder.append(", qunatity=");
		builder.append(qunatity);
		builder.append(", ledgers=");
		builder.append((ledgers != null) ? "LedgerExists" : null);
		builder.append("]");
		return builder.toString();
	}

}
