package com.patient.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.patient.demo.request.OpRequest;
import com.patient.demo.response.OpResponse;
import com.patient.demo.service.OutPatientServiceIntf;

@RestController
public class OPController {
	
	@Autowired
	OutPatientServiceIntf outPatientServiceIntf;
	
	@PostMapping("/outpatients")
	public ResponseEntity<OpResponse> createOP(@RequestBody OpRequest opReq, 
			@RequestHeader String client,@RequestHeader String location)  throws Exception
	{
		OpResponse opRes = outPatientServiceIntf.createOpRequest(opReq);
		
		return new ResponseEntity<>(
			      opRes, 
			      HttpStatus.OK);
	}

}
