package com.lakeheadu.pcare.utilities;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.dummycreator.DummyCreator;
import org.joda.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.lakeheadu.pcare.models.Doctor;
import com.lakeheadu.pcare.models.Patient;
import com.lakeheadu.pcare.models.Staff;
import com.lakeheadu.pcare.services.PatientService;

@Component
public class DummyDataCreator implements ApplicationListener<ContextRefreshedEvent> 
{
	private PatientService patientService;
	
	private DummyDataCreator dummyDataCeator;

	private List<Patient> patients = new ArrayList<Patient>();
	private List<Doctor> doctors = new ArrayList<Doctor>();
	private List<Staff> staffMembers = new ArrayList<Staff>();
	
	public PatientService getPatientService() {
		return patientService;
	}

	@Autowired
	public void setPatientService(PatientService patientService) {
		this.patientService = patientService;
	}
	
	@Autowired
	public void setDummyDataCreator(DummyDataCreator dummyDataCeator) {
		this.dummyDataCeator = dummyDataCeator;
	}
	

	@Override
	public void onApplicationEvent(ContextRefreshedEvent arg0) {
		
		System.out.println("Starting data loading");
		patients = dummyDataCeator.getAllDummyPatientsData();
		patientService.savePatients(patients);
		
	}
	
	public List<Patient> getAllDummyPatientsData()
	{
		
		Patient patient1 = new Patient("Gaurav Sharma", 25, new LocalDate (1991, 12, 11), true, "John Street", "Thunder Bay", "gaurav.sharma19@yahoo.com", "Ontario", 5, "8077082057");
		Patient patient2 = new Patient("Siddhant", 25, new LocalDate (1991, 12, 11), true, "Phillip Street", "Toronto", "sid19@yahoo.com", "Ontario", 5, "8072552672");
		Patient patient3 = new Patient("S grewal", 25, new LocalDate (1991, 12, 11), true, "Pasteur Street", "Waterloo", "grewal@yahoo.com", "Ontario", 5, "8073562057");
		Patient patient4 = new Patient("Harish", 25, new LocalDate (1991, 12, 11), true, "Oliver Road", "Hamilton", "harish@yahoo.com", "Ontario", 5, "8074567980");
		Patient patient5 = new Patient("Popat Laal ", 25, new LocalDate (1991, 12, 11), true, "Machar Street", "Windsor", "pacre@yahoo.com", "Ontario", 5, "8074782667");
		Patient patient6 = new Patient("Bob", 25, new LocalDate (1991, 12, 11), true, "Mcbean Street", "Kingston", "adminlte@yahoo.com", "Ontario", 5, "8073562607");
		Patient patient7 = new Patient("Jacky", 25, new LocalDate (1991, 12, 11), true, "Rupert Street", "Kitchener", "sarwagya@yahoo.com", "Ontario", 5, "8077082603");
		Patient patient8 = new Patient("Bruce", 25, new LocalDate (1991, 12, 11), true, "Algoma South", "Missisauga", "ameya@yahoo.com", "Ontario", 5, "8073451837");
		Patient patient9 = new Patient("John", 25, new LocalDate (1991, 12, 11), true, "Red river", "Orillia", "atish@yahoo.com", "Ontario", 5, "8077869810");
		Patient patient10 = new Patient("Ujjval", 25, new LocalDate (1991, 12, 11), true, "Varsity row", "Oshawa", "ujjval@yahoo.com", "Ontario", 5, "8072226780");
		
		patients.add(patient1);
		patients.add(patient2);
		patients.add(patient3);
		patients.add(patient4);
		patients.add(patient5);
		patients.add(patient6);
		patients.add(patient7);
		patients.add(patient8);
		patients.add(patient9);
		patients.add(patient10);
		
		return patients;
	}
	
