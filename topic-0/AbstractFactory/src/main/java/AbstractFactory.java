public abstract class AbstractFactory {

	public DatabaseConnectionFactory getDbConnectionFactory(){
		DatabaseConnectionFactory dbConnectionFactory = new DatabaseConnectionFactory();
		return dbConnectionFactory;
		
	}
}