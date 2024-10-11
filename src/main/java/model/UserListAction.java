package model;

import java.util.ArrayList;

import action.Action;
import dao.UserMemberDAO;
import dto.UserMemberDTO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class UserListAction implements Action {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		
		UserMemberDAO dao = new UserMemberDAO();
		ArrayList<UserMemberDTO> list = dao.getAllUsers();
		
		req.setAttribute("list", list);		
		
		return "/userList.jsp";
	}

}









