package ncpproject.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import ncpproject.model.employee;

/**
 * Servlet implementation class employeeEdit
 */
@WebServlet("/edit")
public class employeeEdit extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ncpproject.dao.editEmployee empd= new ncpproject.dao.editEmployee();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public employeeEdit() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/views/editEmployee.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		String memberid=request.getParameter("memberid");
		String age=request.getParameter("age");
		String email=request.getParameter("email");
		employee emp=new employee();
		emp.setName(name);
		emp.setAge(age);
		emp.setEmail(email);
		emp.setPassword(password);
		emp.setMemberID(memberid);
		
		
		try {
			empd.editEmployee(emp);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		response.sendRedirect("");
		RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/views/employeedetails.jsp");
		dispatcher.forward(request, response);
	}

}
