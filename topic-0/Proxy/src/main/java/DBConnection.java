import java.sql.Connection;

public interface DBConnection {
	public Connection getConnection(); 
	public void closeConnection();
}	
