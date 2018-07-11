import java.sql.Connection;
import java.sql.DriverManager;

public class MySQLConnection {
	public static String host = "localhost";
	public static String user = "admin";
	public static String password = "admin";
	public static String dbName = "mysqlDB";
	private String dbDriver = "com.mysql.jdbc.Driver";
	private Connection connection;
	
	public MySQLConnection(){
		try{
			Class.forName(dbDriver);
			connection = null;
		} catch (Exception e){}
	}
	
	public Connection getConnection(){
		try{
			if(connection == null || connection.isClosed()){
				connection = DriverManager.getConnection("jdbc:mysql://" + host + "/" + dbName, user, password);
			}
		} catch (Exception e){}
		return connection;
	}
	
	public void closeConnection(){
		try{
			if(!connection.isClosed()){
				connection.close();
			}
		} catch (Exception e){}
	}

}