package edu.csula.web.services;

import javax.ws.rs.core.Application;
import org.glassfish.jersey.test.JerseyTest;
import org.glassfish.jersey.server.ResourceConfig;

import org.junit.*;
import static org.junit.Assert.*;

public class HelloServiceTest extends JerseyTest {
    @Override
    protected Application configure() {
        return new ResourceConfig(HelloService.class);
    }

    @Test
    public void test() {
        final String hello = target("/v1/hello").request().get(String.class);
        assertEquals("Hello, JAX-RS", hello);
    }
}
