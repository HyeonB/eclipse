package control;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.LoginAction;

@WebServlet("/login.do")
public class LoginControl extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
		rd.forward(req, resp);	
	}	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// 모델 호출
		LoginAction la = new LoginAction();
		String viewPage = la.execute(req, resp);
		
		// forwarding
		RequestDispatcher rd = req.getRequestDispatcher(viewPage);
		rd.forward(req, resp);		
	}// doPost() end
	
}














