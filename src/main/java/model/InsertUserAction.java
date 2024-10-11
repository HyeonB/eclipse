package model;

import action.Action;
import dao.UserMemberDAO;
import dto.UserMemberDTO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// model
public class InsertUserAction implements Action {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		
		String id = req.getParameter("id");
		String pass = req.getParameter("pass");
		String name = req.getParameter("name");
		String gender = req.getParameter("gender");
		String phone = req.getParameter("phone");
		
		UserMemberDTO dto = new UserMemberDTO(id, pass, name, gender, phone);
		UserMemberDAO dao = new UserMemberDAO();
		
		int result = dao.insertUsers(dto);
		
		if (result==1) {
			
			req.setAttribute("user", dto);
			
			return "/newUser.jsp";
		}else {
			return "/userJoin.jsp";
			
		}// if end	
		
	}// execute() end

}








