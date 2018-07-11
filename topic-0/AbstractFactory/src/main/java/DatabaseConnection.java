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

//tiene que haber una UNICA factory que se llame DatabaseFactory
//que herede el AbstractFactory, las unicas concretas son las de las BD (MySQL,Oracle, etc)
//las clases de las BD heredan de DBConnection 