	public List<Doctor> getAllDummyDoctorsData()
	{
//		Doctor doctor1 = new Doctor("Richard", "Neurosurgeon", new LocalDate (1991, 12, 11), true, "John Street", "Thunder Bay", "Ontario", "8073569230", "rich45@gmail.com", patient1);
//		Doctor doctor2 = new Doctor("Michael", "Addiction psychiatrist", new LocalDate (1954, 01, 26), true, "Applewood", "Hamilton", "Ontario", "8073569452", "drmike1954@gmail.com", patient1);
//		Doctor doctor3 = new Doctor("Leon", "Adolescent medicine specialist", new LocalDate (1970, 12, 11), true, "Red river", "Kingston", "Ontario", "8074269230", "Leon48@gmail.com", patient1);
//		Doctor doctor4 = new Doctor("Melissa", "Allergist", new LocalDate (1962, 12, 11), true, "Varsity row", "Oshawa", "Ontario", "8022569230", "Melken@yahoo.com", patient1);
//		Doctor doctor5 = new Doctor("Tom", "Anesthesiologist", new LocalDate (1991, 12, 11), true, "Machar Street", "Windsor", "Ontario", "8074039230", "tommy5@gmail.com", patient1);
//		Doctor doctor6 = new Doctor("Richard", "Cardiologist", new LocalDate (1991, 12, 11), true, "John Street", "Thunder Bay", "Ontario", "8073569230", "rich45@gmail.com", patient1);
//		Doctor doctor7 = new Doctor("Richard", "Cardiovascular surgeon", new LocalDate (1991, 12, 11), true, "John Street", "Thunder Bay", "Ontario", "8073569230", "rich45@gmail.com", patient1);
//		Doctor doctor8 = new Doctor("Richard", "Cardiologist", new LocalDate (1991, 12, 11), true, "John Street", "Thunder Bay", "Ontario", "8073569230", "rich45@gmail.com", patient1);
//		Doctor doctor9 = new Doctor("Richard", "Radiologist", new LocalDate (1991, 12, 11), true, "John Street", "Thunder Bay", "Ontario", "8073569230", "rich45@gmail.com", patient1);
//		Doctor doctor10 = new Doctor("Richard", "Cardiologist", new LocalDate (1991, 12, 11), true, "John Street", "Thunder Bay", "Ontario", "8073569230", "rich45@gmail.com", patient1);
		
//		doctors.add(doctor1);
//		doctors.add(doctor2);
//		doctors.add(doctor3);
//		doctors.add(doctor4);
//		doctors.add(doctor5);
//		doctors.add(doctor6);
//		doctors.add(doctor7);
//		doctors.add(doctor8);
//		doctors.add(doctor9);
//		doctors.add(doctor10);
		
		return doctors;
	}
	
	public List<Staff> getAllDummyStaffData()
	{
		Staff staff1 = new DummyCreator().create(Staff.class);
		Staff staff2 = new DummyCreator().create(Staff.class);
		Staff staff3 = new DummyCreator().create(Staff.class);
		Staff staff4 = new DummyCreator().create(Staff.class);
		Staff staff5 = new DummyCreator().create(Staff.class);
		Staff staff6 = new DummyCreator().create(Staff.class);
		Staff staff7 = new DummyCreator().create(Staff.class);
		Staff staff8 = new DummyCreator().create(Staff.class);
		Staff staff9 = new DummyCreator().create(Staff.class);
		Staff staff10 = new DummyCreator().create(Staff.class);
		Staff staff11 = new DummyCreator().create(Staff.class);
		Staff staff12 = new DummyCreator().create(Staff.class);
		Staff staff13 = new DummyCreator().create(Staff.class);
		Staff staff14 = new DummyCreator().create(Staff.class);
		Staff staff15 = new DummyCreator().create(Staff.class);
		Staff staff16 = new DummyCreator().create(Staff.class);
		Staff staff17 = new DummyCreator().create(Staff.class);
		Staff staff18 = new DummyCreator().create(Staff.class);
		Staff staff19 = new DummyCreator().create(Staff.class);
		Staff staff20 = new DummyCreator().create(Staff.class);
		
		staffMembers.add(staff1);
		staffMembers.add(staff2);
		staffMembers.add(staff3);
		staffMembers.add(staff4);
		staffMembers.add(staff5);
		staffMembers.add(staff6);
		staffMembers.add(staff7);
		staffMembers.add(staff8);
		staffMembers.add(staff9);
		staffMembers.add(staff10);
		staffMembers.add(staff11);
		staffMembers.add(staff12);
		staffMembers.add(staff13);
		staffMembers.add(staff14);
		staffMembers.add(staff15);
		staffMembers.add(staff16);
		staffMembers.add(staff17);
		staffMembers.add(staff18);
		staffMembers.add(staff19);
		staffMembers.add(staff20);
		
		return staffMembers;
	}

}