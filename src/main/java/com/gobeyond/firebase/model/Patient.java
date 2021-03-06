package com.gobeyond.firebase.model;

import com.gobeyond.firebase.document.FirebaseDocument;
import com.gobeyond.firebase.document.FirebaseId;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FirebaseDocument("/patient")
public class Patient {

	@FirebaseId
	private String id;

	private String name;

	private int age;

	private String city;

}
