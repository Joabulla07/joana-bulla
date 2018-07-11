public class DatabaseConnectionFactory extends AbstractFactory {

    public static DatabaseConnection getConnection(DatabaseMotor motor){
	DatabaseConnection connection = null;
	if(motor.equals("MYSQL"))connection = new MySQLConnection();
	else if(motor.equals("ORACLE")) connection = new OracleConnection();
	return connection;
	}
}