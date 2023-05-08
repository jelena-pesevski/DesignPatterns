package structural.bridge;

public class WAVPlayer implements AudioPlayer{

  private final AudioOutputDevice audioOutputDevice;

  public WAVPlayer(AudioOutputDevice audioOutputDevice) {
    this.audioOutputDevice = audioOutputDevice;
  }

  @Override
  public void play() {
    audioOutputDevice.play();
    System.out.println("Playing WAV...");
  }
}
