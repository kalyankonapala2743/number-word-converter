/**
 * 
 */
package com.project.test.converter;

import static org.junit.Assert.*;

import org.junit.Test;

import com.project.test.converter.exception.ConverterNotDefinedException;
import com.project.test.converter.exception.InvalidInputException;
import com.project.test.converter.exception.OutOfRangeException;

/**
 * @author Kalyan_Konapala
 *
 */
public class NumberConverterFactoryTest {

	private static final String CONVERTER_TYPE = "Million";
	
	/**
	 * Test method for {@link com.project.test.converter.NumberConverterFactory#process(java.lang.String)}.
	 */
	@Test
	public void testProcess() {
		String number = "123";
		String expected = "One Hundred and Twenty Three";
		try {
			assertEquals(expected, NumberConverterFactory.process(number,CONVERTER_TYPE));
		} catch (InvalidInputException | OutOfRangeException | ConverterNotDefinedException e) {
			
			e.printStackTrace();
		}
	}
	
	@Test(expected=InvalidInputException.class)
	public void testInvalidInputProcess() throws InvalidInputException, OutOfRangeException, ConverterNotDefinedException {
		String number = "abc";
		NumberConverterFactory.process(number,CONVERTER_TYPE);
				
	}
	
	@Test(expected=OutOfRangeException.class)
	public void testOutOfRangeProcess() throws InvalidInputException, OutOfRangeException, ConverterNotDefinedException {
		String number = "9874562131";
		NumberConverterFactory.process(number,CONVERTER_TYPE);
				
	}
	
	@Test(expected=ConverterNotDefinedException.class)
	public void testConverterNotDefinedProcess() throws InvalidInputException, OutOfRangeException, ConverterNotDefinedException {
		String number = "98745";
		NumberConverterFactory.process(number,"");
				
	}

}
