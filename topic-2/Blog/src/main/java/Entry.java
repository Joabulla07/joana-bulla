


public class Entry {
    private int id;
    private String name;
    private static int IDGenerator=0;
    
    public Entry(String name){
        this.id= IDGenerator++;
        this.name=name;
    }
    
    public void setID (int id){
	this.id= id;
    }
    
    public void setName (String name){
        this.name=name;
    }
    
    public int getEntryid() {
        return this.id;
    }
    
    public String getName (){
        return this.name;
    }
    
}


