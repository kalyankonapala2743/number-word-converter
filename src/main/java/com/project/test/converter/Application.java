package com.project.test.converter;

import java.util.Scanner;

import com.project.test.converter.exception.ConverterNotDefinedException;
import com.project.test.converter.exception.InvalidInputException;
import com.project.test.converter.exception.OutOfRangeException;

/**
 * @author Kalyan_Konapala
 *
 */
public class Application {

	// can be taken from property or args
	private static final String CONVERTER_TYPE = "Million";

	public static void main(String[] args)
			throws InvalidInputException, OutOfRangeException, ConverterNotDefinedException {
		System.out.println("Enter the number : ");
		try (Scanner scanner = new Scanner(System.in)) {

			String number = scanner.next();

			String output = NumberConverterFactory.process(number, CONVERTER_TYPE);
			System.out.println("The output number in english word is : " + output);

		}
	}
}
