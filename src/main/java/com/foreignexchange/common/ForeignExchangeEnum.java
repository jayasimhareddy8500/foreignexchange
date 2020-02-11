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
	 * @author Govindasamy
	 * @since 11-02-2020
	 */
	public enum TransferStatus {
		PENDING, TRANSFERED, CANCELLED;

	}

	/**
	 * Maintaining the account type such as Savings and NRI Account
	 * 
	 * @author Govindasamy
	 * @since 11-02-2020
	 */
	public enum AccountType {
		SAVINGS, NRI;

	}

	public enum TransactionType {
		CREDIT, DEBIT;

	}
}
