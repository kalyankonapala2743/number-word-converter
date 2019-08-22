/**
 * 
 */
package com.project.test.converter;

import com.project.test.converter.exception.ConverterNotDefinedException;
import com.project.test.converter.exception.InvalidInputException;
import com.project.test.converter.exception.OutOfRangeException;
import com.project.test.converter.service.MillionNumberWordConverter;
import com.project.test.converter.service.NumberWordConverter;

/**
 * @author Kalyan_Konapala
 *
 */
public class NumberConverterFactory {

	private static final String MILLION_CONST = "Million";
	private static final String OUT_OF_RANGE_EXCP = "the entered number %s is out of range";

	public static String process(String number, String converterType)
			throws InvalidInputException, OutOfRangeException, ConverterNotDefinedException {

		try {
			NumberWordConverter wordConverter = null;

			if (number.length() == 0 || number.length() > 9) {
				throw new OutOfRangeException(String.format(OUT_OF_RANGE_EXCP, number));
			}

			int inputNum = Integer.parseInt(number);
			if (converterType.equalsIgnoreCase(MILLION_CONST)) {

				wordConverter = new MillionNumberWordConverter();
				String wordNumber = wordConverter.convertNumberToWord(inputNum);
				return wordNumber;

			} else {
				throw new ConverterNotDefinedException("Number converter definition not found");
			}
		} catch (NumberFormatException nfe) {
			throw new InvalidInputException("Invalid Entry Failed with exception" + nfe.getCause());
		}

	}

}
