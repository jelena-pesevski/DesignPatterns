package structural.bridge;

public class FLACPlayer implements AudioPlayer{

  private final AudioOutputDevice audioOutputDevice;

  public FLACPlayer(AudioOutputDevice audioOutputDevice) {
    this.audioOutputDevice = audioOutputDevice;
  }

  @Override
  public void play() {
    audioOutputDevice.play();
    System.out.println("Playing FLAC...");
  }
}
