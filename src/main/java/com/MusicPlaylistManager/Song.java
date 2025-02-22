package com.MusicPlaylistManager;

public class Song {
	private String title;
	private String artist;
	private double duration;
	
	public Song(String title, String artist, double duration) {
		super();
		this.title = title;
		this.artist = artist;
		this.duration = duration;
	}
	public String getTitle() {
		return title;
	}
	public String getArtist() {
		return artist;
	}
	public double getDuration() {
		return duration;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public void setDuration(double duration) {
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "Song [title=" + title + ", artist=" + artist + ", duration=" + duration + "]";
	}
	
}
