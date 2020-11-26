package ncpproject.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class dashboardServelet
 */
@WebServlet("/")
public class dashboardServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public dashboardServelet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//		RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/views/dashboard.jsp");
//		dispatcher.forward(request, response);
		PrintWriter out=response.getWriter();
		out.println("<html> <head> <meta charset=\"ISO-8859-1\"> <title>Dashboard</title> <style type=\"text/css\"> * { margin: 0; padding: 0; font-family: consolas; user-select: none; } body { justify-content: center; align-items: center; background: linear-gradient(270deg, #000000, #e7e7e7, #348f9b); background-size: 600% 600%; animation: changeBackground 30s ease infinite; /* animation-duration,animation-timing-function-cubic bezier,animation-iteration-count */ } @keyframes changeBackground { 0% { background-position: 0% 50%; } 50% { background-position: 100% 50%; } 100% { background-position: 0% 50%; } } input, select, .want { position: relative; width: 100%; height: 60px; border: none; margin: 15px 0 20px; background: transparent; outline: none; padding: 0 20px; font-size: 24px; letter-spacing: 4px; box-sizing: border-box; /* padding and border are included in the width and height */ border-radius: 8px; box-shadow: -4px -4px 10px black, inset 4px 4px 10px rgba(0, 0, 0, 0.09), inset -4px -4px 10px rgba(255, 255, 255, 1), 4px 4px 10px rgba(0, 0, 0, 0.09); } .wanttitle { font-size: 20px; color: #333; } .inputBox input { position: relative; width: 100%; height: 60px; border: none; margin: 15px 0 20px; background: transparent; outline: none; padding: 0 20px; font-size: 24px; letter-spacing: 4px; box-sizing: border-box; border-radius: 8px; color: #333; box-shadow: -4px -4px 10px rgba(255, 255, 255, 1), inset 4px 4px 10px rgba(0, 0, 0, 0.09), inset -4px -4px 10px rgba(255, 255, 255, 1), 4px 4px 10px rgba(0, 0, 0, 0.09); } .inputBox #btn { position: relative; cursor: pointer; color: #fff; background: #333; font-size: 16px; display: inline-block; padding: 10px 15px; border-radius: 8px; } .inputBox #btn:active { background: #9c27b0; } .container1 { margin: 6%; border-radius: 10px; background-color: #f2f2f2; padding: 10px; } @import url(\"https://fonts.googleapis.com/css?family=Raleway:400,400i,700\"); ul { display: flex; flex-direction: column; align-items: start; list-style-type: none; height: 100vh; justify-content: center; align-items: center; text-align: center; background: #1A1E23; } li { padding: 6px 0; } a { --fill-color: #198CE6; position: relative; display: block; padding: 4px 0; font: 700 3rem Raleway, sans-serif; text-decoration: none; text-transform: uppercase; -webkit-text-stroke: 2px var(--fill-color); background: linear-gradient(var(--fill-color) 0 100%) left / 0 no-repeat; color: transparent; background-clip: text; transition: 0.5s linear; } </style> </head> <body> <div align=\"center\"> <h1>Dashboard</h1> <hr> <ul> <li><a href=\"/ncp-project/dashboard\">Dashboard</a></li> <li><a href=\"/ncp-project/edit\">Profile Edit</a></li> <li><a href=\"/ncp-project/register\">Add/Promote Employee</a></li> <li><a href=\"/ncp-project/adminMessage\">Admin Messages</a></li> <li><a href=\"/ncp-project/remove\">Remove Employee</a></li> <li><a href=\"/ncp-project/display\">Display Profile</a></li> </ul> </div> </body> </html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/views/dashboard.jsp");
		dispatcher.forward(request, response);
	}

}
