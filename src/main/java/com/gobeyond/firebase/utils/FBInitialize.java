package com.gobeyond.firebase.utils;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;

@Service
public class FBInitialize {
	/*
	 * 
	 * @Value("${app.firebase-config}") private String firebaseConfig;
	 * 
	 * @PostConstruct public void initialize() { try {
	 * 
	 * FirebaseOptions options = new FirebaseOptions.Builder() .setCredentials(
	 * GoogleCredentials.fromStream(new
	 * ClassPathResource(firebaseConfig).getInputStream()))
	 * .setDatabaseUrl("https://fir-and-spring-boot.firebaseio.com").build();
	 * 
	 * FirebaseApp.initializeApp(options); } catch (Exception e) {
	 * e.printStackTrace(); }
	 * 
	 * }
	 */}