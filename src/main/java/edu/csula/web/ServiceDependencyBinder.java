package edu.csula.web;

import org.glassfish.hk2.utilities.binding.AbstractBinder;

import edu.csula.storage.Database;
import edu.csula.storage.EventsDAO;
import edu.csula.storage.mysql.EventsDAOImpl;

public class ServiceDependencyBinder extends AbstractBinder {
    @Override
    protected void configure() {
        bind(Database.class).to(edu.csula.storage.mysql.Database.class);
        bind(EventsDAO.class).to(EventsDAOImpl.class);
    }
}
