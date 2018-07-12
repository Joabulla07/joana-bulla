import java.util.LinkedList;
import java.util.List;


public class Blog {
private Entry entry;
	private List<Entry> entryList;
	
	public void newList(){
		entryList =new LinkedList<Entry>(); //list of blog post
	}
	public int getsize(){
           return entryList.size();
        }
        
	public int newPost (Entry e){
        entryList.add(e);
        return getsize();
	}
	
	public int deletePost (int id){ 
		entryList.remove(id);
		return getsize();
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
