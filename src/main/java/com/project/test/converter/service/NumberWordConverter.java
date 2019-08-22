/**
 * 
 */
package com.project.test.converter.service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Kalyan_Konapala
 *
 */
public interface NumberWordConverter {
	
	public String convertNumberToWord(int num);
	
	public default List<String> englishNumberFormat(){
		List<String> formatList = new ArrayList<>();
		formatList.add("");
		formatList.add("Thousand");
		formatList.add("Million");
		return formatList;
		
	}

}
