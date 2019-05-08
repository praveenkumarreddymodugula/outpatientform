package com.patient.demo.resporisty;

import org.springframework.data.jpa.repository.JpaRepository;

import com.patient.demo.model.OutPatient;

public interface OutPatientRepository  extends JpaRepository<OutPatient, Long>{

}
