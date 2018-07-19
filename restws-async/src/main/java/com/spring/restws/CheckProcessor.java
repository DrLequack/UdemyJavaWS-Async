package com.spring.restws;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.container.AsyncResponse;
import javax.ws.rs.container.Suspended;

import com.spring.restws.model.ChecksList;

@Consumes("application/xml,application/json")
@Produces("application/xml,application/json")
@Path("/checksprocessor")
public interface CheckProcessor 
{	
	@Path("/checks")
	@POST
	void processChecks(@Suspended AsyncResponse response, ChecksList checks);
}
