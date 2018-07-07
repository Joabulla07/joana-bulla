
import com.sun.org.glassfish.gmbal.Description;
import java.util.List;
import static org.junit.Assert.*;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


public class TTDTest extends RecentFileList{
    
    @Autowired
    private List<String>ListToTest;
    
    @Test
    public void contextload() {
  }
    @Test
   public void firstTest (){
 
  RecentFileList rfl = new RecentFileList();
  assertNotNull(rfl);
  
  assertTrue(rfl.add(null)==false);
  assertTrue(rfl.add("")==false );
  
   // it is empty?
  assertTrue(rfl.size()==0);
  
  //add a filename (simulation of OPEN command)
  assertTrue(rfl.add("/home/joanna/1.txt")==true);
  assertTrue(rfl.size() == 1);
 
  rfl.showfiles();
   }
   
   @Test
   @Description("Full behaviour test")
   public void fullBehaviourTest() {
      RecentFileList rfl = new RecentFileList(5); 
      this.ListToTest.stream().forEach((file)-> {
          System.out.println("\n" + file + "opened?" + rfl.add(file));
          rfl.showfiles();
      });
}
}
