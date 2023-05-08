package structural.composite;

import java.util.ArrayList;
import java.util.List;

/*Complex component*/
public class Playlist implements SongComponent {

  private final List<SongComponent> components = new ArrayList<>();
  private final String playlistName;

  public Playlist(String playlistName, SongComponent... songComponents) {
    this.playlistName = playlistName;
    for (SongComponent s : songComponents) {
      add(s);
    }
  }

  public void add(SongComponent s) {
    components.add(s);
  }

  public void remove(SongComponent s) {
    components.remove(s);
  }

  @Override
  public void play() {
    System.out.println("Playing playlist:" + playlistName);
    for (SongComponent component : components) {
      component.play();
    }
  }
}
