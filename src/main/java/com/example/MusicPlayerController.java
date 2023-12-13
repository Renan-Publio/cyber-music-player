package com.example;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class MusicPlayerController {

  private MusicList musicList;
  private Music currentMusic;

  public MusicPlayerController(MusicList musicList) {
    this.musicList = musicList;
    this.currentMusic = null;
  }

  public void playMusic(String musicName) {
    // Procure a música na lista de músicas
    this.currentMusic = this.musicList.getMusicByName(musicName);

    if (this.currentMusic != null) {
      // Comece a tocar a música atual

      // Crie um Media para a música
      Media media = new Media(currentMusic.getUrl());

      // Crie um MediaPlayer para a música
      MediaPlayer mediaPlayer = new MediaPlayer(media);

      // Inicie a reprodução da música
      mediaPlayer.play();
    } else {
      // Exibir mensagem de erro se a música não for encontrada
      System.out.println("Música '" + musicName + "' não encontrada.");
    }
  }

  public void play() {
    if (currentMusic == null) {
      currentMusic = musicList.getMusic(0);
    }

    // Comece a tocar a música atual
  }

  public void pause() {
    // Pause a música atual
  }

  public void next() {
    // Avançar para a próxima música
  }

  public void previous() {
    // Retroceder para a música anterior
  }

  public void playMusic() {
  }
}