
public class Databaseconnection extends BuilderPatternDemo{
    private String Username="user";
    private String pass="passw";
    
    public Databaseconnection(String Username, String pass) {
        
        this.Username = Username;
        this.pass = pass;
   
    }

    public static class Builder {
        private String Username;
        private String pass;
       

        public Builder setUsername(String Username) {
            this.Username = Username;
            return this;
        }

        public Builder setpass(String pass) {
            this.pass = pass;
            return this;
        }

       public Databaseconnection builder(){
          return new Databaseconnection(Username, pass);
       }
    }
}