public class OracleConnection extends DatabaseConnection {

	public OracleConnection() {
		// TODO Auto-generated constructor stub
		super(DatabaseMotor.ORACLE);
		construct();
	}

	@Override
	public void construct() {
		// TODO Auto-generated method stub
		System.out.println("Getting an Oracle Database Connection");

	}

}