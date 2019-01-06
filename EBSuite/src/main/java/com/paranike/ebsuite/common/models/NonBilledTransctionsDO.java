package com.paranike.ebsuite.common.models;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * 
 * This class is concrete implementation of TransctionsDO However this does not
 * have any instance member of its own
 *
 */
@Entity
@DiscriminatorValue(value = "NON_BILLED_TXN")
public class NonBilledTransctionsDO extends TransactionsDO {

	private static final long serialVersionUID = 1L;

	@Override
	public String toString() {
		String baseDo = super.toString();
		StringBuilder builder = new StringBuilder();
		builder.append(baseDo);

		builder.append("NonBilledTransctionsDO []");
		return builder.toString();
	}

}
