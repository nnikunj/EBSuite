package com.paranike.ebsuite.common.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.paranike.ebsuite.common.TransactionTypes;

@Entity
@Table(name = "TRANSACTIONS")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TXN_CLASS", discriminatorType = DiscriminatorType.STRING)
public abstract class TransactionsDO extends BaseDO {

	private static final long serialVersionUID = 1L;

	@Column(name = "NAME", nullable = false, length = 256)
	private String name;

	@Column(name = "DESCRIPTION", nullable = true, length = 512)
	private String description;

	@Column(name = "TXN_TYPE", nullable = false)
	private TransactionTypes txnType;

	@Column(name = "TXN_DATE", nullable = false)
	// We only want to record txn date, keeping separate col helps tracking it well
	@Temporal(TemporalType.DATE)
	private Date txnDate;

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

	public TransactionTypes getTxnType() {
		return txnType;
	}

	public void setTxnType(TransactionTypes txnType) {
		this.txnType = txnType;
	}

	public Date getTxnDate() {
		return txnDate;
	}

	public void setTxnDate(Date txnDate) {
		this.txnDate = txnDate;
	}

	@Override
	public String toString() {
		String baseDo = super.toString();
		StringBuilder builder = new StringBuilder();
		builder.append(baseDo);

		builder.append("TransactionsDO [name=");
		builder.append(name);
		builder.append(", description=");
		builder.append(description);
		builder.append(", txnType=");
		builder.append(txnType);

		builder.append(", txnDate=");
		builder.append(txnDate);
		builder.append("]");
		return builder.toString();
	}

}
