package module.sql.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;

public class TryBookPriceUpdate {
	public static Connection getConnection(String database) {
		Connection conn = null;
		String userName = "myself";
		String password = "1234";
		String url = "jdbc:mariadb://localhost:3306/"
						+ database;
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
	
   public static void main(String[] args) {
//	   Random r = new Random();
//	   var sql1 = new StringBuilder(
//			   "update books set price = price * 1110.0 ");
//			   sql1.append(""+r.nextInt(40000) + 20000);
//	   		   sql1.append("where price > 0");
	    String sql1 = "update books set price = price * 1.0 "
	    			+ "where price > 50";		
	   	String sql2 = "update books set price = 0"
	   				+ "where price < 30000";
	   try(Connection conn = getConnection("corejava")){
			   conn.setAutoCommit(false);
		try(Statement stmt = conn.createStatement()) {
		   stmt.executeUpdate(sql1);
		   stmt.executeUpdate(sql2);
		   conn.commit();
	   } catch(SQLException e) {
		   e.printStackTrace();
	   }
		   } catch(SQLException e) {
			   e.printStackTrace();
		   }
	   
	   return;
   }
}
