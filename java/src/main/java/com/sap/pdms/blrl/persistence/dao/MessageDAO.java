/**
 * 
 */
package com.sap.dbr.blrl.persistence.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.sap.dbr.blrl.persistence.model.MessageEntity;

/**
 * @author i058650
 *
 */
@Stateless
public class MessageDAO {
	
	@PersistenceContext(name = "hello-world-persistence")
	   EntityManager em;


	   public MessageEntity store(MessageEntity message) {
	       em.merge(message);
	       return message;
	   }


}
