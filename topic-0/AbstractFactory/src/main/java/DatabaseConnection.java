public abstract class DatabaseConnection {
	
	private DatabaseMotor motor = null;
	
	public DatabaseConnection(DatabaseMotor motor){
		this.motor = motor;
	}
	
	public DatabaseMotor getMotor(){
		return this.motor;
	}
	
	public void setDatabaseMotor(DatabaseMotor motor){
		this.motor = motor;
	}
	
	public abstract void construct();

}
