package com.gobeyond.firebase.api;

import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gobeyond.firebase.model.Patient;
import com.gobeyond.firebase.service.PatientService;

@RestController
public class PatientController {

	@Autowired
	PatientService patientService;

	@GetMapping("/getPatientDetails")
	public Patient getPatient(@RequestParam String name) throws InterruptedException, ExecutionException {
		return patientService.getPatientDetails(name);
	}

	@PostMapping("/createPatient")
	public String createPatient(@RequestBody Patient patient) throws InterruptedException, ExecutionException {
		return patientService.savePatientDetails(patient);
	}

	@PutMapping("/updatePatient")
	public String updatePatient(@RequestBody Patient patient) throws InterruptedException, ExecutionException {
		return patientService.updatePatientDetails(patient);
	}

	@DeleteMapping("/deletePatient")
	public String deletePatient(@RequestParam String name) {
		return patientService.deletePatient(name);
	}
}
