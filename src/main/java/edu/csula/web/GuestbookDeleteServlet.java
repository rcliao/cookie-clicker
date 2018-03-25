package edu.csula.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.csula.models.GuestbookEntry;

@WebServlet("/guestbook/delete")
public class GuestbookDeleteServlet extends HttpServlet {
	public void doGet( HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<GuestbookEntry> entries = (ArrayList<GuestbookEntry>) getServletContext().getAttribute("guestbook-entries");
		int id = Integer.parseInt(request.getParameter("id"));
		for (int i = 0; i < entries.size(); i++) {
			if (entries.get(i).getId() == id) {
				entries.remove(i);
			}
		}
		response.sendRedirect("/guestbook");
	}
}
