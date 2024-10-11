package model;

import action.Action;
import dao.BoardDAO;
import dao.UserMemberDAO;
import dto.BoardDTO;
import dto.UserMemberDTO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// model
public class InsertBoardAction implements Action {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		
		String id = req.getParameter("id");
		String title = req.getParameter("title");
		String detail = req.getParameter("detail");

		
		BoardDTO dto = new BoardDTO(id, title, detail);
		BoardDAO dao = new BoardDAO();
		
		int result = dao.insertBoard(dto);
		
		if (result==1) {
			
			req.setAttribute("user", dto);
			
			return "/boardList.jsp";
		}else {
			return "/boardWrite.jsp";
			
		}// if end	
		
	}// execute() end

}








