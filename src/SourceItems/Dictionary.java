package SourceItems;

public class Dictionary {
	@SuppressWarnings("unused")
	private Word [] dict;
	
	@SuppressWarnings("unused")
	private int scale = 0;
	
	public void setScale(int scl) {
		this.scale = scl;
	}
	
	public Dictionary(int scl) {
		this.scale = scl;
		this.dict = new Word[scl];
	}
	
	public Dictionary() {
		this.scale = 1000;
		this.dict = new Word[1000];
	}
	
	public void addWord(String w,String m) {
		
	}
	
	public Word searchWord(String w) {
		
		
		
		return new Word("Not Found");
	}
}

