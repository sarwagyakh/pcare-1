package com.lakeheadu.pcare.services;

import java.util.List;

import com.lakeheadu.pcare.models.Patient;

public interface PatientService 
{
	public boolean savePatient(Patient patient);
	
	public List<Patient> getAllPatients();
	
	public Patient getPatient(String emailId);
	
	public boolean savePatients(List<Patient> patient);
}
