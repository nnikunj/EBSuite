package com.paranike.ebsuite.common.models;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "BILLED_TXN")
public class BilledTransctionsDO extends TransactionsDO {

	private static final long serialVersionUID = 1L;
	@Column(name = "PURCHASE_ORDER_REFERENCE", nullable = true)
	private String purchaseOrderRef;

	public String getPurchaseOrderRef() {
		return purchaseOrderRef;
	}

	public void setPurchaseOrderRef(String purchaseOrderRef) {
		this.purchaseOrderRef = purchaseOrderRef;
	}

	@Override
	public String toString() {
		String baseDo = super.toString();
		StringBuilder builder = new StringBuilder();
		builder.append(baseDo);

		builder.append("BilledTransctionsDO [purchaseOrderRef=");
		builder.append(purchaseOrderRef);
		builder.append("]");
		return builder.toString();
	}

}
