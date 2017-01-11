package com.sf.crud;

import java.util.HashMap;

import org.mule.api.MuleEventContext;
import org.mule.api.MuleMessage;
import org.mule.api.lifecycle.Callable;
import org.mule.api.transport.PropertyScope;

public class UpdateContactRequest implements Callable {

	@Override
	public Object onCall(MuleEventContext eventContext) throws Exception {
		
		
		HashMap<String,Object> contactSObjectFields = new HashMap<String,Object>(); 
		MuleMessage muleMessage = eventContext.getMessage(); 
		contactSObjectFields.put("FirstName", "Nivi2"); 
		contactSObjectFields.put("LastName", "Kundem2"); 
		contactSObjectFields.put("MobilePhone", "2222"); 
		contactSObjectFields.put("Email", "nivi.kundem2@bp.com"); 
		contactSObjectFields.put("Id", muleMessage.getProperty("sObjectId", PropertyScope.SESSION)); 
		// map that will be placed as payload 
		HashMap<String,Object> payload = new HashMap<String,Object>();
		payload.put("type", "Contact");
		payload.put("object", contactSObjectFields); 
		return payload;
		
		
		
		
		
		
		
		
		
	}

}
