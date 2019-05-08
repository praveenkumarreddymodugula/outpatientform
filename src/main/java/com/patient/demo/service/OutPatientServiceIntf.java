package com.patient.demo.service;

import org.springframework.stereotype.Component;

import com.patient.demo.request.OpRequest;
import com.patient.demo.response.OpResponse;

@Component
public interface OutPatientServiceIntf {
	
	public OpResponse createOpRequest(OpRequest opReq) throws Exception;

}
