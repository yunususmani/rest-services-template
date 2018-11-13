package org.project.controllers;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import org.project.services.IService;
import org.springframework.beans.factory.annotation.Autowired;

@Path("/")
public class Controller {


    @Autowired
    private IService service;

    @GET
    @Path("/test")
    @Produces("application/json")
    public Response method(@QueryParam("param1") String param1, @QueryParam("param2") String param2) 
    {
    	service.method1(param1);
    	
    	
    	return Response.status(200).entity("ok").build();

    }
}
