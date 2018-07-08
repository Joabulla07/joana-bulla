
import java.util.LinkedList;

public class RecentFileList {
	
	private LinkedList<NewFile> fileList = new LinkedList<NewFile>();
	private static int maxAmount = 15;
	
	public boolean isEmpty(){
		if(fileList.size()==0){
			return true;
		}
		else return false;
	}
	
	public LinkedList<NewFile> getList(){
		return fileList;
	}
	public void addFile(NewFile file){
		if(fileList.contains(file)){
			fileList.remove(file);
		} else if(fileList.size() == maxAmount){
			fileList.removeFirst();
		}
		fileList.add(file);
	}
	
	public static int getMaxAmount(){
		return maxAmount;
	}
	

}