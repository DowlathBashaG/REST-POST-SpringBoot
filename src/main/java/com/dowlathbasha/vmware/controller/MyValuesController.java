package com.dowlathbasha.vmware.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.dowlathbasha.vmware.model.MyValues;
import com.dowlathbasha.vmware.service.MyValuesService;
import com.fasterxml.jackson.databind.ObjectMapper;


@RestController
@RequestMapping(path = "/api")
public class MyValuesController {

	@Autowired
	public MyValuesService myValuesService;

	@PostMapping(path = "/add", consumes = "application/json", produces = "application/json")
	public ResponseEntity<Object> addMyValues(@RequestBody MyValues myValues) {
		int additionResult = myValuesService.addition(myValues);
		Map<String, Integer> map = new HashMap<>();
		map.put("result", additionResult);
		ObjectMapper Obj = new ObjectMapper();
		String jsonStr = null;
		try {
			jsonStr = Obj.writeValueAsString(map);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return ResponseEntity.status(200).body(jsonStr);
	}
	
	@PostMapping(path = "/diff", consumes = "application/json", produces = "application/json")
	public ResponseEntity<Object> subtractMyValues(@RequestBody MyValues myValues) {
		int additionResult = myValuesService.subtraction(myValues);
		Map<String, Integer> map = new HashMap<>();
		map.put("result", additionResult);
		ObjectMapper Obj = new ObjectMapper();
		String jsonStr = null;
		try {
			jsonStr = Obj.writeValueAsString(map);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return ResponseEntity.status(200).body(jsonStr);
	}
}
