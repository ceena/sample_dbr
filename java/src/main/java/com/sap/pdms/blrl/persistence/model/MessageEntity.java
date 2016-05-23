/**
 * 
 */
package com.sap.dbr.blrl.persistence.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author i058650
 *
 */
@Entity
@Table(name = "\"com.sap.dbr.blrl::HelloWorld.MESSAGE\"")
public class MessageEntity implements Serializable {

	private static final long serialVersionUID = -9112426137829014339L;

	@Id
	@Column(name = "\"REASON\"")
	private String reason;

	@Column(name = "\"DESCRIPTION\"")
	private String description;

	public MessageEntity() {
	}

	public MessageEntity(String reason, String description) {
		this.reason = reason;
		this.description = description;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}