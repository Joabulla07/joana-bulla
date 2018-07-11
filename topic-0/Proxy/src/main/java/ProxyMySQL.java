import java.sql.Connection;

public class ProxyMySQL implements Proxy {

	
        @Override
	public Connection getConnection() {
		
		return null;
	}
        @Override
        public void closeConnection() {
        }

}