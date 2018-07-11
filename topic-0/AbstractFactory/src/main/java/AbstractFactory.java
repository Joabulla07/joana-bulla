public abstract class AbstractFactory {
//no estoy muuuy segura de esto, creo que está mal.
	
	public DatabaseConnectionFactory getDbConnectionFactory(){
		DatabaseConnectionFactory dbConnectionFactory = new DatabaseConnectionFactory();
		return dbConnectionFactory;
		
	}
}