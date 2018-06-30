
import java.sql.Connection;

public abstract class MySqlConnection implements Connection {

	public void connect() {
		System.out.println("Connecting to MySQL...");
	}

}