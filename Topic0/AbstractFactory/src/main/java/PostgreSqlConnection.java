
import java.sql.Connection;

public abstract class PostgreSqlConnection implements Connection {

	public void connect() {
		System.out.println("Connecting to PostgreSQL...");
	}

}
