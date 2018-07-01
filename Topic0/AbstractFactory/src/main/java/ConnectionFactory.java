public class ConnectionFactory implements ConnectionAbstractFactory{
	

    public connection getConnection(String nombre) {
        if(nombre==null){
            return null;
        }
        else if(nombre.equalsIgnoreCase("MySql")){
            return new MySqlConnection();
        }   
        else if(nombre.equalsIgnoreCase("PostgreSqlConnection")){
            return new PostgreSqlConnection();
        }
        return null;
        
        
        
    }
}
    