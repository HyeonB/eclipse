package dao;

import java.util.ArrayList;

import dto.UserMemberDTO;

public class UnitTest {
	public static void main(String[] args) {
		UserMemberDAO dao = new UserMemberDAO();
		
		// 계정 등록 test
		/*
		 * UserMemberDTO dto = new UserMemberDTO(); dto.setId("hong");
		 * dto.setPass("1234"); dto.setName("gildong"); dto.setLev("A");
		 * dto.setGender("1"); dto.setPhone("010-1111-2222");
		 * 
		 * int result = dao.insertUsers(dto);
		 * 
		 * System.out.println("계정 등록 상황 : "+ result);
		 */
		
		// 계정 체크 test
		/*
		 * int result = dao.userCheck("lee", "4567", "B");
		 * 
		 * System.out.println("result : "+ result);
		 */
		
		// 전체 계정 정보 확인
		/*
		 * UserMemberDTO dto = new UserMemberDTO();
		 * 
		 * ArrayList<UserMemberDTO> list = dao.getAllUsers();
		 * 
		 * for (UserMemberDTO userMemberDTO : list) {
		 * System.out.println(userMemberDTO.getId()); }
		 */
		
		
		// 계정 정보 수정 test
		/*
		 * UserMemberDTO dto = new UserMemberDTO(); dto.setId("hong");
		 * dto.setPass("2222"); dto.setPhone("010-2222-2222");
		 * 
		 * int result = dao.updateInfo(dto);
		 * 
		 * System.out.println("result : "+ result);
		 */
		
	}
}











