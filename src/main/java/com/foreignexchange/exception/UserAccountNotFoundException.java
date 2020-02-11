package com.foreignexchange.exception;

/**
 * UserAccountNotfoundException - handle the user account not found exception in this custom
 * exception class
 * 
 * @author Govindasamy.C
 * @version V1.1
 * @since 11-02-2020
 *
 */
public class UserAccountNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;

	public UserAccountNotFoundException(String message) {
		super(message);
	}
}
