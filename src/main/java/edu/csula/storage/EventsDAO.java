package edu.csula.storage;

import java.util.Collection;

import edu.csula.models.Event;

/**
 * EventsDAO defines the database access layer between the business layer and
 * the database layer
 */
public interface EventsDAO {
	/**
	 * Find all events given storage
	 */
	public Collection<Event> getAll();
	/**
	 * Change a event given its id
	 */
	public void set(int id, Event event);
	/**
	 * addEvent adds a new event to database storage layer
	 */
	public void add(Event event);
}
