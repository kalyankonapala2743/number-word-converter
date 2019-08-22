/**
 * 
 */
package com.project.test.converter.exception;

/**
 * @author Kalyan_Konapala
 *
 */
public class InvalidInputException extends Exception {

	private static final long serialVersionUID = 1L;

	public InvalidInputException(String excp) {
		// Call constructor of parent Exception
		super(excp);
	}
}
