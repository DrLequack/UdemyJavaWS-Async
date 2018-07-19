package com.spring.restws;

import javax.ws.rs.BadRequestException;
import javax.ws.rs.container.AsyncResponse;

import org.springframework.stereotype.Service;

import com.spring.restws.model.ChecksList;

@Service
public class CheckProcessorImpl implements CheckProcessor {

	@Override
	public void processChecks(AsyncResponse response, ChecksList checks) 
	{
		new Thread(() -> { 	
							if(checks == null || checks.getChecks() == null || checks.getChecks().size() == 0)
							{
								response.resume(new BadRequestException());
							}
							response.resume(true);
						 }) .start();
	}

}
