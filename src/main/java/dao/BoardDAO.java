package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import connection.Mysql8Connection;
import dto.BoardDTO;

public class BoardDAO {
	StringBuffer sb = new StringBuffer();
	ResultSet rs = null;
	PreparedStatement pstmt = null;
	Connection conn = null;
	
	public BoardDAO() {
		conn = Mysql8Connection.getInstance().getConnection();
		System.out.println("conn : "+ conn);
	}
	
	public int insertBoard(BoardDTO dto) {
		
		sb.setLength(0);
		sb.append("insert into BOARD (ID, TITLE, DETAIL) ");
		sb.append("values (?, ?, ?");
		
		int result = -1;		
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, dto.getId());
			pstmt.setString(2, dto.getTitle());
			pstmt.setString(3, dto.getDetail());
		
			
			result = pstmt.executeUpdate();
			
			if (result==1) {
				conn.commit();
			}		
			
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		return result;
	}

	public BoardDTO getBoard(String no) {
		
		sb.setLength(0);
		sb.append("select * from board ");
		sb.append("where no = ? ");
		
		BoardDTO dto = null;
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, no);
			
			rs = pstmt.executeQuery();
			
			rs.next();
			String num = rs.getString(1); 
			String id = rs.getString(2);
			String title = rs.getString(3);
			String detail = rs.getString(4);
			String enter = rs.getString(5);
			
			dto = new BoardDTO(num, id, title, detail, enter);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dto;
	}
	public ArrayList<BoardDTO> getAllBoard(){
		
		ArrayList<BoardDTO> list = new ArrayList<BoardDTO>();
		
		sb.setLength(0);
		sb.append("select * from board ");
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String num = rs.getString(1); 
				String id = rs.getString(2);
				String title = rs.getString(3);
				String detail = rs.getString(4);
				String enter = rs.getString(5);
				
				BoardDTO dto = new BoardDTO(num, id, title, detail, enter);
				
				list.add(dto);			
			}			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public ArrayList<BoardDTO> getUserBoard(String id){
		
		ArrayList<BoardDTO> list = new ArrayList<BoardDTO>();
		
		sb.setLength(0);
		sb.append("select * from board where id = ? ");
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, id);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String num = rs.getString(1); 
				String title = rs.getString(3);
				String detail = rs.getString(4);
				String enter = rs.getString(5);
				
				BoardDTO dto = new BoardDTO(num, id, title, detail, enter);
				
				list.add(dto);			
			}			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	
	
}
