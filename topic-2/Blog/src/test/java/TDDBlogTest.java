

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
		Entry entry1=new Entry("jose",123);
		b.newPost(entry1);
		Entry entry2=new Entry("luis",456);
		b.newPost(entry2);
		Entry entry3=new Entry("pedro",789);
		b.newPost(entry3);
                Entry entry4=new Entry("maria",333);
		b.newPost(entry4);
                Entry entry5=new Entry("josua",444);
		b.newPost(entry5);
                Entry entry6=new Entry("teo",555);
		b.newPost(entry6);
                Entry entry7=new Entry("carlos",666);
		b.newPost(entry7);
                Entry entry8=new Entry("alejandro",777);
		b.newPost(entry8);
                Entry entry9=new Entry("joaquin",888);
		b.newPost(entry9);
                Entry entry10=new Entry("fiorella",999);
		b.newPost(entry10);
                Entry entry11=new Entry("juana",111);
		b.newPost(entry11);
                
                
    }
    @Test
    public void PostNewEntry (){  
                Entry e=new Entry("pepe",002);
		b.newPost(e);
                assertEquals(12, b.getsize()); 
    }

    @Test
    public void DeleteEntry (){
        int n = b.getsize();
        b.deletePost(e.getEntryid());
        assertEquals( n-1,b.getsize() ); 
    
}
   
        @Test
	public void Showten (){
		List<Entry> recentList;
		recentList=b.recentEntries();
		assertEquals(10,recentList.size());
   
}
}
   
   
