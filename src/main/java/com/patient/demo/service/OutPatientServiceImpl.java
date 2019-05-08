package com.patient.demo.service;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.patient.demo.model.OutPatient;
import com.patient.demo.request.OpRequest;
import com.patient.demo.response.OpResponse;
import com.patient.demo.resporisty.OutPatientRepository;

@Component
public class OutPatientServiceImpl implements OutPatientServiceIntf{
	
	@Autowired
	OutPatientRepository outPatientRepo;

	@Override
	public OpResponse createOpRequest(OpRequest opReq) throws Exception {
		// TODO opReq Validation ex: age and mobile ... etc
		
		//Prepare outpatient db record suing opRequest
		OutPatient outPatient = new OutPatient();
		outPatient.setPatientName(opReq.getFullName());
		
		//Taking current time as opCreationDate
		 LocalDateTime today = LocalDateTime.now();
		 outPatient.setEnterdate(today);
		 
		 LocalDate date=LocalDate.now();
		 LocalDate expDate = date.plusDays(30);
		 outPatient.setExpiredate(expDate);
		 outPatient.setAge(opReq.getAge());
		 outPatient.setMobile(opReq.getMobile());
		 outPatient.setDateofbirth(opReq.getDob());
		 outPatient.setAddress(opReq.getAddress());
		 outPatient.setWeight(opReq.getWaight());
		 outPatient.setProblem(opReq.getProblem());
		 
		 //Saving record into db
		 outPatient =  outPatientRepo.save(outPatient);
		 OpResponse opRes = new OpResponse();
		 opRes.setOpId("OP:"+outPatient.getId());
		 opRes.setMessage("Thank you for visitin our Hospital..!!");
		return opRes;
	}

}
