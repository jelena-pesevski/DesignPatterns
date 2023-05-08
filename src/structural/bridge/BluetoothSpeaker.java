package structural.bridge;

public class BluetoothSpeaker implements AudioOutputDevice{

  @Override
  public void play() {
    System.out.println("Playing on bluetooth speaker...");
  }
}
