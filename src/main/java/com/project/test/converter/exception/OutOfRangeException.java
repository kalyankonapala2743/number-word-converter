/**
 * 
 */
package com.project.test.converter.exception;

/**
 * @author Kalyan_Konapala
 *
 */
public class OutOfRangeException extends Exception {

	private static final long serialVersionUID = 1L;

	public OutOfRangeException(String excp) {
		// Call constructor of parent Exception
		super(excp);
	}

}
