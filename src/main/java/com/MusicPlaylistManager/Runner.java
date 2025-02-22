package com.MusicPlaylistManager;

public class Runner {
	public static void main(String[] args) {
		Song song1=new Song("Bandeya","Arijit",4);
		Song song2=new Song("O Mahi","Arijit",5);
		Song song3=new Song("Ankhon mein","KK",5);
		Song song4=new Song("Meri Maa","KK",11);
		Song song5=new Song("Jhalakh","Himesh",8);
		
		PlaylistManager manager=new PlaylistManager();
		
		manager.addSongToPlaylist(song1);
		manager.addSongToPlaylist(song2, 1);
		manager.addSongToPlaylist(song3,2);
		manager.addSongToPlaylist(song4);
		manager.addSongToPlaylist(song5);
		
		System.out.println("All songs added");
		manager.showPlaylist();
		
		System.out.println("Shongs after shuffle");
		manager.shufflePlaylist();
		manager.showPlaylist();
		
		manager.removeSong("Jhalakh");
		manager.showPlaylist();
	}
}
