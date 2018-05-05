
package edu.csula.web.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/v1/events")
public class EventsService {
    @GET
    @Path("hello")
    @Produces(MediaType.APPLICATION_JSON)
    public String sayHello() {
        return "Hello, events";
    }
}
