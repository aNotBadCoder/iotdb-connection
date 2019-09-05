package iotdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 用于连接数据库
 * @author aybco
 *
 */
public class JdbcUtil {
	
	//加载iotdb jdbc驱动
	static {
		try {
			Class.forName("org.apache.iotdb.jdbc.IoTDBDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	

	public static  Connection getIoTDBConnection() {
		
		Connection connection = null;
//		
//		
//		try {
//			connection = 	DriverManager.getConnection("jdbc:iotdb://10.12.20.122:6667/", "root", "root");
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
		return connection;
	}
	
	
	public static void main(String[] args) throws SQLException {
		
		System.out.println("what");
		
//		System.out.println("iotc:");
//		Connection iotc = getIoTDBConnection();
//		
//		System.out.println("iotc:"+iotc);
//	
//		Statement statement = null;
//		try {
//			 statement = iotc.createStatement();
//			
//			 boolean execute = statement.execute("set storage group to root.baic.plc1.robot");
//			 System.out.println(execute);
//			 
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}finally {
//			if(statement!=null) {
//				statement.close();
//			}
//			if(iotc!=null) {
//				iotc.close();
//			}
//		}
		
		
	//	System.out.println(getIoTDBConnection());
		
		
		
		
	}
	
	

}
