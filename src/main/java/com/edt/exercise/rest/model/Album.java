package com.edt.exercise.rest.model;

public class Album {
	Integer albumId;
	String albumTitle;
	String artist;
	Integer numTracks;

	public Album() {
	}
	
	public Album(int albumId, String albumTitle, String artist, int numTracks) {
		super();
		this.albumId = albumId;
		this.albumTitle = albumTitle;
		this.artist = artist;
		this.numTracks = numTracks;
	}
	
	public Integer getAlbumId() {
		return albumId;
	}
	public void setAlbumId(Integer albumId) {
		this.albumId = albumId;
	}
	public String getAlbumTitle() {
		return albumTitle;
	}
	public void setAlbumTitle(String albumTitle) {
		this.albumTitle = albumTitle;
	}
	public String getAlbumArtist() {
		return artist;
	}
	public void setAlbumArtist(String artist) {
		this.artist = artist;
	}
	public Integer getNumTracks() {
		return numTracks;
	}
	public void setNumTracks(Integer numTracks) {
		this.numTracks = numTracks;
	}
}
