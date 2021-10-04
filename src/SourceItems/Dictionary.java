package SourceItems;
import java.util.List;
import java.util.ArrayList;

//lưu dạng UTF-8
public class Dictionary {
	@SuppressWarnings("unused")
	public List<Word> dict;
	
	@SuppressWarnings("unused")
	private int scale = 0;
	
	public void setScale(int scl) {
		this.scale = scl;
	}
	
	public int getScale() {
		return this.scale;
	}
	
	public Dictionary(int scl) {
		this.scale = scl;
		this.dict = new ArrayList<>();
	}
	
	public Dictionary() {
		this.scale = 2000;
		this.dict = new ArrayList<>();
	}
	
	public void addWord(String w, String m, String t) {
		// maintain later.
	}
	
	public void searchWord(String w) {
		for (int i = 0; i < dict.size(); ++i) {
			if (w.equals(dict.get(i).getWord())) {
				System.out.println("The Meaning of [" + w + "] is: [" + dict.get(i).getMeaning() + "].");
				return;
			}
		}
		System.out.println("Not Found");
	}
}

