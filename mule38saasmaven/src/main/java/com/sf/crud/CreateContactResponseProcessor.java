package com.sf.crud;

import java.util.Iterator;
import java.util.List;


import org.mule.api.MuleEventContext;
import org.mule.api.MuleMessage;
import org.mule.api.lifecycle.Callable;

import com.sforce.soap.partner.SaveResult;



public class CreateContactResponseProcessor implements Callable {

	 @SuppressWarnings("unchecked")
	 @Override
	 public Object onCall(MuleEventContext eventContext) throws Exception { 
		// AcknowledgementType ack = new AcknowledgementType(); 
		 MuleMessage message = eventContext.getMessage(); 
		 System.out.println(message.toString());
		 // get the message payload
		 List<SaveResult> saveResults = (List<SaveResult>) message.getPayload(); 
		 Iterator<SaveResult> iter = saveResults.iterator();
		 SaveResult saveResult = iter.next(); 
		 
		 System.out.println(saveResult.getId());
		/* ack.setMessageID(saveResult.getId()); 
		 if(saveResult.getSuccess()) 
			 ack.setStatus("Success"); 
		 else 
			 ack.setStatus("Success");
		 System.out.println(ack); 
		 return ack.getMessageID(); */
		 return saveResult.getId(); 
	 }
}


