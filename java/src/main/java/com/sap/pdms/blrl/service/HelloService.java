/**
 * 
 */
package com.sap.dbr.blrl.service;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.sap.dbr.blrl.persistence.dao.MessageDAO;
import com.sap.dbr.blrl.persistence.model.MessageEntity;
import com.sap.dbr.blrl.service.model.Message;

/**
 * @author i058650
 *
 */
@Path("/rest")
public class HelloService {

	@EJB
	MessageDAO messageDAO;
	
	@GET
	@Path("/hello")
	public Response sayHello() {
		
		return Response.ok("Hello World!").build();
		
	}
	
	@GET
	@Path("/helloJSON")
	@Produces(MediaType.APPLICATION_JSON)
	public Response sayHelloJson() {
		
		return Response.ok(new Message("Testing", "Tested")).type(MediaType.APPLICATION_JSON_TYPE).build();
		
	}
	
	@POST
	@Path("/message")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response storeMessage(Message message) {
	   MessageEntity me = messageDAO.store(new MessageEntity(message.getReason(), message.getDescription()));
	   return Response.ok(new Message(me.getReason(), me.getDescription()), MediaType.APPLICATION_JSON_TYPE).build();
	}
}
