package com.foreignexchange.common;

/**
 * ForeignExchangeEnum is the enum for the maintaining the values of the
 * transaction status details.
 * 
 * @author Govindasamy.C
 * @since 11-02-2020
 * @version V1.1
 *
 */
public class ForeignExchangeEnum {

	/**
	 * Maintaining the transfer status type such as Transfered Pending, Cancelled
	 * 
	 * @author Govindasamy.C
	 * @since 11-02-2020
	 * @version V1.1
	 */
	public enum TransferStatus {
		PENDING, TRANSFERED, CANCELLED;

	}

	/**
	 * Maintaining the account type such as Savings and NRI Account
	 * 
	 * @author Govindasamy.C
	 * @since 11-02-2020
	 * @version V1.1
	 */
	public enum AccountType {
		SAVINGS, NRI;

	}

	/**
	 * Maintaining the transaction Types such as Credit and Debit types.
	 * 
	 * @author Govindasamy.C
	 * @since 11-02-2020
	 * @version V1.1
	 */
	public enum TransactionType {
		CREDIT, DEBIT;

	}
}
