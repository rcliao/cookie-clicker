package edu.csula.web;

import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("/api")
public class ServiceApplication extends ResourceConfig {
    public ServiceApplication() {
        register(new ServiceDependencyBinder());
        packages("edu.csula.web.services");
    }
}
