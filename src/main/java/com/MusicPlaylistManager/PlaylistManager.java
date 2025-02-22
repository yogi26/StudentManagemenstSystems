package com.MusicPlaylistManager;

import java.util.ArrayList;
import java.util.Collections;

/*
Assignment 1: Music Playlist Manager
Requirements:
1. Create a class Song (title, artist, duration)
2. Implement a PlaylistManager class with following ArrayList operations:
   - Add songs to the playlist (both at end and at specific position)
   - Remove songs (by index and by song name)
   - Shuffle the playlist (randomly reorder songs)
   - Sort songs (by title, by artist, by duration)
   - Find all songs by a specific artist
   - Create a subplaylist of songs with duration less than X minutes
   - Merge two playlists without duplicates
   - Find duplicate songs in the playlist
*/

public class PlaylistManager {
	private ArrayList<Song> playlist;
	private ArrayList<Song> shortPlaylist;
	
	public PlaylistManager() {
		playlist=new ArrayList();
		shortPlaylist=new ArrayList();
	}
	public void addSongToPlaylist(Song s) {
		playlist.add(s);
	}
	public void addSongToPlaylist(Song s, int index) {
		playlist.add(index,s);
	}
	public void removeSong(int index) {
		playlist.remove(index);
	}
	public void removeSong(String name) {
		for(Song song:playlist) {
			if(song.getTitle().equals(name)) {
				playlist.remove(song);
			}
		}
	}
	public void shufflePlaylist() {
		Collections.shuffle(playlist);
	}
	public Song searchSong(String artist) {
		for(Song song:playlist) {
			if(song.getArtist().equals(artist)) {
				return song;
			}
		}
		return null;
	}
	public void sortSongs() {
		
	}
	public ArrayList<Song> createSubPlaylist(){
		for(Song song:playlist) {
			if(song.getDuration()<10) {
				shortPlaylist.add(song);
			}
		}
		return shortPlaylist;
	}
	public void mergePlaylist() {
		//Collections.addAll(playlist, shortPlaylist);
	}
	public void showPlaylist() {
		for(Song song:playlist) {
			System.out.println(song);
		}
	}
}
