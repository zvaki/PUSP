import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.util.Random;

/**
 * Servlet implementation class ReportHistoryPage. 
 *  @author Martin Host
 *  @version 1.0
 */
@WebServlet("/ReportHistoryPage")
public class ReportHistoryPage extends servletBase {
	
	/**
     * @see servletBase#servletBase()
     */
	public ReportHistoryPage() {
		super();
	}
	
	/**
	 * Handles input from the user and displays information. 
	 * 
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//TODO
	}
	
	/**
	 *
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
}