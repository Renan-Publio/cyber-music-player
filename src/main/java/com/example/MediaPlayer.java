package com.example;

import java.util.ArrayList;
import java.util.List;

public class MediaPlayer {

  private List<Music> musicList;

  public MediaPlayer() {
    musicList = new ArrayList<>();
    musicList.add(new Music("Música 1", "Artista 1", null));
    musicList.add(new Music("Música 2", "Artista 2", null));
    musicList.add(new Music("Música 3", "Artista 3", null, null));
  }

  public List<Music> getMusicList() {
    return musicList;
  }

  public void playMusic(int index) {
    Music music = musicList.get(index);
    System.out.println("Reproduzindo música: " + music.getTitle());
  }

  public void pauseMusic() {
    System.out.println("Pausando música.");
  }

  public void nextMusic() {
    int currentMusicIndex = musicList.indexOf(getCurrentMusic());
    int nextMusicIndex = (currentMusicIndex + 1) % musicList.size();
    playMusic(nextMusicIndex);
  }

  public void previousMusic() {
    int currentMusicIndex = musicList.indexOf(getCurrentMusic());
    int previousMusicIndex = (currentMusicIndex - 1 + musicList.size()) % musicList.size();
    playMusic(previousMusicIndex);
  }

  public void setVolume(int volume) {
    System.out.println("Ajustando volume para: " + volume);
  }

  private Music getCurrentMusic() {
    return musicList.get(musicList.indexOf(getCurrentMusic()));
  }
}