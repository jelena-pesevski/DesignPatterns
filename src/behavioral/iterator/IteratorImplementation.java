package behavioral.iterator;

public class IteratorImplementation implements Iterator {

  private Playlist playlist;
  private int currPosition;

  public IteratorImplementation(Playlist playlist) {
    this.playlist = playlist;
  }

  @Override
  public boolean hasNext() {
    return currPosition < playlist.getSongs().size();
  }

  @Override
  public Song next() {
    if (!hasNext()) {
      return null;
    }

    Song song = playlist.getSongs().get(currPosition);
    currPosition++;
    return song;
  }
}
