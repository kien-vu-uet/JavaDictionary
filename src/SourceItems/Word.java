package SourceItems;

public class Word {
private String word;
private String meaning;
public void setWord(String w) {
	this.word = w;
}
public String getWord() {
	return this.word;
}
public void setMeanning(String m) {
	this.meaning = m;
}
public String getMeanning() {
	return this.meaning;
}
public Word(String w, String m) {
	this.word = w;
	this.meaning = m;
}
public Word() {
	this.meaning = "";
	this.word = "";
}
public Word(String w) {
	this.word = w;
	this.meaning = "";
}

}

