package com.demo;

public class YouTubeVideo extends Video {

	public YouTubeVideo(VideoProcessor videoProcessor) {
		super(videoProcessor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void play(String videoFile) {
		processor.process(videoFile);
		
	}

}
