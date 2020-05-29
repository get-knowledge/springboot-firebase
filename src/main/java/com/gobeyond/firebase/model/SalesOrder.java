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
@FirebaseDocument("/SalesOrder")
public class SalesOrder {

	@FirebaseId
	private String id;
	
	private String orderDate;
	
	private String region;
	
	private String rep;
	
	private String item;
	
	private String units;
	
	private String unitCost;
	
	private String total; 	


}
