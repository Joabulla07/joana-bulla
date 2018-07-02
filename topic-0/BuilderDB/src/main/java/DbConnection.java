public class DbConnection {

	private final String host;
	private final String user;
	private final String password;
	private final String dbName;
	private final String dbMotor;
	
	private DbConnection(DbConnectionBuilder builder){
		this.dbMotor = builder.dbMotor;
		this.dbName = builder.dbName;
		this.host = builder.host;
		this.user = builder.user;
		this.password = builder.password;		
	}
	
	public String getHost(){
		return host;
	}
	
	public String getUser(){
		return user;
	}
	
	public String getPassword(){
		return password;
	}

	public String getDbName(){
		return dbName;
	}
	
	public String getDbMotor(){
		return dbMotor;
	}	
	
	@Override
	public String toString(){
		return "Connection: "+this.dbMotor+", "+this.dbName+", " + this.user + ", "+this.password;
	}
	
	
	public static class DbConnectionBuilder
	{
		private final String host;
		private final String user;
		private final String password;
		private final String dbName;
		private final String dbMotor;
	
		public DbConnectionBuilder(String host, String user, String password, String dbName, String dbMotor){
		this.dbMotor = dbMotor;
		this.dbName = dbName;
		this.host = host;
		this.user = user;
		this.password = password;
		}
	}
}