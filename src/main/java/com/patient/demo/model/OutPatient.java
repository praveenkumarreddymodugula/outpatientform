package com.patient.demo.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class OutPatient {


	@Id
	@GeneratedValue
	@Column(name="patientid")
	private Long id;
	
	@Column(name="enterdate")
	private LocalDateTime  enterdate;
	
	@Column(name="expiredate")
	private LocalDate expiredate;
	
	@Column(name="patientname")
	private String patientName;
	
	@Column(name="age")
	private Integer age;
	
	@Column(name="dateofbirth")
	private LocalDate dateofbirth;
	
	@Column(name="problem")
	private String problem;
	
	@Column(name="mobile")
	private Long mobile;
	
	@Column(name="weight")
	private Float weight;
	
	@Column(name="address")
	private String address;
}

