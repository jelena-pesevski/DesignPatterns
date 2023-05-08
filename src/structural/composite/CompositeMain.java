package structural.composite;

public class CompositeMain {

  public static void main(String[] args) {
    SongComponent song = new SingleSong("single song 1");

    SongComponent playlist = new Playlist("daily mix", new SingleSong("playlist song 1"),
        new SingleSong("playlist song 2"));

    SongComponent playlistMax = new Playlist("my album", song, playlist);

    playlistMax.play();
  }
}
