/**
 * 
 */
package com.sap.dbr.blrl.service.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


/**
 * @author i058650
 *
 */
@XmlRootElement
public class Message {

	@XmlElement
	private String reason;
	
	@XmlElement
	private String description;
	
	public Message() {
		
	}
	
	public Message(String reason, String description) {
		this.reason = reason;
		this.description = description;
	}
	
	public String getReason() {
		return reason;
	}
	
	public String getDescription() {
		return description;
	}
}
