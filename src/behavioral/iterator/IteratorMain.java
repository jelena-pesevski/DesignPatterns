package behavioral.iterator;

public class IteratorMain {

  public static void main(String[] args) {
    Playlist playlist = new Playlist();
    playlist.addSong(new Song("title1", "artist1", 4));
    playlist.addSong(new Song("title2", "artist2", 5));
    playlist.addSong(new Song("title3", "artist3", 6));
    playlist.addSong(new Song("title4", "artist4", 2));

    System.out.println("Starting playlist...");

    Iterator iterator = playlist.iterator();
    while (iterator.hasNext()) {
      Song s = iterator.next();
      System.out.printf("Playing song: %s\n", s.getTitle());
    }
  }
}
