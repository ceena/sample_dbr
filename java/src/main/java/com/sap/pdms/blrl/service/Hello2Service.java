/**
 * 
 */
package com.sap.dbr.blrl.service;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 * @author i058650
 *
 */

@Stateless
@Path("/rest2")
public class Hello2Service {

	@GET
	public Response sayHello() {
		return Response.ok(" Good to see you again..!!!").build();
	}
}
