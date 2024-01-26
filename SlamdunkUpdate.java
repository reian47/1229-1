package slayers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SlamdunkUpdate {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/firm";
		String id = "root";
		String pass = "mysql";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection(url,id,pass);
		Statement stmt = conn.createStatement();
		String sql = "update emp set sal = 4500 where ename = '김하나'";
		int result = stmt.executeUpdate(sql);
		if (result >= 1) {
			System.out.println("수정성공!"+result);
		} else {
			System.out.println("수정실패!"+result);
		}

	}

}