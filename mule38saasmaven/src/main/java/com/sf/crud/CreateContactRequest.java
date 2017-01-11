package com.sf.crud;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.mule.api.MuleEventContext;
import org.mule.api.lifecycle.Callable;
// http://localhost:8080/create
public class CreateContactRequest implements Callable {
	
	@Override
	public Object onCall(MuleEventContext eventContext)	throws Exception {
		HashMap<String,Object> contactSObjectFields = new HashMap<String,Object>(); 
		// sObject is defined as a map
		contactSObjectFields.put("FirstName", "Nivi");
		contactSObjectFields.put("LastName", "Kundem");
		contactSObjectFields.put("MobilePhone", "0000"); 
		contactSObjectFields.put("Email", "nivi.kundem@bp.com"); 
		// list of sobjects to be created 
		List<HashMap<String,Object>> objects = new ArrayList<HashMap<String,Object>>();
		objects.add(contactSObjectFields); 
		// map that will be placed as payload 
		HashMap<String,Object> payload = new HashMap<String,Object>();
		payload.put("type", "Contact");
		payload.put("objects", objects); 
		return payload; 
		
	}




}
