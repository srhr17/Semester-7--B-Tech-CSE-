package ncpproject.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import ncpproject.dao.employeeDisplayDao;
import ncpproject.model.employee;
/**
 * Servlet implementation class displayProfile
 */
@WebServlet("/display")
public class displayProfile extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private employeeDisplayDao empd= new employeeDisplayDao();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public displayProfile() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/views/displayEmployee.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		String memberid=request.getParameter("memberid");
		employee emp=new employee();
		emp.setMemberID(memberid);
		PrintWriter out=response.getWriter();
		try {
			
			String val=empd.displayEmployee(emp);
			out.println(val);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
