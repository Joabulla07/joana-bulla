

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;


public class TDDBlogTest {
  private Blog b;
  private Entry e;
  
    
    @Before 
    public void setUpBlog() throws Exception{
		b= new Blog();
		Entry entry1=new Entry("jj j");
		b.newPost(entry1);
		Entry entry2=new Entry("luis");
		b.newPost(entry2);
		Entry entry3=new Entry("pedro");
		b.newPost(entry3);
    }
   
    
    @Test
    public void PostNewEntry (){  
                Entry e=new Entry("jhghj");
		b.newPost(e);
                assertTrue(b.newPost(e));
    }

    @Test
    public void DeleteEntry (){
        Entry e=new Entry ("joanna");
        b.deletePost(e.getEntryid());
        assertTrue(b.deletePost(e.getEntryid()));
    
}
   
        @Test
	public void Showten (){
		List<Entry> recentList;
		recentList=b.recentEntries();
		assertEquals(10,recentList.size());
                

    
}
}
   
   
