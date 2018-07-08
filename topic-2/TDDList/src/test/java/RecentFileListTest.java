
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RecentFileListTest {
	
	private RecentFileList recentFileList;
	private NewFile file;

	@Before
	public void setUp() {
		recentFileList = new RecentFileList();
	}
	
	@Test
         //"when program runs for first time is empty"
	public void FirstTime(){
		assertTrue(recentFileList.isEmpty());
	}
	
	@Test
        //when File Is Open Add It To The List
	public void AddToTheList(){
		file = new NewFile();
		file.add(recentFileList);		
		assertTrue(recentFileList.getList().contains(file));
	}
	
	@Test
        //when A File Is Open If Exists Bump It To The Top
	public void FileIsOpen(){
	 for(int i=0; i<5; i++)
	 {
		 file = new NewFile();
		 recentFileList.addFile(file);
	 }
	 int amountFiles = recentFileList.getList().size();
	 
	 NewFile newFile = recentFileList.getList().get(4);
	 
	 recentFileList.addFile(newFile);
	 
	 assertEquals(amountFiles, recentFileList.getList().size());
	 
	}
	
	@Test
        //when List Is Full Delete Oldest File
	public void DeleteOldestFile(){
		for(int i = 0; i < RecentFileList.getMaxAmount(); i++){
			file = new NewFile();
			file.add(recentFileList);
		}
		
		NewFile oldestFile = recentFileList.getList().get(0);
		file = new NewFile();
		file.add(recentFileList);
		assertFalse(recentFileList.getList().contains(oldestFile));
	}
	
	@Test
        //when The RecentFile Is Full The Old File Is Removed
	public void Removed(){
		file = new NewFile();
		//file.ad
	}

	@After
	public void tearDown() throws Exception {
	}

}