package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Mysql8Connection {

	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/woongjin?characterEncoding=UTF-8&serverTimezone=UTC";
	private static final String USER = "scott";
	private static final String PASSWORD = "Admin1!";
	
	static Connection conn = null;
	
	private static Mysql8Connection mc;
	
	public static Mysql8Connection getInstance() {
		if (mc==null) mc = new Mysql8Connection();
		return mc;
	}
	
	public static Connection getConnection() {
		try {
			Class.forName(DRIVER);
			
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			// autocommit 해제  - mysql8은 autocommit=true가 default
			conn.setAutoCommit(false);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("드라이버 로딩 실패");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("DBMS 연결 실패");
		}
		
		return conn;
	}	
}














