package structural.bridge;

public class Headphones implements AudioOutputDevice{

  @Override
  public void play() {
    System.out.println("Playing on headphones...");
  }
}
