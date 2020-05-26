package com.gobeyond.firebase.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FirebaseConfigurationPro {

	@Value("${firebase.service-account-filename}")
	private String serviceAccountFilename;

	@Value("${firebase.realtime-database-url}")
	private String realtimeDatabaseUrl;

	public String getServiceAccountFilename() {
		return serviceAccountFilename;
	}

	public void setServiceAccountFilename(String serviceAccountFilename) {
		this.serviceAccountFilename = serviceAccountFilename;
	}

	public String getRealtimeDatabaseUrl() {
		return realtimeDatabaseUrl;
	}

	public void setRealtimeDatabaseUrl(String realtimeDatabaseUrl) {
		this.realtimeDatabaseUrl = realtimeDatabaseUrl;
	}

}
