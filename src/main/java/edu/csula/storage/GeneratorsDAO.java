package edu.csula.storage;

import java.util.Collection;

import edu.csula.models.Generator;

/**
 * EventsDAO defines the database access layer between the business layer and
 * the database layer
 */
public interface GeneratorsDAO {
	/**
	 * Find all generators
	 */
	public Collection<Generator> getAll();
	/**
	 * Change a generator given its id
	 */
	public void set(int id, Generator generator);
	/**
	 * addEvent adds a new generator to database storage
	 */
	public void add(Generator generator);
}
