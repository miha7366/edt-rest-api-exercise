package com.edt.exercise.rest.model;

public class Track {
	Integer trackId;
	String trackTitle;
	String artist;
	Integer albumId;

	public Track() {
	}
	
	public Track(int trackId, String trackTitle) {
		super();
		this.trackId = trackId;
		this.trackTitle = trackTitle;
	}
	
	public Integer getTrackId() {
		return trackId;
	}
	public void setTrackId(Integer trackId) {
		this.trackId = trackId;
	}
	public String getTrackTitle() {
		return trackTitle;
	}
	public void setTrackTitle(String trackTitle) {
		this.trackTitle = trackTitle;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public Integer getAlbumId() {
		return albumId;
	}
	public void setAlbumId(Integer albumId) {
		this.albumId = albumId;
	}
	
}
