
public class DataBaseConnection {
    private final String url;
    private final String user;
    private final String password;
    
    public DataBaseConnection(String url, String user, String password){
        this.url= url;
        this. user= user;
        this.password=password;
    }
    public static class builder {
        private String url;
        private String user;
        private String password;
        
        public builder setUrl(String url){
            this.url=url;
            return this;
        }
        public builder setUser(String user){
            this.user=user;
            return this;
        }
        public builder setPassword(String password){
            this.password=password;
            return this;
        }
        
        public DataBaseConnection build(){
            return new DataBaseConnection(url, user, password);
        }
    }
}
