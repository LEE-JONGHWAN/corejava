package module.sql.main;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

public class RunBatchFever {
	
	int method() throws SQLException {
		//@formatter:off
		String insSql = "insert into newtable(memo) values (?)";
		
		try(Connection conn = ConnectDB.getConnection("betterdb");
				var pstat = conn.prepareStatement(null)){
			
			// 화요일 밤의 열기 삽입 => batch
			String[] plans = {"화요일 밤의 열기", "토요일 밤의 열기"};
			
			
			for(String plan : plans) {
				pstat.setString(1, plan);
				pstat.addBatch();
			}
			int[] rowCounts = pstat.executeBatch();
				System.out.println(Arrays.toString(rowCounts));
				
				} catch (SQLException e) {
					e.printStackTrace();
				}
				return 0;
	}
	public static void main(String[] args) throws SQLException{
		var autoGen = new RunBatchFever();
		System.out.println("자동 생성 키:" + autoGen.method());
	}
	
}
