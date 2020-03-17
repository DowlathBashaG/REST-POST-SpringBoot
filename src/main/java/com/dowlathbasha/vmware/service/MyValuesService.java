package com.dowlathbasha.vmware.service;

import org.springframework.stereotype.Service;

import com.dowlathbasha.vmware.model.MyValues;

@Service
public class MyValuesService {
	
	public int addition(MyValues myValues) {
		
		int addResult = myValues.getX() + myValues.getY();
		return addResult;
	}
	
	public int subtraction(MyValues myValues) {
		int subtractResult = myValues.getX() - myValues.getY();
		return subtractResult;
	}
	
}
