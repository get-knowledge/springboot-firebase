package com.gobeyond.firebase.repository;

import org.springframework.stereotype.Repository;

import com.gobeyond.firebase.model.Patient;
import com.gobeyond.firebase.util.repository.DefaultFirebaseRealtimeDatabaseRepository;

@Repository
public class PatientRepository extends DefaultFirebaseRealtimeDatabaseRepository<Patient, String> {

}
