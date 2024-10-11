package model;

import action.Action;
import dao.UserMemberDAO;
import dto.UserMemberDTO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class UpdateInfoAction implements Action {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		
		HttpSession session = req.getSession();
		
		UserMemberDTO loginedUser = (UserMemberDTO)session.getAttribute("emp");
		
		String id = loginedUser.getId();
		String pass = req.getParameter("pass");
		String phone = req.getParameter("phone");
		
		
		UserMemberDAO dao = new UserMemberDAO();
		
		UserMemberDTO dto = new UserMemberDTO();
		dto.setId(id);
		dto.setPass(pass);
		dto.setPhone(phone);
		
		dao.updateInfo(dto);	
		
		return "mypageOk.jsp";
	}
	
}



