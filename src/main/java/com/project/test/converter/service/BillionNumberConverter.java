package com.project.test.converter.service;

import java.util.ArrayList;
import java.util.List;

public class BillionNumberConverter extends MillionNumberWordConverter{
	
	public List<String> englishNumberFormat(){
		List<String> formatList = new ArrayList<>();
		formatList.add("");
		formatList.add("Thousand");
		formatList.add("Million");
		formatList.add("Billion");
		return formatList;
		
	}

}
