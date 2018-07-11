public class MySQLConnection extends DatabaseConnection {

	public MySQLConnection() {
		// TODO Auto-generated constructor stub
		super(DatabaseMotor.MYSQL);
		construct();
	}

	@Override
	public void construct() {
		// TODO Auto-generated method stub
		System.out.println("Getting a MySQL Database Connection");

	}

}