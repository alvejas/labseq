package com.app;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.Spliterator;

@Path("/hello")
public class Controller {

    Operations operations = new Operations();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public int hello() {
        return operations.labseqOperation(2);
    }
}
