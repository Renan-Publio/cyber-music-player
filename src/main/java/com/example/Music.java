package com.example;

public class Music {
  private String title;
  private String artist;
  private String path;

  public Music(String title, String artist, String path) {
    this.title = title;
    this.artist = artist;
    this.path = path;
  }

  public Music(String string, String string2, Object object, Object object2) {
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getArtist() {
    return artist;
  }

  public void setArtist(String artist) {
    this.artist = artist;
  }

  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public String getUrl() {
    return null;
  }

}
