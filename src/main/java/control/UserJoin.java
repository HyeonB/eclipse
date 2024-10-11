package control;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.InsertUserAction;

@WebServlet("/user.do")
public class UserJoin extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");
		
		// 계정 등록 작업을 수행할 수 있는 모델 호출
		InsertUserAction ia = new InsertUserAction();
		
		String viewPage = ia.execute(req, resp);
		
		// view forwarding
		RequestDispatcher rd = req.getRequestDispatcher(viewPage);		
		rd.forward(req, resp);		
	}// doPost() end
	
}













