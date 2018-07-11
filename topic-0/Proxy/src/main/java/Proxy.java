import java.sql.Connection;

public interface Proxy {
	public Connection getConnection(); 
	public void closeConnection();
}	
