package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class IoTDBTest {
	
	public static void main(String[] args) throws SQLException {
		Connection connection = null;
		Statement statement = null;
		try {
			Class.forName("org.apache.iotdb.jdbc.IoTDBDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		try {
			connection = 	DriverManager.getConnection("jdbc:iotdb://10.12.20.122:6667/", "root", "root");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		try {
			 statement = connection.createStatement();
			
			 boolean execute = statement.execute("set storage group to root.baic.plc5.robot");
			 
			 if(execute==false) {
				 System.out.println("执行成功");
			 }else {
				 System.out.println("执行失败");
			 }
			 
			 
			 System.out.println(execute);
			 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			System.out.println("关闭连接");
			  if (statement != null) statement.close();
	            if (connection != null) connection.close();
		}
		
	
	}
	

}
