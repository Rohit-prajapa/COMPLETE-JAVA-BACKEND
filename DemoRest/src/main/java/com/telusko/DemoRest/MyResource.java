package com.telusko.DemoRest;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

@Path("/myresource")
public class MyResource {

    @GET
    @Produces("text/plain")
    public String getIt() {
        return "Hi there!";
    }
}