/**
 * 
 */
package com.project.test.converter;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.project.test.converter.service.MillionNumberWordConverterTest;
import com.project.test.converter.service.WordGeneratorFromNumberUtilTest;

/**
 * @author Kalyan_Konapala
 *
 */
@RunWith(Suite.class)
@SuiteClasses({NumberConverterFactoryTest.class,MillionNumberWordConverterTest.class,WordGeneratorFromNumberUtilTest.class})
public class SuiteTest {
}