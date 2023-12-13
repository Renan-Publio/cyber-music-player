package com.example;

public class MusicPlayerUI {

  private MusicPlayerController controller;

  public MusicPlayerUI(MusicPlayerController controller) {
    this.controller = controller;
  }

  // Crie a interface gráfica de usuário

  public void playMusic() {
    // Chama o método playMusic() do controller
    this.controller.playMusic();
  }
}