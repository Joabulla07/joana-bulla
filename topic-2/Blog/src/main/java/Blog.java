
import java.util.LinkedList;
import java.util.List;


public class Blog {
private Entry entry;
	private List<Entry> entryList;
	
	public void newList(){
		entryList =new LinkedList<Entry>(); //list of blog post
	}
	
	public boolean newPost (Entry entry){
        entryList.add(entry); 
		return true;
	}
	
	public boolean deletePost (int id){ 
		entryList.remove(id);
		return true;
	}
	
	public List<Entry> recentEntries (){
		List<Entry> recentList;
		recentList =new LinkedList<Entry>();
		for (int i=0;i<10;i++){
			entry=entryList.get(entryList.size()-i);
			recentList.add(entry);
			entry.getEntryid();
			System.out.print("name: "+entry.getName()+"id: "+entry.getEntryid());
			if (entryList.size()-i<0){
				break;
			}
		}
		return recentList;
	}
}
