package com.paranike.ebsuite.common.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TRANSACTION_ITEMS")
public class TransactionItemsDO extends BaseDO {

	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "TRANSACTION_FK")
	private TransactionsDO txn;

	@ManyToOne
	@JoinColumn(name = "ITEM_FK")
	private ItemsDO item;

	@Column(name = "PRICE_AT_SALE", nullable = false)
	private Double priceAtSale;

	@Column(name = "NOS_TRANSACTED", nullable = false)
	private Integer unitsTransacted;

	public TransactionsDO getTransaction() {
		return txn;
	}

	public void setTransaction(TransactionsDO transaction) {
		this.txn = transaction;
	}

	public ItemsDO getItem() {
		return item;
	}

	public void setItem(ItemsDO item) {
		this.item = item;
	}

	public Double getPriceAtSale() {
		return priceAtSale;
	}

	public void setPriceAtSale(Double priceAtSale) {
		this.priceAtSale = priceAtSale;
	}

	public Integer getUnitsTransacted() {
		return unitsTransacted;
	}

	public void setUnitsTransacted(Integer unitsTransacted) {
		this.unitsTransacted = unitsTransacted;
	}

	@Override
	public String toString() {
		String baseDo = super.toString();
		StringBuilder builder = new StringBuilder();
		builder.append(baseDo);

		builder.append("TransactionItemsDO [txn=");
		builder.append((txn == null) ? null : txn.getName());
		builder.append(", item=");
		builder.append((item == null) ? null : item.getName());
		builder.append(", priceAtSale=");
		builder.append(priceAtSale);
		builder.append(", unitsTransacted=");
		builder.append(unitsTransacted);
		builder.append("]");
		return builder.toString();
	}

}
