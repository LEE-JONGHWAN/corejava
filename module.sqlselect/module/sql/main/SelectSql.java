package module.sql.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectSql {
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
		sb.append(" SELECT 고.고객SN, 주소번호, 우편번호, 도로명주소, 상세주소 ");
		sb.append(" FROM 고객주소 고 ");
		sb.append(" join 단지주소 단 on 단.단지번호 = 고.단지번호 "); 
		sb.append(" where 고객SN = ?");
		
		
		try(Connection conn = getConnection();
				var pstmt = conn.prepareStatement(sb.toString())){
			pstmt.setInt(1, 고객SN);

			boolean updatable =
					conn.getMetaData().supportsResultSetType(
							ResultSet.CONCUR_READ_ONLY);
			updatable =
				conn.getMetaData().supportsResultSetType(
						ResultSet.TYPE_SCROLL_SENSITIVE);
			
			var rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString("주소번호"));
			}

			///
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		navigateCustomerAddress(4);
		
	}
}