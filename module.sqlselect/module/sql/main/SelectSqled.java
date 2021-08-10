package module.sql.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class SelectSqled {
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
			
			while(true) {
				
				switch(sc.next()) {
					case "+" :
						if(!rs.next()) {
							System.out.println("더 없음!");
							continue;
						}
						break;
					case "-" :
						if(!rs.previous()) {
							System.out.println("더 없음!");
							continue;
						}
						break;
					case "0" :
						System.out.println("종료!");
						return;
					default :
						break;
				}
				
				var sbuff = new StringBuilder("" + rs.getRow());
				// (우: 12345) 서울 .... 번지, 해뜨는집
				sbuff.append(". (우:");
				sbuff.append(rs.getString("우편번호"));
				sbuff.append(") ");
				sbuff.append(rs.getString("도로명주소"));
				sbuff.append(", ");
				sbuff.append(rs.getString("상세주소"));
				
				System.out.println(sbuff.toString());
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	

	
	public static void main(String[] args) {
		navigateCustomerAddress(4);
		
	}
}