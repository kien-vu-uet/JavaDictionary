package SourceItems;

public class Word {
private String word;
private String meaning;
private String type;
// lưu dạng UTF-8
public void setWord(String w) {
	this.word = w;
}

public String getWord() {
	return this.word;
}

public void setMeaning(String m) {
	this.meaning = m;
}

public String getMeaning() {
	return this.meaning;
}

public void setType(String t) {
	this.type = t;
}

public String getType() {
	return this.type;
}

public Word(String w, String m, String t) {
	this.word = w;
	this.meaning = m;
	this.type = t;
}

public Word() {
	this.meaning = "";
	this.word = "";
	this.type = "";
}

public Word(String w) {
	this.word = w;
	this.meaning = "";
	this.type = "";
}
}

