package org.jecm19.servletApp;
import java.io.*;
import javax.servlet.*;
public class FirstServlet extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		
		
		
		
		String name=req.getParameter("nm");
		String place=req.getParameter("pl");
		PrintWriter out =resp.getWriter();
		System.out.println(System.getProperty("file.encoding"));
		
		System.out.println(place);
		out.print("<html><body bgcolor ='yellow' >"
				+ "<h1> Welcome"+name+" "+place+"</h1>"
						+ "<body></html>");
		out.flush();
		out.close();
		
	}

}
