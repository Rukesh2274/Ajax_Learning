package com.service;

import com.bean.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class GetStudentServlet
 */
@WebServlet("/GetStudentServlet")
public class GetStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetStudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		SearchBean sb = new SearchBean();
		HashSet<Student> hs = new HashSet<Student>();
		sb.SearchByCourse(request.getParameter("course"));
		
		HttpSession ses = request.getSession();
		ses.setAttribute("student6", hs);
		response.sendRedirect("result.jsp");
		
		/* 
		
		out.println("Rukesh");
		
		HttpSession ses = request.getSession();
		ses.setAttribute("result", "Rukesh");
		response.sendRedirect("result.jsp");
		
		*/
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
