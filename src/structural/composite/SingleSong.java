package structural.composite;

/*Simple component*/
public class SingleSong implements SongComponent {

  private final String name;

  public SingleSong(String name) {
    this.name = name;
  }

  @Override
  public void play() {
    System.out.println("Playing song:" + name);
  }
}
