/**
 * 
 */
package com.project.test.converter.exception;

/**
 * @author Kalyan_Konapala
 *
 */
public class ConverterNotDefinedException extends Exception {

	private static final long serialVersionUID = 1L;

	public ConverterNotDefinedException(String excp) {
		// Call constructor of parent Exception
		super(excp);
	}
}
