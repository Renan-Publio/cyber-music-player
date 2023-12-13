package com.example;

import java.util.ArrayList;
import java.util.List;

public class MusicList {

  private final List<Music> musics = new ArrayList<>();

  public MusicList() {
  }

  public void addMusic(Music music) {
    musics.add(music);
  }

  public Music getMusic(int index) {
    return musics.get(index);
  }

  public List<Music> getMusics() {
    return new ArrayList<>(musics); // retorna uma cópia da lista
  }

  public Music getMusicByName(String musicName) {
    return null;
  }
}