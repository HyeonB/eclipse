package model;

import java.util.ArrayList;

import action.Action;
import dao.BoardDAO;
import dto.BoardDTO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class BoardDetailAction implements Action {
	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		
		BoardDAO dao = new BoardDAO();
		BoardDTO dto;
		
		req.setAttribute("dto", dto);		
		
		return "/boardDetail.jsp";
	}

}
