package edu.csula.storage.servlet;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

import javax.servlet.http.HttpSession;

import edu.csula.models.User;
import edu.csula.storage.UsersDAO;

import org.junit.*;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class UsersDAOImplTest {
	private HttpSession context;
	private UsersDAO dao;

	@Before
	public void setup() {
		context = mock(HttpSession.class);
		dao = new UsersDAOImpl(context);
	}

	@Test
	public void authenticate() throws Exception {
		// set up
		when(context.getAttribute(UsersDAOImpl.CONTEXT_NAME)).thenReturn(null);
		// verify
		assertEquals(true, dao.authenticate("admin", "cs3220password"));
		User authenticatedUser = new User(0, "admin", "cs3220password");
		// should set the new user into the HttpSession
		verify(context).setAttribute(UsersDAOImpl.CONTEXT_NAME, authenticatedUser);
	}

	@Test
	public void getAuthenticatedUser() throws Exception {
		// set up
		when(context.getAttribute(UsersDAOImpl.CONTEXT_NAME)).thenReturn(null);
		// verify
		assertEquals(true, dao.authenticate("admin", "cs3220password"));
		User authenticatedUser = new User(0, "admin", "cs3220password");
		// should set the new user into the HttpSession
		verify(context).setAttribute(UsersDAOImpl.CONTEXT_NAME, authenticatedUser);
		// verify
		assertEquals(authenticatedUser, dao.getAuthenticatedUser().get());
	}

	@Test
	public void logout() throws Exception {
		assertEquals(true, dao.authenticate("admin", "cs3220password"));
		dao.logout();
		verify(context).invalidate();
		assertFalse(dao.getAuthenticatedUser().isPresent());
	}
}
