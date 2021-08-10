package module.sql.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class SelectSql2 {
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
				var pstmt = conn.prepareStatement(sb.toString(),
						ResultSet.TYPE_SCROLL_INSENSITIVE);  // 인자 추가
				var sc = new Scanner(System.in)) {
			
			pstmt.setInt(1, 고객SN);
			
			var rs = pstmt.executeQuery();
			
				System.out.print("+(전진) -(후진) 0(중단) : ");
			
			while(rs.next()) {
				System.out.println(rs.getString("상세주소"));
				
				switch(sc.next()) {
					case "+" :
						System.out.println("전진");
						break;
					case "-" :
						System.out.println("후진");
						break;
					case "0" :
						System.out.println("종료!");
						break;
					default :
						break;
				}
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