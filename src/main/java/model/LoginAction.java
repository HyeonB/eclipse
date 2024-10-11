package model;

import action.Action;
import dao.UserMemberDAO;
import dto.UserMemberDTO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class LoginAction implements Action {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		
		String id = req.getParameter("id");
		String pass = req.getParameter("pass");
		String lev = req.getParameter("lev");
		
		String viewPage = null;
		
		int result = 0;
		
		UserMemberDAO dao = new UserMemberDAO();
		result = dao.userCheck(id, pass, lev);
		
		// 이상이 없다면 로그인이 되도록 처리
		if (result == 2 || result == 3) {
		   UserMemberDTO dto = dao.getUser(id);
		   
		   HttpSession session = req.getSession();
		   
		   session.setAttribute("emp", dto);
		   session.setAttribute("result", result);
		   
		   viewPage = "/main.jsp";			
		}else {
		   viewPage = "/login.jsp";	
		   req.setAttribute("msg", "로그인 거부되었습니다.");
		}
		return viewPage;
	}

}










