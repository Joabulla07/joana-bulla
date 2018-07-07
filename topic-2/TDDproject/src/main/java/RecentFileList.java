
import java.util.ArrayList;
import java.util.List;


public class RecentFileList {

    private final List<String>files;
    private final int Maxitems;
    
    public RecentFileList(int Maxitems){
        this.files = new ArrayList();
        this.Maxitems = Maxitems;
    }
    
    public RecentFileList(){
        this.files = new ArrayList();
        this.Maxitems = 10;
    }
    
    public boolean add(String filename) {
        if (filename==null){
            return false;
        }
        if(filename.isEmpty()){
            return false;
        }
        //if the filelist already contains the file then
        if(this.files.contains(filename)){
           //put to the begginigng
           this.files.remove(filename);
           this.files.add(0, filename);
           return true;
        }
        
        if(this.files.size() <this.Maxitems){
            //put at position 0
            this.files.add(0, filename);
            return true;
        }
        //otherwise: remove the last and put the item at beginning (shrink)
        this.files.remove(this.files.size() - 1);
        this.files.add(0, filename);
        
        return true;
        
       
    }

    public int size() {
        return this.files.size();
    }
 
    //helper to show items
    public void showfiles() {
        System.out.println("Recent File List (Last opened first):");
        
        this.files.stream().forEach(file -> {
        System.out.println(file);
        });
    }
}
    



