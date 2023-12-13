app.post('/play', (req, res) => {
  // Obtém o índice da música do usuário
  const index = req.body.index;

  // Chama o método playMusic() da classe MusicPlayer
  MusicPlayer.playMusic(index);

  // Responde com sucesso
  res.status(200).send();
});

app.get(Endpoints.musics, (req, res) => {
  const musicList = MusicPlayer.getMusicList();
  res.json(musicList);
});

app.post(Endpoints.pause, (req, res) => {
  MusicPlayer.pauseMusic();
  res.status(200).send();
});

app.post(Endpoints.next, (req, res) => {
  MusicPlayer.nextMusic();
  res.status(200).send();
});

app.post(Endpoints.previous, (req, res) => {
  MusicPlayer.previousMusic();
  res.status(200).send();
});

app.post(Endpoints.volume, (req, res) => {
  const volume = req.body.volume;
  MusicPlayer.setVolume(volume);
  res.status(200).send();
});

class Endpoints {
  static musics = '/musics';
  static play = '/play';
  static pause = '/pause';
  static next = '/next';
  static previous = '/previous';
  static volume = '/volume';
}
