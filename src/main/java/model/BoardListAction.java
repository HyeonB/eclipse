package model;

import java.util.ArrayList;

import action.Action;
import dao.BoardDAO;
import dto.BoardDTO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class BoardListAction implements Action {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		
		BoardDAO dao = new BoardDAO();
		ArrayList<BoardDTO> list = dao.getAllBoard();
		
		req.setAttribute("list", list);		
		
		return "/boardList.jsp";
	}

}









