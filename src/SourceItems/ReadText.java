package SourceItems;

import com.sun.speech.freetts.VoiceManager;

public class ReadText {

	public static void speech(String text) {
		VoiceManager voiceManager = VoiceManager.getInstance();
		// gọi đến giọng của thằng có tên là kevin 16, có thằng khác tên là kevin và một thằng tên
		// là anna hay gì gì đó, tôi đọc trên tuts mà quên mất rồi ??
		com.sun.speech.freetts.Voice syntheticVoice = voiceManager.getVoice("kevin16");
		syntheticVoice.allocate();
		syntheticVoice.speak(text);
		syntheticVoice.deallocate();
	}
}
