
public class FactoryPatternDemo {

 public static void main(String[] args) {
     ConnectionFactory connectionfactory = new ConnectionFactory();
     
     connection conn1 = connectionfactory.getMySqlConnection("MySql");
     conn1.connect();
     
     PostgreSqlConnection conn2 = connectionfactory.PostgreSqlConnection("PostgreSql");
     conn2.connect();
     
 }
     

    
   }   

