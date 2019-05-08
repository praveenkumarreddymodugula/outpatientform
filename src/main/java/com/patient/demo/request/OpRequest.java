package com.patient.demo.request;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class OpRequest {

	String fName;
	String lName;
	String fullName;
	LocalDate dob;
	int age;
	long mobile;
	float waight;
	String problem;
	String address;
	
}
