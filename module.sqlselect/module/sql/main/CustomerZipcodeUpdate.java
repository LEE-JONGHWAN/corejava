package module.sql.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;



public class CustomerZipcodeUpdate {
	public static Connection getConnection() {
		Connection conn = null;
		String userName = "myself";
		String password = "1234";
		String url = "jdbc:mariadb://localhost:3306/jb_dabang";
		String driver = "org.mariadb.jdbc.Driver";

		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, userName, password);
			return conn;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	private static void navigateCustomerAddress(int 고객SN) {
		StringBuilder sb = new StringBuilder();

		sb.append(" SELECT 단지번호, 관리번호, 우편번호, 도로명주소");
		sb.append(" FROM jb_dabang.단지주소");

		//@formatter:off
		try (Connection conn = getConnection();
				var stmt = conn.createStatement( 
						ResultSet.TYPE_SCROLL_INSENSITIVE,
						ResultSet.CONCUR_UPDATABLE)) {

			ResultSet rs = stmt.executeQuery(sb.toString());
			
			while (rs.next()) {
				int zipcode = rs.getInt("우편번호");
				if (zipcode == 0) {
					rs.updateInt("우편번호", 10000);
					rs.updateRow();
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static String getAddressOutput(ResultSet rs) 
			throws SQLException {
		// 1. (우:12345) 서울 .... 번지, 해뜨는집
		var sb = new StringBuilder("" + rs.getRow());
		
		sb.append(". (우:");	
		sb.append(rs.getString("우편번호"));
		sb.append(") ");	
		sb.append(rs.getString("도로명주소"));
		sb.append(", ");	
		sb.append(rs.getString("상세주소"));
		
		return sb.toString();
	}

	public static void main(String[] args) {
		navigateCustomerAddress(4);
	}
}
