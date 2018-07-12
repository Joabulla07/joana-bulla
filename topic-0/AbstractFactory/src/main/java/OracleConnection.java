public class OracleConnection extends DatabaseConnection {

	public OracleConnection() {
		super(DatabaseMotor.ORACLE);
		construct();
	}

	@Override
	public void construct() {
		System.out.println("Getting an Oracle Database Connection");

	}

}