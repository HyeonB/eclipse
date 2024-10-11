package dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import connection.Mysql8Connection;
import dto.UserMemberDTO;

public class UserMemberDAO {
	
	StringBuffer sb = new StringBuffer();
	ResultSet rs = null;
	PreparedStatement pstmt = null;
	Connection conn = null;
	
	public UserMemberDAO() {
		conn = Mysql8Connection.getInstance().getConnection();
		System.out.println("conn : "+ conn);
	}
	
	// 계정 등록 메소드
	public int insertUsers(UserMemberDTO dto) {
		
		sb.setLength(0);
		sb.append("insert into user ");
		sb.append("values (?, ?, ?, now(), ?, ? )");
		
		int result = -1;		
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, dto.getId());
			pstmt.setString(2, dto.getPass());
			pstmt.setString(3, dto.getName());
			pstmt.setString(4, dto.getGender());
			pstmt.setString(5, dto.getPhone());		
			
			result = pstmt.executeUpdate();
			
			if (result==1) {     // 위 DML에 이상이 없으면
				conn.commit();
			}		
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return result;
	}
	
public int userCheck(String id, String pass, String lev) {
		
		int result = 1;
		
		sb.setLength(0);
		sb.append("select * from user ");
		sb.append("where id = ? ");
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, id);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				if (pass.equals(rs.getString("pass"))){
					result = 2;          // ID, PASS, LEV(A) 전부 일치 => 운영자 계정임이 확인됨.
				}else {
					result = 0;          // PASS 또는 LEV을 잘못 입력되었다.
				}
			}else {
				result = -1;     // 해당 계정 ID가 테이블에 존재하지 않는다.
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}// userCheck() end
	
	public UserMemberDTO getUser(String id) {
		
		sb.setLength(0);
		sb.append("select * from user ");
		sb.append("where id = ? ");
		
		UserMemberDTO dto = null;
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, id);
			
			rs = pstmt.executeQuery();
			
			rs.next();
			
			String pass = rs.getString(2);
			String name = rs.getString(3);
			String enter = rs.getString(4);
			String gender = rs.getString(5);
			String phone = rs.getString(6);
			
			dto = new UserMemberDTO(id, pass, name,enter, gender, phone);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dto;
	}
	public ArrayList<UserMemberDTO> getAllUsers(){
		
		ArrayList<UserMemberDTO> list = new ArrayList<UserMemberDTO>();
		
		sb.setLength(0);
		sb.append("select * from user ");
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String id = rs.getString(1);
				String pass = rs.getString(2);
				String name = rs.getString(3);
				String enter = rs.getString(4);
				String gender = rs.getString(5);
				String phone = rs.getString(6);
				
				UserMemberDTO dto = new UserMemberDTO(id, pass, name, enter, gender, phone);
				
				list.add(dto);			
			}			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}// getAllUsers() end
	
	// 계정 정보 수정 - (비밀번호, 전화번호)
	public int updateInfo(UserMemberDTO dto) {
		
		sb.setLength(0);
		sb.append("update user ");
		sb.append("set pass = ?, phone = ?, enter = now() ");
		sb.append("where id = ? ");
		
		int result = 0;
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, dto.getPass());
			pstmt.setString(2, dto.getPhone());
			pstmt.setString(3, dto.getId());
			
			result = pstmt.executeUpdate();
			
			if(result == 1) {
				conn.commit();				
			}			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return result;
	}// updateInfo() end
	
	
	
}// class end















