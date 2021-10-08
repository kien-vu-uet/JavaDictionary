package SourceItems;
import java.util.List;
import java.util.ArrayList;

//lưu dạng UTF-8
public class Dictionary {
	
	public static List<Word> dictionary = new ArrayList<>();
	
	public static void addWord(Word w) {
		dictionary.add(w);
	}
}

