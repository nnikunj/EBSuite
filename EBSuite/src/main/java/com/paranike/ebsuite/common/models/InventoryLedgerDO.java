package com.paranike.ebsuite.common.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "INVENTORY_LEDGER")
public class InventoryLedgerDO extends BaseDO {

	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "INVENTORY_FK")
	private InventoryDO inventory;

	@Column(name = "OPERATION_PERFORMED", nullable = false, length = 45)
	private String operationPerformed;

	@Column(name = "QUANTITY_AFTER_OPERATION", nullable = false)
	private Integer quantityAfterOperation;

	public InventoryDO getInventory() {
		return inventory;
	}

	public void setInventory(InventoryDO inventory) {
		this.inventory = inventory;
	}

	public String getOperationPerformed() {
		return operationPerformed;
	}

	public void setOperationPerformed(String operationPerformed) {
		this.operationPerformed = operationPerformed;
	}

	public Integer getQuantityAfterOperation() {
		return quantityAfterOperation;
	}

	public void setQuantityAfterOperation(Integer quantityAfterOperation) {
		this.quantityAfterOperation = quantityAfterOperation;
	}

	@Override
	public String toString() {
		String baseDo = super.toString();
		StringBuilder builder = new StringBuilder();
		builder.append(baseDo);

		builder.append("InventoryLedgerDO [inventory=");
		builder.append(inventory);
		builder.append(", operationPerformed=");
		builder.append(operationPerformed);
		builder.append(", quantityAfterOperation=");
		builder.append(quantityAfterOperation);
		builder.append("]");
		return builder.toString();
	}

}
