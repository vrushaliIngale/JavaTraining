package com.zensar;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class HelloController1 extends HttpServlet {
	
	public void doGet(HttpServletRequest request , HttpServletResponse reponse) {
		
		String  rollno = request.getParameter("rollNumber");
		System.out.println("Roll Number  : " + rollno);
			
		String  name = request.getParameter("studentName");
		System.out.println(" Student Name  : " + name);
		
		String  age = request.getParameter("studentAge");
		System.out.println("Student's Age  : " + age);
			
		String  course = request.getParameter("course");
		System.out.println("Course Name  : " + course);
	
		String  courseDuration = request.getParameter("courseDuration");
		System.out.println("Course Duration: " + courseDuration);
		
		RequestDispatcher rd = request.getRequestDispatcher("result1.jsp");
		request.setAttribute("rollno", rollno);
		request.setAttribute("name", name);
		request.setAttribute("age", age);
		request.setAttribute("course", course);
		request.setAttribute("courseDuration", courseDuration);

		
		try {
			rd.forward(request, reponse);
		} catch (Exception e) {
			System.out.println("Exception Ocuured : " + e);
		}				
	}
}