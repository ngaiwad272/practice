package org.anservices.exception;

public class UserBlockedException extends Exception{
	/**
	 * Creates user object without error description
	 */
	public UserBlockedException() {
		
	}
	/**
	 * Creates user object with error description
	 * @param errDec
	 */
	public UserBlockedException(String errDec) {
		super(errDec);
	}
}
