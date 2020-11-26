package ncpproject.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import ncpproject.dao.employeedao;
import ncpproject.model.employee;
/**
 * Servlet implementation class employeeServlet
 */
@WebServlet("/register")
public class employeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private employeedao empd= new employeedao();
    /**
     * Default constructor. 
     */
    public employeeServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/views/addEmployee.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String department=request.getParameter("department");
		String designation=request.getParameter("designation");
		String age=request.getParameter("age");
		String email=request.getParameter("email");
		employee emp=new employee();
		emp.setName(name);
		emp.setDepartment(department);
		emp.setDesignation(designation);
		emp.setAge(age);
		emp.setEmail(email);
		
		try {
			empd.registerEmployee(emp);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		response.sendRedirect("");
		RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/views/employeedetails.jsp");
		dispatcher.forward(request, response);
	}

}
